import { stringify } from 'flatted';
import { DocumentState, EmptyFileSystem, startLanguageServer } from "langium";
import { NotificationType } from "vscode-languageserver";
import {
  BrowserMessageReader,
  BrowserMessageWriter,
  Diagnostic,
  createConnection,
} from "vscode-languageserver/browser.js";
import { createMiniMechaCodeServices } from "./mini-mecha-code-module.js";

declare const self: DedicatedWorkerGlobalScope;

const messageReader = new BrowserMessageReader(self);
const messageWriter = new BrowserMessageWriter(self);

const connection = createConnection(messageReader, messageWriter);

const { shared, scene } = createMiniMechaCodeServices({
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
  "browser/DocumentChange"
);
// listen on fully validated documents
shared.workspace.DocumentBuilder.onBuildPhase(
  DocumentState.Validated,
  async (documents) => {
    // perform this for every validated document in this build phase batch
    console.log("validated", scene);
    for (const document of documents) {
      // send the notification for this validated document,
      // with the serialized AST + generated commands as the content
      await connection.sendNotification(documentChangeNotification, {
        uri: document.uri.toString(),
        content: stringify(scene),
        diagnostics: document.diagnostics ?? [],
      });
    }
  }
);
