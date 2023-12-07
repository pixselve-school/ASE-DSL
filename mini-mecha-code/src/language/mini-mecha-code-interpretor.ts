import type { ValidationAcceptor, ValidationChecks } from "langium";
import {
  type MiniMechaCodeAstType,
  Model,
} from "./generated/ast.js";
import type { MiniMechaCodeServices } from "./mini-mecha-code-module.js";
import {BaseScene, Scene} from "../simulator/scene.js";

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
    Model: [sceneWrapper(validator.test)],
  };

  registry.register(checks, validator);
  return scene;
}

/**
 * Implementation of custom validations.
 */
export class MiniMechaCodeInterpretor {
  test(
      defVariable: Model,
      accept: ValidationAcceptor,
      scene: Scene
  ) {
    console.log("test")
    scene.robot.move(200);
    console.log(scene)

  }
}
