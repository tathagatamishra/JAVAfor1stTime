function recurFunc(n) {
  let x = n + 1;

  if (x < 5) {
    return recurFunc(x);
  } else {
    return x;
  }
}

console.log(recurFunc(1));
