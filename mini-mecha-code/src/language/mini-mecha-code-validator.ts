import type { ValidationAcceptor, ValidationChecks } from "langium";
import {
  type DefFunction,
  type DefVariable,
  type FunctionCall,
  FunctionParameter,
  Loop,
  type MiniMechaCodeAstType,
  Model,
  type VarAssignment,
} from "./generated/ast.js";
import type { MiniMechaCodeServices } from "./mini-mecha-code-module.js";
import getModel from "../utils/getModel.js";
import { isDefFunction, isDefVariable, isLoop } from "./generated/ast.js";
import { ENTRY_FUNCTION_NAME } from "../utils/constants.js";

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: MiniMechaCodeServices) {
  const registry = services.validation.ValidationRegistry;
  const validator = services.validation.MiniMechaCodeValidator;
  const checks: ValidationChecks<MiniMechaCodeAstType> = {
    DefVariable: validator.checkDefVariableIsNotAlreadyDefined,
    DefFunction: validator.checkFunctionIsNotAlreadyDefined,
    FunctionParameter: validator.checkThatAllFunctionParametersAreUnique,
    Model: validator.checkThatTheProgramHasAnEntryFunction,
  };
  registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeValidator {
  /**
   * Check if the given `defVariable` is not already defined.
   *
   * @param {DefVariable} defVariable - The variable to be checked.
   * @param {ValidationAcceptor} accept - The validation acceptor.
   * @return {void}
   */
  checkDefVariableIsNotAlreadyDefined(
    defVariable: DefVariable,
    accept: ValidationAcceptor,
  ): void {
    const parent = defVariable.$container;

    if (isLoop(parent)) {
      const loop = parent as Loop;
      for (let statement of loop.statements) {
        if (statement === defVariable) {
          break;
        }
        if (isDefVariable(statement)) {
          const defVar = statement as DefVariable;
          if (defVar.name === defVariable.name) {
            accept(
              "error",
              `Cannot redeclare block-scoped variable ${defVariable.name}.`,
              {
                code: "variable.alreadyDefined",
                node: defVariable,
                property: "name",
              },
            );
          }
        }
      }
      return;
    }
    if (isDefFunction(parent)) {
      const functionDef = parent as DefFunction;
      if (
        functionDef.parameters.find((param) => param.name === defVariable.name)
      ) {
        accept("error", `Duplicated identifier ${defVariable.name}.`, {
          code: "variable.alreadyDefined",
          node: defVariable,
          property: "name",
        });
      }
      for (let statement of functionDef.statements) {
        if (statement === defVariable) {
          break;
        }
        if (isDefVariable(statement)) {
          const defVar = statement as DefVariable;
          if (defVar.name === defVariable.name) {
            accept(
              "error",
              `Cannot redeclare block-scoped variable ${defVariable.name}.`,
              {
                code: "variable.alreadyDefined",
                node: defVariable,
                property: "name",
              },
            );
          }
        }
      }
      return;
    }
    return;
  }

  /**
   * Checks if a function is not already defined.
   *
   * @param {DefFunction} functionDef - The function definition to check.
   * @param {ValidationAcceptor} accept - The validation acceptor.
   * @returns {void}
   */
  checkFunctionIsNotAlreadyDefined(
    functionDef: DefFunction,
    accept: ValidationAcceptor,
  ): void {
    const model = getModel(functionDef.$container);
    if (!model) {
      return;
    }
    for (let statement of model.statements) {
      if (statement === functionDef) {
        break;
      }
      if (isDefFunction(statement)) {
        const defFunction = statement as DefFunction;
        if (defFunction.name === functionDef.name) {
          accept("error", `Cannot redeclare function ${functionDef.name}.`, {
            code: "function.alreadyDefined",
            node: functionDef,
            property: "name",
          });
        }
      }
    }
  }

  /**
   * Checks if all function parameters are unique.
   *
   * @param {FunctionParameter} parameter - The parameter to check.
   * @param {ValidationAcceptor} accept - The validation acceptor to report errors.
   * @returns {void}
   */
  checkThatAllFunctionParametersAreUnique(
    parameter: FunctionParameter,
    accept: ValidationAcceptor,
  ): void {
    const functionDef = parameter.$container;
    if (!isDefFunction(functionDef)) {
      return;
    }
    const parameters = functionDef.parameters;
    for (let parameterInLoop of parameters) {
      if (parameterInLoop === parameter) {
        break;
      }
      if (parameterInLoop.name === parameter.name) {
        accept("error", `Duplicated identifier ${parameter.name}.`, {
          code: "parameter.alreadyDefined",
          node: parameter,
          property: "name",
        });
      }
    }
  }

  /**
   * Checks that the program has an entry function.
   *
   * @param {Model} model - The program model.
   * @param {ValidationAcceptor} accept - The validation acceptor.
   * @return {void}
   */
  checkThatTheProgramHasAnEntryFunction(
    model: Model,
    accept: ValidationAcceptor,
  ): void {
    const entryFunction = model.statements.find((statement) => {
      if (isDefFunction(statement)) {
        const defFunction = statement as DefFunction;
        return defFunction.name === ENTRY_FUNCTION_NAME;
      }
      return false;
    });
    if (!entryFunction) {
      accept("error", `The program must have an entry function.`, {
        code: "function.entryMissing",
        node: model,
        property: "statements",
      });
    }
  }

  checkThatDefVariableIsUsingTheCorrectType(
    defVariable: DefVariable,
    accept: ValidationAcceptor,
  ): void {}

  checkThatFunctionCallIsUsingCorrectType(
    functionCall: FunctionCall,
    accept: ValidationAcceptor,
  ): void {}

  checkThatFunctionCallIsUsingCorrectNumberOfParameters(
    functionCall: FunctionCall,
    accept: ValidationAcceptor,
  ): void {
    const model = getModel(functionCall.$container);
    if (!model) {
      accept("error", "Function call is not inside a model", {
        node: functionCall,
        property: "name",
      });
    }
  }

  checkThatVariableAssignmentIsUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor,
  ): void {}

  checkThatConversionAreUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor,
  ): void {}

  checkThatForwardIsUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor,
  ): void {}

  checkThatClockIsUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor,
  ): void {}
}
