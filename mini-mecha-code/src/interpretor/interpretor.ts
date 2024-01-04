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
  Statement,
} from "../language/generated/ast.js";
import { MAX_ITERATIONS } from "../utils/constants.js";
import {
  GET_DISTANCE,
  GET_TIMESTAMP,
  SET_SPEED,
} from "../language/built-in.js";
import { Scene } from "../simulator/scene.js";

export function evaluateEntryFunction(functionDef: DefFunction, scene: Scene) {
  return evaluateFunction(functionDef, new Map(), scene);
}

/**
 * Evaluates a function by evaluating each statement in the function definition.
 *
 * @param {DefFunction} functionDef - The function definition to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings (will be modified).
 * @param {Scene} scene - The scene in which the function is evaluated.
 * @return {number} - The result of the function evaluation.
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
  // handle return value
  if (functionDef.returnValue) {
    return evaluateExpression(functionDef.returnValue, env, scene);
  }
  return 0;
}

/**
 * Evaluates a function call statement.
 *
 * @param {FunctionCall} statement - The function call statement to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the function is evaluated.
 * @return {number} - The result of the function call evaluation.
 */
function evaluateFunctionCall(
  statement: FunctionCall,
  env: Map<string, number>,
  scene: Scene,
): number {
  const functionDef = statement.ref.ref;
  if (!functionDef) {
    throw new Error("Function not found.");
  }

  const args = statement.parameters.map((param) => {
    return evaluateExpression(param, env, scene);
  });

  const newEnv = new Map(env);
  for (let i = 0; i < functionDef.parameters.length; i++) {
    newEnv.set(functionDef.parameters[i].name, args[i]);
  }
  return evaluateFunction(functionDef, newEnv, scene);
}

/**
 * Evaluates a statement.
 *
 * @param {Statement} statement - The statement to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the statement is evaluated.
 */
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
    evaluateFunctionCall(statement, env, scene);
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
    scene.robot.move(value);
    return;
  }

  throw new Error("Not implemented");
}

/**
 * Evaluates a loop statement.
 *
 * @param {Loop} statement - The loop statement to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the loop is evaluated.
 */
function evaluateLoop(statement: Loop, env: Map<string, number>, scene: Scene) {
  let i = 0;
  while (i < MAX_ITERATIONS) {
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

/**
 * Evaluates an expression.
 *
 * @param {Expression} expression - The expression to evaluate.
 * @param {Map<string, number>} env - The environment containing the variable value bindings.
 * @param {Scene} scene - The scene in which the expression is evaluated.
 * @return {number} - The result of the expression evaluation.
 */
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
    return evaluateFunctionCall(expression, env, scene);
  }

  if (isConvertion(expression) || isUnitOperator(expression)) {
    const value = evaluateExpression(expression.left, env, scene);
    switch (expression.unit) {
      case "m":
        return value * 1000;
      case "cm":
        return value * 100;
      case "mm":
        return value; // default unit
      default:
        throw new Error("Not implemented");
    }
  }

  throw new Error("Not implemented");
}

/**
 * Handles the built-in function `getDistance`.
 * @param {Scene} scene - The scene in which the function is evaluated.
 * @return {number} - The distance between the robot and the closest obstacle.
 */
function handleGetDistance(scene: Scene): number {
  console.log(scene.robot.getForwardDist());
  return scene.robot.getForwardDist();
}

/**
 * Handles the built-in function `getTimestamp`.
 * @param {Scene} scene - The scene in which the function is evaluated.
 * @return {number} - The current timestamp.
 */
function handleGetTimestamp(scene: Scene): number {
  return scene.time;
}

/**
 * Handles the built-in function `setSpeed`.
 * @param {Scene} scene - The scene in which the function is evaluated.
 * @param {number} speed - The speed to set.
 * @return {number} - The speed that has been set.
 */
function handleSetSpeed(scene: Scene, speed: number): number {
  return (scene.robot.speed = speed);
}
