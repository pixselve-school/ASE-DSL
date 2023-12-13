const MAX_LIFE = 200;

class Path {
  constructor(xa, ya, xb, yb, lifetime = MAX_LIFE) {
    this.xa = xa;
    this.ya = ya;
    this.xb = xb;
    this.yb = yb;

    this.lifetime = lifetime;
  }

  show(zoom, offset, size) {
    strokeWeight(3);
    //change opacity
    const opacity = map(this.lifetime, 0, MAX_LIFE, 0, 255, true);
    stroke(171, 157, 242, opacity);

    // show a line
    line(
      this.xa * zoom + offset.x - size.x / 2,
      this.ya * zoom + offset.y - size.y / 2,
      this.xb * zoom + offset.x - size.x / 2,
      this.yb * zoom + offset.y - size.y / 2
    );
    this.lifetime--;
  }
}
