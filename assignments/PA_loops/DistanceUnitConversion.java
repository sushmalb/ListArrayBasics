package assignments.PA_loops;

import java.util.Scanner;

public class DistanceUnitConversion {
  public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);
    do {

      System.out.println("Menu based app - Unit conversion for distance");
      System.out.println("1.CM to M");
      System.out.println("2.M to KM");
      System.out.println("3.KM to M");
      System.out.println("4.M to CM");
      System.out.println("Enter your option:");

      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Please enter the Centimeter value:");
          int cm = sc.nextInt();
          sc.nextLine();
          System.out.println(cm + " centimeters in meters is: " + (double) cm / 100 + " m");
          break;

        case 2:
          System.out.println("Please enter the Meter value:");
          int m = sc.nextInt();
          sc.nextLine();
          System.out.println(m + " meters in Kilometers is: " + (double) m / 1000 + " km");
          break;

        case 3:
          System.out.println("Please enter the Kilometer value:");
          int km = sc.nextInt();
          sc.nextLine();
          System.out.println(km + " kilometers in meters is: " + (km * 1000) + " m");
          break;

        case 4:
          System.out.println("Please enter the Meter value:");
          int mt = sc.nextInt();
          sc.nextLine();
          System.out.println(mt + " meters in centimeters is: " + mt * 100 + " cm");
          break;

        default:
          System.out.println("Make a proper selection between 1 and 4");
      }
      System.out.println("Press y to continue and any other key to exit:");
      s = sc.nextLine();
    } while (s.equals("y"));

  }

}
