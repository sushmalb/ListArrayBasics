package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
  public static void main(String[] args) {
    int[] newAr = readIntegers();
    System.out.println("minimum val is:" + findMin(newAr));
  }

  public static int[] readIntegers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter comma separated numbers");
    String val = sc.nextLine();

    // TO CONVERT A STRING INTO ARRAY USE SPLIT
    String[] strArr = val.split(",");
    // System.out.println(Arrays.toString(strArr));

    int[] intArr = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      intArr[i] = Integer.parseInt(strArr[i]);
    }
    System.out.println(Arrays.toString(intArr));

    return intArr;

    // int[] intVal = Integer.parseInt(val);
  }

  public static int findMin(int[] ar) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] < min) {
        min = ar[i];
      }

    }
    return min;
  }
}