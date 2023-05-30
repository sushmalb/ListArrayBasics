import java.util.Scanner;

public class EStore {
  static String[] productName = { "Mobile", "Lapatop", "Smartphone" };
  static int[] productId = { 101, 102, 103 };
  static int[] productCount = { 100, 70, 150 };
  static String[] productSpecification = { "aaada", "sqad", "dqdqdw" };
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("-----------------------------------------------");
    System.out.println("Welcome to the SmartPoint Electronics Store");
    System.out.println("-----------------------------------------------");
    String s;
    do {

      System.out.println("Please select an option from below:");
      System.out.println("1: View the complete list of our products");
      System.out.println("2: Check the available count for a specific product");
      System.out.println("3: View the specifications and details of a specific product");
      System.out.println("4: Modify the details of a specific product");
      System.out.println("5: Update the inventory for a specific product");
      System.out.println("6: Exit");
      System.out.println("Please enter your choice :");

      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Here are the List of our products:");
          System.out.println("---------------------------------------");
          listProducts();
          break;

        case 2:
          productCountfn();
          break;

        case 3:
          productSpecificationfn();
          break;

        case 4:
          modifyProduct();
          break;
      }

      System.out.println("Press y to continue");
      s = sc.nextLine();
    } while (s.equals("y"));
  }

  public static void listProducts() {

    for (int i = 0; i < productName.length; i++) {
      System.out.printf("%-10s %s%n", productName[i], productId[i]);
    }
  }

  public static void productCountfn() {
    System.out.println("Enter the product ID");
    int id = sc.nextInt();
    sc.nextLine();
    // int index = -1;
    Boolean found = false;
    int j;
    for (j = 0; j < productId.length; j++) {
      if (id == productId[j]) {
        found = true;
        break;
      }
    }
    if (found == true) {
      System.out.printf("%s %s", productId[j], productName[j]);

      System.out.println();
      System.out.println("Total availabale count is:" + productCount[j]);
    } else {
      System.out.println("Product not found !!");
    }
  }

  public static void productSpecificationfn() {
    System.out.println("Enter the product ID");
    int id = sc.nextInt();
    sc.nextLine();
    // int index = -1;
    Boolean found = false;
    int j;
    for (j = 0; j < productId.length; j++) {
      if (id == productId[j]) {
        found = true;
        break;
      }
    }
    if (found == true) {
      System.out.printf("%s %s", productId[j], productName[j]);

      System.out.println();
      System.out.println("Total availabale count is:" + productCount[j]);
      System.out.println(productSpecification[j]);
    } else {
      System.out.println("Product not found !!");
    }

  }

  public static void modifyProduct() {
    System.out.println("enter the product ID:");
    int pCount = 0;
    int toModifyProduct = sc.nextInt();
    sc.nextLine();
    boolean flag = false;
    int i;
    for (i = 0; i < productCount.length; i++) {
      if (toModifyProduct == productCount[i]) {
        flag = true;
        System.out.println(productCount[i]);
        break;
      }
      if (flag) {
        pCount = productCount[i];
      }
      // pcount = productCount

    }

    System.out.println("Please choose from the option below:");
    int op = sc.nextInt();
    sc.nextLine();
    if (op == 1) {
      System.out.println("currently available count: " + pCount);
    }
  }

}
