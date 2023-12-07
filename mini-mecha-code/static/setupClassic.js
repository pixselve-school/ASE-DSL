import { addMonacoStyles, defineUserServices, MonacoEditorLanguageClientWrapper } from './bundle/index.js';
import monarchSyntax from "../syntaxes/mini-mecha-code.monarch.js";
import { configureWorker } from './setup.js';
import {NotificationType} from "vscode-languageserver";
import { parse } from 'flatted';

addMonacoStyles('monaco-editor-styles');

const code = `let void entry () {
    var number count = 0
    loop count < 5
    {	
        setSpeed(500 * (count + 1))
        count = count + 1
    }
}
`

export const setupConfigClassic = () => {
    return {
        wrapperConfig: {
            serviceConfig: defineUserServices(),
            editorAppConfig: {
                $type: 'classic',
                languageId: 'mini-mecha-code',
                code: code,
                useDiffEditor: false,
                languageExtensionConfig: { id: 'langium' },
                languageDef: monarchSyntax,
                editorOptions: {
                    'semanticHighlighting.enabled': true,
                    theme: 'vs-dark'
                }
            }
        },
        languageClientConfig: configureWorker()
    };
};

export const executeClassic = async (htmlElement) => {
    const userConfig = setupConfigClassic();
    const wrapper = new MonacoEditorLanguageClientWrapper();
    await wrapper.start(userConfig, htmlElement);


// get the language client
    const client = wrapper.getLanguageClient();
    if (!client) {
        throw new Error('Unable to obtain language client!');
    }

// listen for document change notifications
    client.onNotification('browser/DocumentChange', onDocumentChange);
    function onDocumentChange(message) {
        const content = parse(message.content);
        
        console.log(content)
    }
};


