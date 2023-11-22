import { AstNode } from 'langium';
import { Model, isModel } from '../language/generated/ast.js';

export default function getModel(node: AstNode | undefined): Model | undefined {
    let current: AstNode | undefined = node;
    while (current && !isModel(current)) {
        current = current.$container;
    }
    return current;
}
  