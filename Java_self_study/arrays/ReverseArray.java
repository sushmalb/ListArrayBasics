package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    // System.out.println("Array before reverseing:");
    int[] arr = generateArray();
    reverseArry(arr);
    System.out.println("Reversed array is:" + Arrays.toString(arr));

    reversedArray(arr);
    System.out.println("Reversed array is:" + Arrays.toString(arr));
  }

  public static int[] generateArray() {
    System.out.println("Enter few comma separated numbers");
    Scanner sc = new Scanner(System.in);
    String userNums = sc.nextLine();

    String[] userNumsArray = userNums.split(",");
    // System.out.println(Arrays.toString(userNumsArray));

    int[] userNumsIntArray = new int[userNumsArray.length];
    for (int i = 0; i < userNumsArray.length; i++) {
      userNumsIntArray[i] = Integer.parseInt(userNumsArray[i]);
    }
    System.out.println("Array before reversing");
    System.out.println(Arrays.toString(userNumsIntArray));
    return userNumsIntArray;
  }

  public static void reverseArry(int[] a) {
    int mid = a.length / 2;
    int lastElem = a.length - 1;
    for (int i = 0; i < mid; i++) {
      int temp = a[i];
      a[i] = a[lastElem - i];
      a[lastElem - i] = temp;

    }
  }

  public static int[] reversedArray(int[] a) {
    int[] rArray = new int[a.length];
    int lastElem = a.length - 1;
    for (int el : a) {
      rArray[lastElem--] = el;
    }
    return rArray;
  }

}
