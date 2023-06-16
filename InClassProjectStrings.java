public class InClassProjectStrings {
  public static void main(String[] args) {
    String str  = "It works on my machine";
    // After Split needs to be stored in an array
    String[] s = str.split(" ");
  
    // For arrays there is no () when using length
    System.out.println("The length of my string is:" +s.length);

    // On strings we need to use ()
    System.out.println("Number of characters in my sentence is:"+ str.length());
    String without_spaceString = str.replaceAll(" ", "");
    System.out.println(without_spaceString.length());

    StringBuilder reversed = new StringBuilder(str);
        System.out.println(reversed);
        reversed.reverse();
        
        // String output = reversed.toString();
        // System.out.println(output);

    int start = 0;
    int end  = str.length()-1;
    // System.out.println(str.charAt(start));
    // System.out.println(str.charAt(end));

    if(str.charAt(start).equalsIgnoreCases(str.charAt(end))){
      
    }


  }
}