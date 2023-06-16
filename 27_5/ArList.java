import java.util.ArrayList;

public class ArList {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    // To add values
    arr.add("A");
    arr.add("B");
    arr.remove(0);
    System.out.println(arr);
    // To Modify a value
    arr.set(0, "C");
    arr.add("D");
    arr.add("E");
    System.out.println(arr);
    System.out.println(arr.get(1));

    System.out.println(arr);

  }

}