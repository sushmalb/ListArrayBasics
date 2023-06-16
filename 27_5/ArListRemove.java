import java.util.ArrayList;
import java.util.Arrays;

public class ArListRemove {
  public static void main(String[] args) {
    String[] arr = { "Hello", "Hi", "Namaste" };
    ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
    System.out.println(al);

    al.remove(1);
    System.out.println(al);

    String[] arr1 = al.toArray(new String[0]);
    System.out.println(arr1);
    for (String i : arr1) {
      System.out.println(i);
    }
  }
}
