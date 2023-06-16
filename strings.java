import java.util.Arrays;

public class strings {
  public static void main(String[] args) {
    // String s1  = "Sushma"; // This got created in string pool
    // String s2  = "Hello";
    String s1  = new String("Hello");
    String s2  = new String("   Hel   lo   ");
    if (s1 == s2){
      System.out.println("same");

    }else {
      System.out.println("Different");
    }

    // TO FIND THE LENGTHH OF A STRING
    System.out.println(s1.length());
    System.out.println(s1 + s2); // Operator overriding
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));

    System.out.println(s1.compareTo(s2));
    System.out.println(s1.contains("el"));
    System.out.println(s1.indexOf("e"));
    System.out.println(s1.lastIndexOf("l", 0));
    System.out.println(s1.substring(1, 3));
    System.out.println(s1.replace("e", "o"));
    System.out.println(s1.replaceAll("l", "o"));
    System.out.println(s1.toUpperCase());
    System.out.println(s2.trim());
    int i =25;
    System.out.println(Integer.toString(i));
    String j = "10";
    System.out.println(Integer.parseInt(j));
    // int k = Integer.parseInt(j);
    // System.out.println(k + 100);
    String str = "sushma , laxman, bhandari";
    String[] s3 = str.split(",");
    System.out.println(Arrays.toString(s3));
    System.out.println(j.getClass());
  }
}
