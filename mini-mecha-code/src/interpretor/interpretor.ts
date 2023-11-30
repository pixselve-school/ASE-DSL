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
  isLoop,
  isMinus,
  isMulti,
  isNot,
  isNumberLitteral,
  isOr,
  isPlus,
  isRefVariable,
  isRotate,
  isVarAssignment,
  Loop,
  Model,
  Statement,
} from "../language/generated/ast.js";
import { BaseScene, Scene } from "../web/simulator/scene.js";
import { ENTRY_FUNCTION_NAME, MAX_ITERATIONS } from "../utils/constants.js";
import {
  GET_DISTANCE,
  GET_TIMESTAMP,
  SET_SPEED,
} from "../language/built-in.js";

export function interpretMiniMechaCode(model: Model): Scene {
  const scene = new BaseScene();

  // find the entry function
  const entryFunction = model.functions.find((func) => {
    return func.name === ENTRY_FUNCTION_NAME;
  });

  // if there is no entry function, throw an error
  if (!entryFunction) {
    throw new Error("No entry function found.");
  }

  evaluateEntryFunction(entryFunction, scene);

  return scene;
}

function evaluateEntryFunction(functionDef: DefFunction, scene: Scene) {
  return evaluateFunction(functionDef, new Map(), scene);
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
  scene: Scene,
): number {
  // handle built-in functions
  if (functionDef.name === GET_DISTANCE) return handleGetDistance(scene);
  if (functionDef.name === GET_TIMESTAMP) return handleGetTimestamp(scene);
  if (functionDef.name === SET_SPEED)
    return handleSetSpeed(scene, env.get("speed") ?? 0);

  // evaluate each statement in the function
  for (const stmt of functionDef.statements) {
    evaluateStatement(stmt, env, scene);
  }

  return 0;
}

function evaluateStatement(
  statement: Statement,
  env: Map<string, number>,
  scene: Scene,
) {
  if (isDefVariable(statement)) {
    const value = evaluateExpression(statement.value!, env, scene);
    env.set(statement.name, value ?? 0);
    return;
  }

  if (isFunctionCall(statement)) {
    evaluateFunction(statement.ref.ref!, env, scene);
    return;
  }

  if (isVarAssignment(statement)) {
    const value = evaluateExpression(statement.value!, env, scene);
    env.set(statement.ref.ref!.name, value ?? 0);
    return;
  }

  if (isLoop(statement)) {
    evaluateLoop(statement, new Map(env), scene);
    return;
  }

  if (isRotate(statement)) {
    const value = evaluateExpression(statement.angle!, env, scene);
    scene.robot.turn(value);
    return;
  }

  if (isForward(statement)) {
    const value = evaluateExpression(statement.distance!, env, scene);
    console.log("forward", value);
    scene.robot.move(value);
    return;
  }

  throw new Error("Not implemented");
}

function evaluateLoop(statement: Loop, env: Map<string, number>, scene: Scene) {
  console.log("evaluateLoop");
  let i = 0;
  while (i < MAX_ITERATIONS) {
    console.log("evaluateLoop", i);
    i++;
    const condition = evaluateExpression(statement.condition, env, scene);
    if (!condition) {
      break;
    }
    for (const stmt of statement.statements) {
      evaluateStatement(stmt, env, scene);
    }
  }
  if (i === MAX_ITERATIONS) {
    throw new Error(`Max iterations (${MAX_ITERATIONS}) reached.`);
  }
}

function evaluateExpression(
  expression: Expression,
  env: Map<string, number>,
  scene: Scene,
): number {
  if (isMinus(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left - right;
  }
  if (isPlus(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left + right;
  }
  if (isMulti(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left * right;
  }
  if (isDiv(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left / right;
  }

  if (isGreater(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left > right ? 1 : 0;
  }

  if (isLess(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left < right ? 1 : 0;
  }

  if (isEqual(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left === right ? 1 : 0;
  }

  if (isOr(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left || right ? 1 : 0;
  }

  if (isAnd(expression)) {
    const left = evaluateExpression(expression.left, env, scene);
    const right = evaluateExpression(expression.right, env, scene);
    return left && right ? 1 : 0;
  }

  if (isNot(expression)) {
    const left = evaluateExpression(expression.right, env, scene);
    return !left ? 1 : 0;
  }

  if (isNumberLitteral(expression)) {
    return expression.value;
  }

  if (isBooleanLitteral(expression)) {
    return expression.value ? 1 : 0;
  }

  if (isRefVariable(expression)) {
    return env.get(expression.ref.ref!.name)!;
  }

  if (isFunctionCall(expression)) {
    const functionDef = expression.ref.ref;
    if (!functionDef) {
      throw new Error("Function not found.");
    }

    const args = expression.parameters.map((param) => {
      return evaluateExpression(param, env, scene);
    });

    const newEnv = new Map(env);
    for (let i = 0; i < functionDef.parameters.length; i++) {
      newEnv.set(functionDef.parameters[i].name, args[i]);
    }

    return evaluateFunction(functionDef, newEnv, scene);
  }

  throw new Error("Not implemented");
}

function handleGetDistance(scene: Scene): number {
  return 0;
}

function handleGetTimestamp(scene: Scene): number {
  return scene.time;
}

function handleSetSpeed(scene: Scene, speed: number): number {
  return (scene.robot.speed = speed);
}
