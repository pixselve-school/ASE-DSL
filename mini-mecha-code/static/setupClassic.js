import { parse } from "https://cdn.jsdelivr.net/npm/flatted@3.2.9/+esm";
import monarchSyntax from "../syntaxes/mini-mecha-code.monarch.js";
import {
  addMonacoStyles,
  defineUserServices,
  MonacoEditorLanguageClientWrapper,
} from "./bundle/index.js";
import { configureWorker } from "./setup.js";
import { scripts } from "./demoScripts.js";

addMonacoStyles("monaco-editor-styles");

export const setupConfigClassic = () => {
  const extensionFilesOrContents = new Map();
  const languageConfigUrl = new URL(
    "../language-configuration.json",
    window.location.href
  );
  const textmateConfigUrl = new URL(
    "../syntaxes/mini-mecha-code.tmLanguage.json",
    window.location.href
  );
  extensionFilesOrContents.set(
    "/language-configuration.json",
    languageConfigUrl
  );
  extensionFilesOrContents.set(
    "/mini-mecha-code-grammar.json",
    textmateConfigUrl
  );

  let code = scripts[window.selectedScript];
  if (!code) {
    code = Object.values(scripts)[0];
  }

  return {
    wrapperConfig: {
      serviceConfig: defineUserServices(),
      editorAppConfig: {
        $type: "extended",
        languageId: "mini-mecha-code",
        code: code,
        useDiffEditor: false,
        extensions: [
          {
            config: {
              name: "mini-mecha-code-web",
              publisher: "generator-langium",
              version: "1.0.0",
              engines: {
                vscode: "*",
              },
              contributes: {
                languages: [
                  {
                    id: "mini-mecha-code",
                    extensions: [".mini"],
                    configuration: "./language-configuration.json",
                  },
                ],
                grammars: [
                  {
                    language: "mini-mecha-code",
                    scopeName: "source.mini-mecha-code",
                    path: "./mini-mecha-code-grammar.json",
                  },
                ],
              },
            },
            filesOrContents: extensionFilesOrContents,
          },
        ],
        editorOptions: {
          "semanticHighlighting.enabled": true,
          theme: "vs-dark",
          minimap: {
            enabled: false,
          },
          // this change default padding for the editor
          padding: {
            top: 16,
            bottom: 16,
          },
          // this change default font size for the editor
          fontSize: 20,
        },
      },
    },
    languageClientConfig: configureWorker(),
  };
};

export const executeClassic = async (htmlElement) => {
  const userConfig = setupConfigClassic();
  const wrapper = new MonacoEditorLanguageClientWrapper();
  await wrapper.start(userConfig, htmlElement);
  window.editor = wrapper.getEditor();
  // get the language client
  const client = wrapper.getLanguageClient();
  if (!client) {
    throw new Error("Unable to obtain language client!");
  }

  // listen for document change notifications
  client.onNotification("browser/DocumentChange", onDocumentChange);
  function onDocumentChange(message) {
    window.execute = () => {
      const content = parse(message.content);
      console.log(content);
      setupSimulator(content);
    };
  }
};

window.execute = () => {
  console.log("No code to execute");
};

window.setScript = (scriptId) => {
  window.selectedScript = scriptId;

  let code = scripts[window.selectedScript];
  if (!code) {
    code = Object.values(scripts)[0];
  }
  const editor = window.editor;
  editor.setValue(code);
};

const setupSimulator = (scene) => {
  const noScene = document.getElementById("no-scene");
  const timeline = document.getElementById("timeline");
  const tips = document.getElementById("tips");
  noScene.style.display = "none";
  timeline.style.display = "flex";
  tips.style.display = "flex";

  window.scene = scene;

  scene.entities.forEach((entity) => {
    if (entity.type === "Wall") {
      window.entities.push(
        new Wall(entity.pos.x, entity.pos.y, entity.size.x, entity.size.y)
      );
    }
    if (entity.type === "Block") {
      window.entities.push(
        new Wall(entity.pos.x, entity.pos.y, entity.size.x, entity.size.y)
      );
    }
  });

  window.p5robot = new Robot(
    scene.robot.pos.x,
    scene.robot.pos.y,
    scene.robot.size.x,
    scene.robot.size.y,
    scene.robot.rad
  );

  // SETUP ZOOM AND PANNING

  let zoom = 0.05;
  window.zoom = zoom;

  // zoom on scroll
  window.addEventListener("wheel", (e) => {
    const oldZoom = zoom;
    if (e.deltaY > 0) {
      zoom *= 0.8;
    } else {
      zoom *= 1.2;
    }
    window.zoom = zoom;
  });

  let offset = { x: scene.size.x / 2 + 100, y: scene.size.y / 2 + 100 };
  window.offset = offset;

  // pan on drag
  let isDragging = false;
  let lastMouseX = 0;
  let lastMouseY = 0;

  const simulator = document.getElementById("simulator");
  simulator.addEventListener("mousedown", (e) => {
    isDragging = true;
    lastMouseX = e.clientX;
    lastMouseY = e.clientY;
  });

  simulator.addEventListener("mouseup", (e) => {
    isDragging = false;
  });

  simulator.addEventListener("mouseleave", (e) => {
    isDragging = false;
  });

  simulator.addEventListener("mousemove", (e) => {
    if (isDragging) {
      offset.x += e.clientX - lastMouseX;
      offset.y += e.clientY - lastMouseY;
      lastMouseX = e.clientX;
      lastMouseY = e.clientY;
      window.offset = offset;
    }
  });

  // SETUP SLIDER
  const slider = document.getElementById("time-slider");
  const finalTimestamp =
    window.scene.timestamps[window.scene.timestamps.length - 1];
  slider.max = finalTimestamp.time;
  slider.oninput = (e) => {
    window.time = Number(e.target.value);
    window.pause = true;
    window.scene.timestamps.forEach((timestamp, i) => {
      if (timestamp.time <= window.time) {
        window.lastTimestamp = i;
      }
    });
    updateSliderIcons();
    draw();
  };
  const playIcon = document.getElementById("play-button");
  const pauseIcon = document.getElementById("pause-button");
  playIcon.onclick = () => {
    window.pause = false;
    updateSliderIcons();
  };
  pauseIcon.onclick = () => {
    window.pause = true;
    updateSliderIcons();
  };

  window.resetSimulation();
};

function updateSliderIcons() {
  const isPause = window.pause;
  const playIcon = document.getElementById("play-button");
  const pauseIcon = document.getElementById("pause-button");

  if (isPause) {
    playIcon.style.display = "block";
    pauseIcon.style.display = "none";
  } else {
    playIcon.style.display = "none";
    pauseIcon.style.display = "block";
  }
}
