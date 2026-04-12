function compute() {
  try {
    return 5;       // "about to return 5..."
  } catch (e) {
    return 8;
  } finally {
    return 12;      // "nope, returning 12 instead"
  }
}

console.log(compute()); // 12