import java.util.Scanner;

public class bot {
  public static void main(String[] args) {
    System.out.println("Who invented Java?");
    Scanner sc = new Scanner(System.in);
    String ans  = sc.nextLine();
    if(ans.equals("James Gosling")){
      System.out.println("Thats the right answer");
    }else {
      System.out.println("Try again!!");
    }

  }
}
