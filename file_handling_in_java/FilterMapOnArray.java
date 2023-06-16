import java.util.Arrays;

public class FilterMapOnArray {
  public static void main(String[] args) {
    String[] arr = { "Hello", "Hi", "Namaste", "Watsup", "Ola" };
    Arrays.stream(arr).filter(i -> i.length() > 3).forEach(System.out::println);

    String[] uppercaseArr = Arrays.stream(arr)
        .map(String::toUpperCase)
        .toArray(String[]::new);
    System.out.println(Arrays.toString(uppercaseArr));
    // System.out.println(Arrays.toString(UppercaseStr));

    // String[] stringArrayWithStream = (String[])
    // Arrays.stream(stringArray).filter(i -> i.length() > 3).toArray();

  }
}
