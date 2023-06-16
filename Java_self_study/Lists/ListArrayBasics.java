
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListArrayBasics {
  public static void main(String[] args) {

    String[] fruits = { "Apple", "Mangoes", "Pear" };
    System.out.println(Arrays.toString(fruits));

    // CONVERTING INTO LIST
    List<String> list = List.of(fruits);
    // List<String> list = Arrays.asList(fruits);
    System.out.println(list);

    // CONVERTING INTO ARRAYLIST DIRECT
    ArrayList<String> groceries = new ArrayList<>(Arrays.asList(fruits));

    // COVERTING INTO ARRAYLIST USING LIST
    // ArrayList<String> groceries = new ArrayList<>(list);
    System.out.println(groceries);
    groceries.add("Yoghurt");
    System.out.println(groceries);
    groceries.add(1, "Milk");
    System.out.println(groceries);
    groceries.addAll(Arrays.asList("Honey", "Cheese"));
    System.out.println(groceries);

    // INDEX
    System.out.println(groceries.get(3));
    groceries.set(4, "Cocoa");
    System.out.println(groceries);
    groceries.remove("Cocoa");
    System.out.println(groceries);
    groceries.remove(5);
    System.out.println(groceries);
    System.out.println(groceries.contains("Mango"));
    System.out.println(groceries.indexOf("Honey"));
    groceries.addAll(Arrays.asList("Choclates", "Chips", "Honey"));
    System.out.println(groceries);
    System.out.println(groceries.lastIndexOf("Honey"));

    // SORT
    groceries.sort(Comparator.naturalOrder());
    System.out.println(groceries);
    groceries.sort(Comparator.reverseOrder());
    System.out.println(groceries);

    // REMOVE
    groceries.removeAll(Arrays.asList("Honey", "Choclates"));
    System.out.println(groceries);
    groceries.retainAll(Arrays.asList("Apple", "Chips"));
    System.out.println(groceries);
    groceries.clear();
    System.out.println(groceries);
    System.out.println(groceries.isEmpty());

    String[] groceriesArray = groceries.toArray(new String[groceries.size()]);
    System.out.println(Arrays.toString(groceriesArray));
  }
}