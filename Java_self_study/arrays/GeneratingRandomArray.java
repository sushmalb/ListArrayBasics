package arrays;

import java.util.Arrays;
import java.util.Random;

public class GeneratingRandomArray {
  public static void main(String[] args) {
    int[] arr = generateRandomValues(10);
    System.out.println(Arrays.toString(arr));
    // To fill arr with 10 random values

    // To sort the arr in ascending order
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr1 = generateRandomValues(10);
    System.out.println(Arrays.toString(arr1));

    // To fill same values into an array
    Arrays.fill(arr1, 5);
    System.out.println(Arrays.toString(arr1));

    // Copy one array into another.Copied array remains same if altered
    int[] arr2 = Arrays.copyOf(arr1, arr1.length);
    System.out.println(Arrays.toString(arr2));

    int[] smallerArray = Arrays.copyOf(arr1, 2);
    System.out.println(Arrays.toString(smallerArray));

    int[] largerArray = Arrays.copyOf(arr1, 20);
    System.out.println(Arrays.toString(largerArray));

  }

  public static int[] generateRandomValues(int len) {
    Random random = new Random();
    int[] newInt = new int[len];
    for (int i = 0; i < len; i++) {
      newInt[i] = random.nextInt(100);
    }
    // System.out.println(Arrays.toString(newInt));
    return newInt;
  }

}
