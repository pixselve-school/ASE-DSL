class Wall {
  constructor(ax, ay, bx, by) {
    this.ax = ax;
    this.ay = ay;
    this.bx = bx;
    this.by = by;
  }

  show(zoom, offset, size) {
    stroke(224, 103, 59);
    strokeWeight(3);

    line(
      this.ax * zoom + offset.x - size.x / 2,
      this.ay * zoom + offset.y - size.y / 2,
      this.bx * zoom + offset.x - size.x / 2,
      this.by * zoom + offset.y - size.y / 2
    );
  }
}
