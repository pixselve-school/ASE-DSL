import type {ValidationAcceptor, ValidationChecks} from 'langium';
import type {
    DefFunction,
    DefVariable,
    FunctionCall,
    MiniMechaCodeAstType,
    Model,
    RefVariable, VarAssignment
} from './generated/ast.js';
import type { MiniMechaCodeServices } from './mini-mecha-code-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: MiniMechaCodeServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.MiniMechaCodeValidator;
    const checks: ValidationChecks<MiniMechaCodeAstType> = {
        // Person: validator.checkPersonStartsWithCapital
        RefVariable: validator.checkRefVariableIsUsingDefinedVariable,
        DefVariable: validator.checkDefVariableIsNotAlreadyDefined
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeValidator {

    checkDefVariableIsNotAlreadyDefined(defVariable: DefVariable, accept: ValidationAcceptor): void {

    }

    checkRefVariableIsUsingDefinedVariable(refVariables: RefVariable, accept: ValidationAcceptor): void {
    }

    checkFunctionCallIsUsingDefinedFunction(functionCall: FunctionCall, accept: ValidationAcceptor): void {

    }

    checkModelHasOnlyFunctionDefinition(model: Model, accept: ValidationAcceptor): void {

    }

    checkFunctionAreOnlyDeclaredInModel(functionDef: DefFunction, accept: ValidationAcceptor): void {

    }

    checkFunctionIsNotAlreadyDefined(functionDef: DefFunction, accept: ValidationAcceptor): void {

    }

    checkThatAllFunctionParametersAreUnique(functionDef: DefFunction, accept: ValidationAcceptor): void {

    }

    checkThatDefVariableIsUsingTheCorrectType(defVariable: DefVariable, accept: ValidationAcceptor): void {

    }

    checkThatFunctionCallIsUsingCorrectType(functionCall: FunctionCall, accept: ValidationAcceptor): void {

    }

    checkThatFunctionCallIsUsingCorrectNumberOfParameters(functionCall: FunctionCall, accept: ValidationAcceptor): void {

    }

    checkThatVariableAssignmentIsUsingCorrectType(varAssignment: VarAssignment, accept: ValidationAcceptor): void {

    }


    checkThatConversionAreUsingCorrectType(varAssignment: VarAssignment, accept: ValidationAcceptor): void {

    }

    checkThatForwardIsUsingCorrectType(varAssignment: VarAssignment, accept: ValidationAcceptor): void {

    }

    checkThatClockIsUsingCorrectType(varAssignment: VarAssignment, accept: ValidationAcceptor): void {

    }





}
