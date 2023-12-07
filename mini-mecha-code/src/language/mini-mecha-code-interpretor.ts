import type { ValidationAcceptor, ValidationChecks } from "langium";
import {
  type MiniMechaCodeAstType,
  Model,
} from "./generated/ast.js";
import type { MiniMechaCodeServices } from "./mini-mecha-code-module.js";
import {BaseScene, Scene} from "../simulator/scene.js";
import {evaluateEntryFunction} from "../interpretor/interpretor.js";
import {ENTRY_FUNCTION_NAME} from "../utils/constants.js";

/**
 * Register custom validation checks.
 */
export function weaveAcceptMethods(services: MiniMechaCodeServices): Scene {
  const scene = new BaseScene();
  const registry = services.validation.ValidationRegistry;
  const validator = services.interpretor.MiniMechaCodeInterpretor;

  function sceneWrapper<T>(checkFunction: (a1: T, a2: ValidationAcceptor, a3: Scene) => void) {
    return (node: T, accept: ValidationAcceptor) => {
      checkFunction(node, accept, scene);
    };
  }

  const checks: ValidationChecks<MiniMechaCodeAstType> = {
    Model: [sceneWrapper(validator.visitModel)],
  };

  registry.register(checks, validator);
  return scene;
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeInterpretor {
  visitModel(
      model: Model,
      accept: ValidationAcceptor,
      scene: Scene
  ) {

    // find the entry function
    const entryFunction = model.functions.find((func) => {
      return func.name === ENTRY_FUNCTION_NAME;
    });

    // if there is no entry function, throw an error
    if (!entryFunction) {
      throw new Error("No entry function found.");
    }

    evaluateEntryFunction(entryFunction, scene);
  }
}
