import {
  DefFunction,
  Expression,
  FunctionCall,
  isAnd,
  isBooleanLitteral,
  isConvertion,
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
  isUnitOperator,
  isVarAssignment,
  Loop,
  Model,
  Statement,
} from "../language/generated/ast.js";
import {
  GET_DISTANCE,
  GET_TIMESTAMP,
  SET_SPEED,
} from "../language/built-in.js";
import stdArduino from "./std-arduino.js";

/**
 * Compiles a model to Arduino code.
 *
 * @param {Model} model - The model to compile.
 * @return {string[]} - The compiled Arduino code.
 */
export default function compileToArduino(model: Model): string[] {
  const result: string[] = [];
  result.push(...stdArduino);

  for (const stmt of model.functions) {
    result.push(...evaluateFunctionDef(stmt));
  }
  result.push("void loop() {");
  // run main function
  result.push("  main();");
  result.push("}");
  return result;
}

function evaluateFunctionDef(functionDef: DefFunction): string[] {
  const result: string[] = [];
  result.push(`float ${functionDef.name}() {`); // TODO: Handle params
  for (const stmt of functionDef.statements) {
    result.push(...evaluateStatement(stmt));
  }
  result.push("}");
  return result;
}

/**
 * Evaluates a loop statement.
 *
 * @param {Loop} statement - The loop statement to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the loop is evaluated.
 */
function evaluateLoop(statement: Loop): string[] {
  const result: string[] = [];
  const condition = evaluateExpression(statement.condition);
  const loopStatements = statement.statements;
  result.push(`while (${condition}) {`);
  for (const stmt of loopStatements) {
    result.push(...evaluateStatement(stmt));
  }
  result.push("}");
  return result;
}

/**
 * Evaluates a statement.
 *
 * @param {Statement} statement - The statement to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the statement is evaluated.
 */
function evaluateStatement(statement: Statement): string[] {
  if (isDefVariable(statement)) {
    if (statement.value === undefined) {
      // value is undefined only when used in a function parameter
      throw new Error(`Variable ${statement.name} not initialized`);
    }
    const value = evaluateExpression(statement.value);
    return [`float ${statement.name} = ${value};`];
  }

  if (isFunctionCall(statement)) {
    return [`${evaluateFunctionCall(statement)};`];
  }

  if (isVarAssignment(statement)) {
    if (statement.ref.ref === undefined) {
      throw new Error(`Variable ${statement.ref.$refText} not found`);
    }
    if (statement.value === undefined) {
      // value is undefined only when used in a function parameter
      throw new Error(`Variable ${statement.ref.ref.name} not initialized`);
    }
    const value = evaluateExpression(statement.value);
    return [`${statement.ref.ref!.name} = ${value};`];
  }

  if (isLoop(statement)) {
    return evaluateLoop(statement);
  }

  if (isRotate(statement)) {
    const value = evaluateExpression(statement.angle);
    return [`rotate(${value});`];
  }

  if (isForward(statement)) {
    const value = evaluateExpression(statement.distance);
    return [`forward(${value});`];
  }

  throw new Error(`Statement ${statement} not implemented`);
}

function evaluateFunctionCall(functionCall: FunctionCall): string {
  if (functionCall.ref.ref === undefined) {
    throw new Error(`Function ${functionCall.ref.$refText} not found`);
  }
  const reference = functionCall.ref.ref;
  if (reference.name === GET_DISTANCE) {
    return "getDistance()";
  }
  if (reference.name === GET_TIMESTAMP) {
    return "getTimestamp()";
  }
  if (reference.name === SET_SPEED) {
    return `setSpeed()`; // TODO: Handle params
  }
  return `${reference.name}()`; // TODO: Handle params
}

/**
 * Evaluates an expression.
 *
 * @param {Expression} expression - The expression to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the expression is evaluated.
 * @return {number} - The result of the expression evaluation.
 */
function evaluateExpression(expression: Expression): string {
  if (isMinus(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} - ${right}`;
  }
  if (isPlus(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} + ${right}`;
  }
  if (isMulti(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} * ${right}`;
  }
  if (isDiv(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} / ${right}`;
  }

  if (isGreater(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} > ${right}`;
  }

  if (isLess(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} < ${right}`;
  }

  if (isEqual(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} == ${right}`;
  }

  if (isOr(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} || ${right}`;
  }

  if (isAnd(expression)) {
    const left = evaluateExpression(expression.left);
    const right = evaluateExpression(expression.right);
    return `${left} && ${right}`;
  }

  if (isNot(expression)) {
    const left = evaluateExpression(expression.right);
    return `!${left}`;
  }

  if (isNumberLitteral(expression)) {
    return expression.value.toString();
  }

  if (isBooleanLitteral(expression)) {
    return expression.value ? "true" : "false";
  }

  if (isRefVariable(expression)) {
    if (expression.ref.ref === undefined) {
      throw new Error(`Variable ${expression.ref.$refText} not found`);
    }
    return expression.ref.ref.name;
  }

  if (isFunctionCall(expression)) {
    return evaluateFunctionCall(expression);
  }

  if (isConvertion(expression) || isUnitOperator(expression)) {
    const value = evaluateExpression(expression.left);
    switch (expression.unit) {
      case "m":
        return `${value} * 1000`;
      case "cm":
        return `${value} * 100`;
      case "mm":
        return value; // default unit
      default:
        throw new Error(`Unit ${expression.unit} not implemented`);
    }
  }

  throw new Error(`Expression ${expression} not implemented`);
}