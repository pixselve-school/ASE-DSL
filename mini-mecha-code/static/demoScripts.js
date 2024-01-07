export const scripts = {
  "cool-shapes.mini": `let void entry () {
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
`,
  "yeah-functions.mini": `let void entry () {
  square()
  Clock 180
  Forward 1500
  circle()
  circle()
}

let void circle() {
  var number count = 0
  loop count < 20
  {	
    Forward 400
    Clock 18
    count = count + 1
  }
}

let void square() {
  setSpeed(10)
  var number count = 0
  loop count < 4
  {	
    Forward 3000
    Clock 90

    count = count + 1
  }
}`,
  "basic-wall-detection.mini": `let void entry () {
  setSpeed(10)
  loop getDistance() > 100
  {	
    Forward 100
  }
}
`,
  "wall-riding.mini": `let void entry () {
  var number count = 0
  setSpeed(10)
  Clock 30
  loop count < 500
  {	
    loop getDistance() < 1500
    {
      Clock 23
    }
    Forward 500

    count = count + 1
  }
}
`,
  "triangle.mini": `let void entry () {
  var number count = 1
  setSpeed(40)
  loop count < 50
  {
    Forward count * 100
    Clock 120
    count = count + 1
  }
}`,
};
