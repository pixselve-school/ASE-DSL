import type { ValidationAcceptor, ValidationChecks } from "langium";
import {
  isModel,
  type DefFunction,
  type DefVariable,
  type FunctionCall,
  type MiniMechaCodeAstType,
  type Model,
  type RefVariable,
  type VarAssignment,
} from "./generated/ast.js";
import type { MiniMechaCodeServices } from "./mini-mecha-code-module.js";
import getModel from "../utils/getModel.js";

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: MiniMechaCodeServices) {
  const registry = services.validation.ValidationRegistry;
  const validator = services.validation.MiniMechaCodeValidator;
  const checks: ValidationChecks<MiniMechaCodeAstType> = {
    // Person: validator.checkPersonStartsWithCapital
    // RefVariable: validator.checkRefVariableIsUsingDefinedVariable,
    // DefVariable: validator.checkDefVariableIsNotAlreadyDefined
  };
  registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeValidator {
  checkDefVariableIsNotAlreadyDefined(
    defVariable: DefVariable,
    accept: ValidationAcceptor
  ): void {}

  checkRefVariableIsUsingDefinedVariable(
    refVariables: RefVariable,
    accept: ValidationAcceptor
  ): void {}

  checkFunctionCallIsUsingDefinedFunction(
    functionCall: FunctionCall,
    accept: ValidationAcceptor
  ): void {}

  checkModelHasOnlyFunctionDefinition(
    model: Model,
    accept: ValidationAcceptor
  ): void {}

  checkFunctionAreOnlyDeclaredInModel(
    functionDef: DefFunction,
    accept: ValidationAcceptor
  ): void {}

  checkFunctionIsNotAlreadyDefined(
    functionDef: DefFunction,
    accept: ValidationAcceptor
  ): void {}

  checkThatAllFunctionParametersAreUnique(
    functionDef: DefFunction,
    accept: ValidationAcceptor
  ): void {
    const names = functionDef.parameters.map((parameter) => parameter.name);
    const uniqueNames = new Set(names);
    if (names.length !== uniqueNames.size) {
      accept("error", "Duplicate parameter with same name", {
        node: functionDef,
        property: "parameters",
      });
    }
  }

  checkThatDefVariableIsUsingTheCorrectType(
    defVariable: DefVariable,
    accept: ValidationAcceptor
  ): void {}

  checkThatFunctionCallIsUsingCorrectType(
    functionCall: FunctionCall,
    accept: ValidationAcceptor
  ): void {}

  checkThatFunctionCallIsUsingCorrectNumberOfParameters(
    functionCall: FunctionCall,
    accept: ValidationAcceptor
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
    accept: ValidationAcceptor
  ): void {}

  checkThatConversionAreUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor
  ): void {}

  checkThatForwardIsUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor
  ): void {}

  checkThatClockIsUsingCorrectType(
    varAssignment: VarAssignment,
    accept: ValidationAcceptor
  ): void {}
}
