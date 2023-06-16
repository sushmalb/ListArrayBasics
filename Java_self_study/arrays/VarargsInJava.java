package arrays;
//Varags is a special designation for Java, that means , jave will take zero, one or many Strings as arguments to this method and create an array

public class VarargsInJava {
  public static void printNumbers(String label, int... numbers) {
    System.out.println(label);
    for (int number : numbers) {
      System.out.println(number);
    }

  }

  public static void printString(String... text) {
    for (String i : text) {
      System.out.println(i);
    }
  }

  public static void main(String... args) {
    printNumbers("Even Numbers:", 2, 4, 6, 8);
    printNumbers("Prime Numbers:", 2, 3, 5, 7, 11);
    printNumbers("No Numbers:"); // Passing zero arguments

    // SPLIT METHOD
    System.out.println("Hello World Again");
    String[] splitString = "Hello World Again".split(" ");
    printString(splitString);
    System.out.println("_".repeat(20));

    // JOIN METHOD
    String[] sArray = { "first", "second", "third", "fourth" };
    System.out.println(String.join(",", sArray));
  }
}
