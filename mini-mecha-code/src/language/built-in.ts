export const SET_SPEED = "setSpeed";
export const GET_TIMESTAMP = "getTimestamp";
export const GET_DISTANCE = "getDistance";

export const builtInMiniMechaCodeFunctions = [
  SET_SPEED,
  GET_TIMESTAMP,
  GET_DISTANCE,
];

export const builtInMiniMechaCode = `
let void ${SET_SPEED}(number speed) {}
let number ${GET_TIMESTAMP}() {}
let number ${GET_DISTANCE}() {}
`.trimEnd();
