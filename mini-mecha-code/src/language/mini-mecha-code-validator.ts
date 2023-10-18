import type { ValidationChecks } from 'langium';
import type { MiniMechaCodeAstType } from './generated/ast.js';
import type { MiniMechaCodeServices } from './mini-mecha-code-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: MiniMechaCodeServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.MiniMechaCodeValidator;
    const checks: ValidationChecks<MiniMechaCodeAstType> = {
        // Person: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeValidator {

    // checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
    //     if (person.name) {
    //         const firstChar = person.name.substring(0, 1);
    //         if (firstChar.toUpperCase() !== firstChar) {
    //             accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
    //         }
    //     }
    // }

}
