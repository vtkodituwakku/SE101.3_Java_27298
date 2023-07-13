public class Calculate {
  public static float divide(float a, float b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException();
    }

    return a / b;
  }
}
