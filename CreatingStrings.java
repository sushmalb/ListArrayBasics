public class CreatingStrings {
  public static void main(String[] args) {
    // String s1  = "Sushma"; // This got created in string pool
    // String s2  = "Hello";
    String s1  = new String("Hello");
    String s2  = new String("Hello");
    // if (s1 == s2){
    //   System.out.println("same");

    // }else {
    //   System.out.println("Different");
    // }

    // TO FIND THE LENGTHH OF A STRING
    System.out.println(s1.length());
    System.out.println(s1 + s2); // Operator overriding
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));


  }
}
