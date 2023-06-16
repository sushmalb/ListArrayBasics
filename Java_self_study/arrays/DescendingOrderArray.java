package arrays;

//import java.lang.reflect.AnnotatedTypeVariable;
import java.util.Arrays;
import java.util.Random;

public class DescendingOrderArray {
  public static void main(String[] args) {
    int[] anyArray = generateRandomArray(10);
    System.out.println(Arrays.toString(anyArray));

    Arrays.sort(anyArray);
    System.out.println(Arrays.toString(anyArray));

    Boolean flag = true;
    while (flag) {
      flag = false;
      int temp;
      for (int i = 0; i < anyArray.length; i++) {
        if (anyArray[i] < anyArray[i + 1]) {
          temp = anyArray[i];
          anyArray[i] = anyArray[i + 1];
          anyArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    System.out.println(Arrays.toString(anyArray));
  }

  public static int[] generateRandomArray(int len) {
    int[] arr = new int[len];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt(100);
    }
    return arr;
  }

}
