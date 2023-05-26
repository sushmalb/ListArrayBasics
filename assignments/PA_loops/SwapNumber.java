package assignments.PA_loops;

import java.util.Scanner;

public class SwapNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num1 = sc.nextInt();
    System.out.println("Enter another number:");
    int num2 = sc.nextInt();
    int temp = num1;

    System.out.println("The numbers you entered are:" + num1 + " and " + num2);
    num1 = num2;
    num2 = temp;

    System.out.println("The reversed numbers are: " + num1 + " and " + num2);

  }
}
