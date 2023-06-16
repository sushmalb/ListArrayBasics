import java.util.Arrays;
import java.util.Comparator;

public class OtherMethodsInArrays {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 3, 1, 10 };

    // autoboxing in arrays
    // Integer[] num = {}

    // Sort an array
    Arrays.sort(arr);
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    // Binary search will always apply on a sorted array on unsorted array we will
    // get wrong values
    System.out.println(Arrays.binarySearch(arr, 10));

    // To sort in descending order need to be in wrapper class
    // Arrays.sort(arr, Comparator.reverseOrder());
    // To fill values inta an array
    int[] num = new int[10];
    Arrays.fill(num, 100);
    System.out.println(Arrays.toString(num));

    System.out.println(arr.equals(num));
    // OR
    System.out.println(Arrays.equals(arr, num));

  }
}
