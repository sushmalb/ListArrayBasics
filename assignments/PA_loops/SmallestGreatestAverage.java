package assignments.PA_loops;

import java.util.Scanner;

public class SmallestGreatestAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int smallest;
    int greatest;
    System.out.println("Please input 1st number:");
    int num1 = sc.nextInt();
    System.out.println("Please input 2nd number:");
    int num2 = sc.nextInt();
    System.out.println("Please input 3rd number:");
    int num3 = sc.nextInt();

    if (num1 < num2 && num1 < num3) {
      smallest = num1;
    } else if (num2 < num1 && num2 < num3) {
      smallest = num2;
    } else {
      smallest = num3;
    }
    System.out.println("Smallest number is: " + smallest);
    if (num1 > num2 && num1 > num3) {
      greatest = num1;
    } else if (num2 > num1 && num2 > num3) {
      greatest = num2;
    } else {
      greatest = num3;
    }
    System.out.println("Greatest number is: " + greatest);

    System.out.println("Average of " + num1 + " " + num2 + " and " + num3 + " is:" + (num1 + num2 + num3) / 3);

  }
}