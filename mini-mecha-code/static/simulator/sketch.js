function setup() {
  console.log("🎉 Setting up simulation");
  createCanvas(700, 700, document.getElementById("simulator"));
  window.entities = [];
  window.p5robot = null;
  window.time = 0;
  window.lastTimestamp = 0;
  window.scene = null;
  window.p5robot = new Robot(0, 0);
  window.zoom = 0.01;
  window.path = new Set();
  window.lastPos = null;
  window.offset = { x: 0, y: 0 };
  const noScene = document.getElementById("no-scene");
  const timeline = document.getElementById("timeline");
  const tips = document.getElementById("tips");
  noScene.style.display = "flex";
  timeline.style.display = "none";
  tips.style.display = "none";
}

function draw() {
  if (window.scene === null) return;

  background("#2d2a2e");
  stroke(255);
  strokeWeight(1);

  for (const entity of window.entities) {
    entity.show(window.zoom, window.offset, window.scene.size);
  }

  for (const path of window.path) {
    path.show(window.zoom, window.offset, window.scene.size);
    if (path.lifetime <= 0) {
      window.path.delete(path);
    }
  }

  if (
    window.scene !== null &&
    window.scene.timestamps.length > lastTimestamp + 1
  ) {
    if (window.pause !== true) {
      window.time += deltaTime;
      updateSlider();
    }
    updateRobot();
  }

  if (window.p5robot !== null) {
    window.p5robot.show(window.zoom, window.offset, window.scene.size);
  }
}

function updateSlider() {
  const slider = document.getElementById("time-slider");
  slider.value = window.time;
}

function updateRobot() {
  // add a path point using the robot's position
  if (window.lastPos !== null)
    window.path.add(
      new Path(
        window.lastPos.x,
        window.lastPos.y,
        window.p5robot.x,
        window.p5robot.y
      )
    );
  window.lastPos = { x: window.p5robot.x, y: window.p5robot.y };

  const lastKnownState = window.scene.timestamps[window.lastTimestamp];
  const nextKnownState = window.scene.timestamps[window.lastTimestamp + 1];

  window.p5robot.x = map(
    window.time,
    lastKnownState.time,
    nextKnownState.time,
    lastKnownState.pos.x,
    nextKnownState.pos.x,
    true
  );
  window.p5robot.y = map(
    window.time,
    lastKnownState.time,
    nextKnownState.time,
    lastKnownState.pos.y,
    nextKnownState.pos.y,
    true
  );
  window.p5robot.angle = map(
    window.time,
    lastKnownState.time,
    nextKnownState.time,
    lastKnownState.rad,
    nextKnownState.rad,
    true
  );

  if (window.time >= nextKnownState.time) {
    window.time = nextKnownState.time;
    window.lastTimestamp++;
  }
}

function resetSimulation() {
  console.log("🔁 Resetting simulation");
  window.time = 0;
  window.pause = false;
  window.lastTimestamp = 0;
  window.path = new Set();
  window.lastPos = null;
  window.p5robot.x = 5000;
  window.p5robot.y = 5000;

}

window.setup = setup;
window.resetSimulation = resetSimulation;
