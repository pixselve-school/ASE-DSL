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
        Forward 5
        Clock 90
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
        window.execute = () => {
            const content = parse(message.content);
            console.log(content)
            setupSimulator(content);
        }
    }
};

window.execute = () => {
    console.log("No code to execute")
}



const setupSimulator = (scene) => {
    const wideSide = max(scene.size.x, scene.size.y);
    let factor = 1000 / wideSide;

    window.scene = scene;

    scene.entities.forEach((entity) => {
        if (entity.type === "Wall") {
            window.entities.push(new Wall(
                (entity.pos.x)*factor,
                (entity.pos.y)*factor,
                (entity.size.x)*factor,
                (entity.size.y)*factor
            ));
        }
        if (entity.type === "Block") {
            window.entities.push(new Wall(
                (entity.pos.x)*factor,
                (entity.pos.y)*factor,
                (entity.size.x)*factor,
                (entity.size.y)*factor
            ));
        }
    });

    window.p5robot = new Robot(
        factor,
        scene.robot.pos.x,
        scene.robot.pos.y,
        scene.robot.size.x * factor,
        scene.robot.size.y * factor,
        scene.robot.rad
    );
}
