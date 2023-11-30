import {
  DefFunction,
  Expression,
  isAnd,
  isBooleanLitteral,
  isDefVariable,
  isDiv,
  isEqual,
  isForward,
  isFunctionCall,
  isGreater,
  isLess,
  isMinus,
  isMulti,
  isNot,
  isNumberLitteral,
  isOr,
  isPlus,
  isRefVariable,
  isRotate,
  isVarAssignment,
  Model,
  Statement,
} from "../language/generated/ast.js";
import { ENTRY_FUNCTION_NAME } from "../utils/constants.js";

/**
 * Generates simple commands.
 * @param model Model to generate commands from
 * @returns Generated commands
 */
export function generateMiniMechaCodeCmds(model: Model): Object[] {
  return generateStatements(model.functions);
}

function generateStatements(stmts: DefFunction[]): Object[] {
  // find the entry function
  const entryFunction = stmts.find((func) => {
    return func.name === ENTRY_FUNCTION_NAME;
  });

  // if there is no entry function, throw an error
  if (!entryFunction) {
    throw new Error("No entry function found.");
  }

  // generate commands for the entry function (the entry function returns void)
  return evaluateEntryFunction(entryFunction);
}

function evaluateEntryFunction(functionDef: DefFunction): Object[] {
  return evaluateFunction(functionDef, new Map()).cmds;
}

/**
 * Evaluates a function by evaluating each statement in the function definition.
 *
 * @param {DefFunction} functionDef - The function definition to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings (will be modified).
 * @return {Object} - An object with two properties: cmds and return.
 *                   The cmds property is an array of objects representing the evaluated statements.
 *                   The return property is the return value of the function, which is currently undefined.
 */
function evaluateFunction(
  functionDef: DefFunction,
  env: Map<string, number>,
): {
  cmds: Object[];
  return: number | undefined;
} {
  let cmds: Object[] = [];

  // evaluate each statement in the function
  for (const stmt of functionDef.statements) {
    cmds = cmds.concat(evaluateStatement(stmt, env));
  }

  return {
    cmds,
    return: undefined,
  };
}

function evaluateStatement(
  statement: Statement,
  env: Map<string, number>,
): Object[] {
  if (isDefVariable(statement)) {
    const { value, cmds } = evaluateExpression(statement.value!, env);
    env.set(statement.name, value ?? 0);
    return cmds;
  }

  if (isFunctionCall(statement)) {
    const { cmds } = evaluateExpression(statement, env);
    return cmds;
  }

  if (isRotate(statement)) {
    const { value, cmds } = evaluateExpression(statement.angle!, env);
    return [...cmds, { type: "rotate", value: value ?? 0 }];
  }

  if (isForward(statement)) {
    const { value, cmds } = evaluateExpression(statement.distance!, env);
    return [...cmds, { type: "forward", value: value ?? 0 }];
  }

  if (isVarAssignment(statement)) {
    const { value, cmds } = evaluateExpression(statement.value!, env);
    env.set(statement.ref.ref!.name, value ?? 0);
    return cmds;
  }

  throw new Error("Not implemented");
}

function evaluateExpression(
  expression: Expression,
  env: Map<string, number>,
): {
  cmds: Object[];
  value: number | undefined;
} {
  if (isMinus(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: left.cmds.concat(right.cmds),
      value: left.value! - right.value!,
    };
  }
  if (isPlus(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! + right.value!,
    };
  }
  if (isMulti(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! * right.value!,
    };
  }
  if (isDiv(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! / right.value!,
    };
  }

  if (isGreater(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! > right.value! ? 1 : 0,
    };
  }

  if (isLess(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! < right.value! ? 1 : 0,
    };
  }

  if (isEqual(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! === right.value! ? 1 : 0,
    };
  }

  if (isOr(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! || right.value! ? 1 : 0,
    };
  }

  if (isAnd(expression)) {
    const left = evaluateExpression(expression.left, env);
    const right = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds, ...right.cmds],
      value: left.value! && right.value! ? 1 : 0,
    };
  }

  if (isNot(expression)) {
    const left = evaluateExpression(expression.right, env);
    return {
      cmds: [...left.cmds],
      value: left.value! ? 0 : 1,
    };
  }

  if (isNumberLitteral(expression)) {
    return {
      cmds: [],
      value: expression.value,
    };
  }

  if (isBooleanLitteral(expression)) {
    return {
      cmds: [],
      value: expression.value ? 1 : 0,
    };
  }

  if (isRefVariable(expression)) {
    return {
      cmds: [],
      value: env.get(expression.ref.ref!.name)!,
    };
  }

  if (isFunctionCall(expression)) {
    const functionDef = expression.ref.ref;
    if (!functionDef) {
      throw new Error("Function not found.");
    }

    const args = expression.parameters.map((param) => {
      return evaluateExpression(param, env);
    });

    let cmds: Object[] = [];
    const newEnv = new Map(env);
    for (let i = 0; i < functionDef.parameters.length; i++) {
      cmds = [...cmds, ...args[i].cmds];
      newEnv.set(functionDef.parameters[i].name, args[i].value ?? 0);
    }

    const result = evaluateFunction(functionDef, newEnv);
    return {
      cmds: [...cmds, ...result.cmds],
      value: result.return,
    };
  }

  throw new Error("Not implemented");
}
