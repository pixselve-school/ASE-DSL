class Robot {
  _x = 0;
  _y = 0;

  constructor(_x = 0, _y = 0, _width = 50, _height = 75, _angle = 0) {
    this._x = _x;
    this._y = _y;
    this.angle = _angle;
    this.width = _width;
    this.height = _height;
  }

  get x() {
    return this._x;
  }

  set x(value) {
    if (isNaN(value)) return;
    this._x = value;
  }

  get y() {
    return this._y;
  }

  set y(value) {
    if (isNaN(value)) return;
    this._y = value;
  }

  show(zoom, offset, size) {
    push();
    const canvasX = this.x * zoom + offset.x - size.x / 2;
    const canvasY = this.y * zoom + offset.y - size.y / 2;
    translate(canvasX, canvasY);
    rotate(this.angle);
    stroke(255, 255, 255);
    fill(255, 255, 255);
    const realWidth = this.width * zoom;
    const realHeight = this.height * zoom;
    rect(-realHeight / 2, -realWidth / 2, realHeight, realWidth);
    stroke(171, 157, 242);
    fill(171, 157, 242);
    const h = (Math.sqrt(3) / 2) * (realWidth / 3);
    triangle(-0.5 * h, -(realHeight / 6), -0.5 * h, realHeight / 6, 0.5 * h, 0);
    pop();
  }

  turn(angle) {
    this.angle += angle;
    if (this.angle < 0) {
      this.angle += 360;
    } else if (this.angle >= 360) {
      this.angle -= 360;
    }
  }

  move(dist) {
    let anglecos = cos(this.angle);
    let anglesin = sin(this.angle);
    this.x += anglecos * dist;
    this.y += anglesin * dist;
  }

  side(dist) {
    let anglecos = cos(this.angle);
    let anglesin = sin(this.angle);
    this.x += -anglesin * dist;
    this.y += anglecos * dist;
  }
}
