import {
  AstNode,
  DefaultWorkspaceManager,
  LangiumDocument,
  LangiumDocumentFactory,
  LangiumSharedServices,
} from "langium";
import { WorkspaceFolder } from "vscode-languageserver";
import { URI } from "vscode-uri";
import { builtInMiniMechaCode } from "./built-in.js";

export class MiniMechaCodeWorkspaceManager extends DefaultWorkspaceManager {
  private documentFactory: LangiumDocumentFactory;

  constructor(services: LangiumSharedServices) {
    super(services);
    this.documentFactory = services.workspace.LangiumDocumentFactory;
  }

  protected override async loadAdditionalDocuments(
    folders: WorkspaceFolder[],
    collector: (document: LangiumDocument<AstNode>) => void,
  ): Promise<void> {
    await super.loadAdditionalDocuments(folders, collector);
    // Load our library using the `builtin` URI schema
    collector(
      this.documentFactory.fromString(
        builtInMiniMechaCode,
        URI.parse("builtin:///library.hello"),
      ),
    );
  }
}
