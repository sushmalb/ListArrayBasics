package arrays;

import java.util.Arrays;

public class Printing2DimentionalArray {
  public static void main(String[] args) {
    int[][] twoDArray = new int[4][4];

    // USING SIMPLE FOR LOOP
    for (int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray.length; j++) {
        System.out.println((twoDArray[i][j] + " "));
      }
      System.out.println();
    }

    // USING ENHANCED FOR LOOP
    for (int[] elem : twoDArray) {
      for (int e : elem) {
        System.out.println(e + " ");
      }
      System.out.println();
    }

    // USING INBUILT METHOD
    System.out.println(Arrays.deepToString(twoDArray));

  }
}
