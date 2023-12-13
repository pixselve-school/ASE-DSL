
void rotate(int angle) {
  // TODO: Implement
}

void forward(int distance) {
  // TODO: Implement
}

int getDistance() {
  // TODO: Implement
  return 0;
}

int getTimestamp() {
  // TODO: Implement
  return 0;
}

void setSpeed(int speed) {
  // TODO: Implement
}

void setup() {
  // TODO: Implement
}

float entry() {
float count = 0;
while (count < 5) {
count = count + 1;
square();
}
}
float square() {
forward(30 * 100);
rotate(90);
forward(300);
rotate(90);
forward(30 * 100);
rotate(90);
forward(300);
rotate(90);
}
void loop() {
  main();
}
