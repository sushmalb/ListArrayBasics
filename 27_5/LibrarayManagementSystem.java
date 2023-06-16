import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class LibrarayManagementSystem {

  static String[] books = { "Atomic habits", "The monk who sold his Ferrari", "Kaizen", "The pyschology of money",
      "Coffee can investing" };
  static Integer[] bookId = { 101, 102, 103, 104, 105 };
  static String[] isAvailable = { "Available", "Available", "Available", "Available", "Available" };

  static ArrayList<Integer> bookIdAl = new ArrayList<>(Arrays.asList(bookId));
  static ArrayList<String> bookAl = new ArrayList<>(Arrays.asList(books));

  public static void main(String[] args) {
    String option;
    do {

      System.out.println("Welcome to the world of books!!");
      System.out.println("----------------------------------");
      System.out.println("1. View the complete list of Books");
      System.out.println("2. Issue a Book");
      System.out.println("3. Return a Book");
      System.out.println("4.Exit");
      // System.out.println(bookidAl);
      Scanner sc = new Scanner(System.in);
      int userInput = sc.nextInt();
      sc.nextLine();

      switch (userInput) {
        case 1:
          showBooks();
          break;

        case 2:
          System.out.println("-----------------");
          System.out.println("Issue the book");
          System.out.println("------------------");
          System.out.println("Enter the book ID");
          int bookIdEntered = sc.nextInt();
          sc.nextLine();

          int index = bookIdAl.indexOf(bookIdEntered);
          if (index != -1) {
            System.out.println("Issuing you the book");
            bookIdAl.remove(index);
            bookAl.remove(index);
            System.out.println(bookIdAl);
          } else {
            System.out.println("Book not found");
          }
          break;
      }
      System.out.println("Press y to continue and any other key to exit:");
      option = sc.nextLine();
    } while (option.equals("y"));
    // boolean bookFound = false;

    // for (var i = 0; i < books.length; i++) {
    // if (userInput.equalsIgnoreCase(books[i])) {
    // bookFound = true;
    // break;
    // }

    // }

    // if (bookFound) {
    // System.out.println("Yes , we have that book !!! Do you want to borrow this
    // book?");
    // } else {
    // System.out.println("Oops !!! Book not found");
    // }

  }

  public static void showBooks() {
    System.out.println("List of books :");
    System.out.println("--------------------");
    for (var i = 0; i < bookIdAl.size(); i++) {
      System.out.printf("%-5s %-30s %s%n ", bookId[i], bookAl.get(i), isAvailable[i]);
    }
  }

  public static void issueBooks() {

  }

}
