import * as Entities from "./entities.js";
import { Vector } from "./utils.js";

export interface Scene {
  size: Vector;
  entities: Entities.Entities[];
  robot: Entities.Robot;
  time: number;
  timestamps: Array<Entities.Timestamp>;

  reset(): void;
}

export class BaseScene {
  size: Vector;
  entities: Entities.Entities[] = [];
  robot: Entities.Robot;
  time: number = 0;
  timestamps: Array<Entities.Timestamp> = [];

  constructor(size: Vector = new Vector(10000, 10000)) {
    this.size = size;
    this.robot = new Entities.Robot(
      this.size.scale(0.5),
      new Vector(250, 250),
      0,
      30,
      this
    );
    this.entities.push(new Entities.Wall(Vector.null(), this.size.projX()));
    this.entities.push(new Entities.Wall(Vector.null(), this.size.projY()));
    this.entities.push(new Entities.Wall(this.size, this.size.projY()));
    this.entities.push(new Entities.Wall(this.size, this.size.projX()));
    this.timestamps.push(new Entities.Timestamp(0, this.robot));
  }

  reset() {
    this.robot = new Entities.Robot(
      this.size.scale(0.5),
      new Vector(250, 250),
      0,
      30,
      this
    );
    this.entities = [];
    const X = this.size.x;
    const Y = this.size.y;
    this.entities.push(new Entities.Wall(Vector.null(), this.size.projX()));
    this.entities.push(new Entities.Wall(Vector.null(), this.size.projY()));
    this.entities.push(new Entities.Wall(this.size, this.size.projY()));
    this.entities.push(new Entities.Wall(this.size, this.size.projX()));
    this.entities.push(
      new Entities.Wall(new Vector(0.4 * X, Y), new Vector(0.2 * X, 0.7 * Y))
    );
    // opposite side :
    this.entities.push(
      new Entities.Wall(new Vector(0.6 * X, 0), new Vector(0.8 * X, 0.3 * Y))
    );
    this.timestamps = [];
    this.timestamps.push(new Entities.Timestamp(0, this.robot));
    this.time = 0;
  }
}

// You can add new Scenes here
