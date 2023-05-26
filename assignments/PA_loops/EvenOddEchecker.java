package assignments.PA_loops;

import java.util.Scanner;

public class EvenOddEchecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String selection;
    do {
      System.out.println("Please enter a number:");
      int num = sc.nextInt();
      sc.nextLine();
      if (num % 2 == 0) {
        System.out.println("You enetered " + num + " and it is an EVEN number");
      } else {
        System.out.println("You enetered " + num + " and it is an ODD number");
      }

      System.out.println("Press y to continue");
      selection = sc.nextLine();
    } while (selection.equalsIgnoreCase("y"));
  }
}
