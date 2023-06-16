import java.util.Arrays;

public class StreamsFilter {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // array doesnt have a filter method on it , so we need to use the method from
    // stream. So 3 steps. call stream , filter it and convert back to arrays
    int[] even_numbers = Arrays.stream(nums).filter(i -> i % 2 == 0).toArray();
    System.out.println(Arrays.toString(even_numbers));

    // to use the same with forEach
    // System.out::println is an example of a method reference
    // By using System.out::println, you are creating a reference to the println
    // method of the PrintStream class, which is responsible for printing output to
    // the console.
    Arrays.stream(nums).filter(i -> i % 2 == 0).forEach(System.out::println);

    // MAP FUNCTION
    // This is used when you want to apply a condition on each element
    int[] sq = Arrays.stream(nums).map(i -> i * i).toArray();
    System.out.println(Arrays.toString(sq));
  }
}