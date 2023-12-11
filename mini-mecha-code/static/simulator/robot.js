class Robot {

    _x = 0;
    _y = 0;

    constructor(factor, _x = 0, _y = 0, _width = 50, _height = 75, _angle = 0) {
        this.factor = factor;
        // x and y represent the center of the robot
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
        if (isNaN(value)) return
        this._x = value;
    }

    get y() {
        return this._y;
    }

    set y(value) {
        if (isNaN(value)) return
        this._y = value;
    }

    show() {
        push();
        const canvasX = this.x * this.factor;
        const canvasY = this.y * this.factor;
        translate(canvasX, canvasY);
        rotate(this.angle);
        stroke(255, 255, 255);
        rect(-this.height/2, -this.width/2, this.height, this.width);
        stroke(255, 0, 0);
        fill(255, 0, 0);
        const h = (Math.sqrt(3)/2) * (this.width/3)
        triangle(-0.5*h, -(this.height/6), -0.5*h, this.height/6, 0.5*h, 0);
        pop();


    }

    turn(angle){
        this.angle += angle;
        if(this.angle<0){
            this.angle += 360;
        } else if (this.angle >= 360){
            this.angle -= 360;
        }
    }

    move(dist){
        let anglecos = cos(this.angle);
        let anglesin = sin(this.angle);
        this.x += anglecos*dist;
        this.y += anglesin*dist;
    }

    side(dist){
        let anglecos = cos(this.angle);
        let anglesin = sin(this.angle);
        this.x += -anglesin*dist;
        this.y += anglecos*dist;
    }
  }
