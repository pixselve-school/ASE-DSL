import { DocumentState, EmptyFileSystem, startLanguageServer } from "langium";
import {
  BrowserMessageReader,
  BrowserMessageWriter,
  createConnection,
  Diagnostic,
} from "vscode-languageserver/browser.js";
import { createMiniMechaCodeServices } from "./mini-mecha-code-module.js";
import { NotificationType } from "vscode-languageserver";
import { Model } from "./generated/ast.js";

declare const self: DedicatedWorkerGlobalScope;

const messageReader = new BrowserMessageReader(self);
const messageWriter = new BrowserMessageWriter(self);

const connection = createConnection(messageReader, messageWriter);

const { shared, MiniMechaCode } = createMiniMechaCodeServices({
  connection,
  ...EmptyFileSystem,
});

startLanguageServer(shared);

// Send a notification with the serialized AST after every document change
type DocumentChange = {
  uri: string;
  content: string;
  diagnostics: Diagnostic[];
};
const documentChangeNotification = new NotificationType<DocumentChange>(
  "browser/DocumentChange",
);
// use the built-in AST serializer
const jsonSerializer = MiniMechaCode.serializer.JsonSerializer;
// listen on fully validated documents
shared.workspace.DocumentBuilder.onBuildPhase(
  DocumentState.Validated,
  async (documents) => {
    // perform this for every validated document in this build phase batch
    for (const document of documents) {
      const model = document.parseResult.value as Model;
      // send the notification for this validated document,
      // with the serialized AST + generated commands as the content
      await connection.sendNotification(documentChangeNotification, {
        uri: document.uri.toString(),
        content: jsonSerializer.serialize(model, {
          sourceText: true,
          textRegions: true,
        }),
        diagnostics: document.diagnostics ?? [],
      });
    }
  },
);
