import { parse } from "https://cdn.jsdelivr.net/npm/flatted@3.2.9/+esm";
import monarchSyntax from "../syntaxes/mini-mecha-code.monarch.js";
import {
  addMonacoStyles,
  defineUserServices,
  MonacoEditorLanguageClientWrapper,
} from "./bundle/index.js";
import { configureWorker } from "./setup.js";

addMonacoStyles("monaco-editor-styles");

const code = `let void entry () {
  var number count = 0
  setSpeed(10)
  loop count < 4
  {	
      Forward 3000
      Clock 90

      count = count + 1
  }
  Clock 180
  Forward 1500
  count = 0
  loop count < 20
  {	
      Forward 400
      Clock 18
      count = count + 1
  }
}
`;

export const setupConfigClassic = () => {
  return {
    wrapperConfig: {
      serviceConfig: defineUserServices(),
      editorAppConfig: {
        $type: "classic",
        languageId: "mini-mecha-code",
        code: code,
        useDiffEditor: false,
        languageExtensionConfig: { id: "langium" },
        languageDef: monarchSyntax,
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

const setupSimulator = (scene) => {
  const noScene = document.getElementById("no-scene");
  noScene.style.display = "none";

  window.scene = scene;

  scene.entities.forEach((entity) => {
    if (entity.type === "Wall") {
      window.entities.push(
        new Wall(entity.pos.x, entity.pos.y, entity.size.x, entity.size.y),
      );
    }
    if (entity.type === "Block") {
      window.entities.push(
        new Wall(entity.pos.x, entity.pos.y, entity.size.x, entity.size.y),
      );
    }
  });

  window.p5robot = new Robot(
    scene.robot.pos.x,
    scene.robot.pos.y,
    scene.robot.size.x,
    scene.robot.size.y,
    scene.robot.rad,
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
