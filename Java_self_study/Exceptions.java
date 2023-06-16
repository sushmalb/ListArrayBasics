public class Exceptions {
  public static void main(String[] args) {
    int x = 20;
    int y = 0;
    // divide(x, y);
    System.out.println(divideLBYL(x, y));
    System.out.println(divideEAFP(x, y));
  }

  public static int divide(int x, int y) {
    return x / y;
  }

  // Look Before You Leap
  public static int divideLBYL(int x, int y) {
    if (y != 0) {
      return x / y;
    } else {
      return 0;
    }
  }

  // Easier to Ask for Forgiveness than Permission
  public static int divideEAFP(int x, int y) {
    try {
      return x / y;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}