import type { ValidationAcceptor, ValidationChecks } from "langium";
import {
  type DefFunction,
  type DefVariable,
  type FunctionCall,
  FunctionParameter,
  Loop,
  type MiniMechaCodeAstType,
  type Model,
  type RefVariable,
  type VarAssignment,
} from "./generated/ast.js";
import type { MiniMechaCodeServices } from "./mini-mecha-code-module.js";
import getModel from "../utils/getModel.js";
import { isDefFunction, isDefVariable, isLoop } from "./generated/ast.js";

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: MiniMechaCodeServices) {
  const registry = services.validation.ValidationRegistry;
  const validator = services.validation.MiniMechaCodeValidator;
  const checks: ValidationChecks<MiniMechaCodeAstType> = {
    DefVariable: validator.checkDefVariableIsNotAlreadyDefined,
    DefFunction: validator.checkFunctionIsNotAlreadyDefined,
  };
  registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeValidator {
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

  checkThatAllFunctionParametersAreUnique(
    parameter: FunctionParameter,
    accept: ValidationAcceptor,
  ): void {
    const functionDef = parameter.$container;
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
