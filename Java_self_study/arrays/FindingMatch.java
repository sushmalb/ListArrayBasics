package arrays;

import java.util.Arrays;

public class FindingMatch {
  public static void main(String[] args) {
    // String[] ar = { "jkl", "abc", "def", "ghi" };
    // Arrays.sort(ar);
    // System.out.println(Arrays.toString(ar));
    // Arrays point to the same memory when copied. so change to one will change the
    // other as well

    int[] intAr = { 8, 4, 5, 6, 3, 5, 8, 9 };
    Arrays.sort(intAr);
    int[] ar = { 3, 485, 6 };

    // Binary search needs to happen on a sorted array.
    int res = Arrays.binarySearch(intAr, 21);
    if (res >= 0) {
      System.out.println("Element found");
    } else {
      System.out.println("Element not found");
    }
    if (intAr.equals(ar)) {
      System.out.println("arrays are equal");
    } else {
      System.out.println("Arrays are not equal !!");
    }
  }
}