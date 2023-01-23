class NumsExample {
  static double reciprocal(int n) {
    return (double) 1 / n;
  }
  static double ratio(int n, int d) {
    return (double) n / d;
  }
  // (a / b) * (1 / c)
  static double formula(int a, int b, int c) {
    return ratio(a, b) * reciprocal(c);
  }
}