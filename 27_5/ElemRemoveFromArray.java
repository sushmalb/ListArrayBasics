import java.util.Arrays;
import java.util.ArrayList;

public class ElemRemoveFromArray {
  public static void main(String[] args) {
    String[] str = { "hello", "hi" };
    System.out.println(str);
    for (int i = 0; i < str.length; i++) {
      // System.out.println(str[i]);
    }

    // Iteration with For each loop
    for (String i : str) {
      // System.out.println(i);
    }

    // Iteration with while loop
    int i = 0;
    while (i < str.length) {
      // System.out.println(str[i]);
      i++;
    }
    // System.out.println(Arrays.toString());

    String name = "Sushma";
    char[] c = name.toCharArray();
    for (char ik : c) {
      System.out.println(c);
    }

    int[] s3 = { 1, 3, 5, 7, 9, 11 };
    int removed_value = 9;
    int index = -1;
    for (int j = 0; j < s3.length; j++) {
      if (s3[j] == removed_value) {
        index = j;
        break;
      }
    }
    if (index != -1) {
      int[] s4 = new int[s3.length - 1];
      System.arraycopy(s3, 0, s4, 0, index);
      System.arraycopy(s3, index + 1, s4, index, s3.length - index - 1);
      s3 = s4;
    }
    for (int k : s3) {
      System.out.println(k);
    }
  }
}
