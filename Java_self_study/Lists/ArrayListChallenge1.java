import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ArrayList<String> groceries = new ArrayList<>();

    boolean flag = true;
    showMenu();
    while (flag) {
      showMenu();
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 0:
          flag = false;
          break;
        case 1:
          // Add items implementation
          System.out.println("Add items");
          addItems(groceries);
          break;
        case 2:
          // Remove items implementation
          // System.out.println("Remove items");
          removeItems(groceries);
          break;
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
          flag = false;
          break;
      }
      groceries.sort(Comparator.naturalOrder());
      System.out.println(groceries);

    }
  }

  public static void showMenu() {
    String textBlock = """
        Available actions:
        0 - to ShutDown
        1 - to add items
        2 - to remove items
        Enter your choice:""";
    System.out.println(textBlock);
  }

  public static void addItems(ArrayList<String> list) {

    String[] userItems = sc.nextLine().split(",");

    // list.addAll(Arrays.asList(userItems));
    for (String i : userItems) {
      String trimmed = i.trim();
      if (list.indexOf(trimmed) < 0) {
        list.add(trimmed);
      }
    }

  }

  public static void removeItems(ArrayList<String> list) {
    System.out.println("Enter items to remove:");
    String[] userItems = sc.nextLine().split(",");
    for (String i : list) {
      String trimmed = i.trim();
      list.remove(trimmed);
    }

  }

}
