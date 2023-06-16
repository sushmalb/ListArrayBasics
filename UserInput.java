import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    //System.out.println(name);
    System.out.println("Enter you age");
    int age  = sc.nextInt();
    System.out.println("Enter your hobbies");
    String hobbies = sc.nextLine();
    System.out.println("Enter your contact number");
    long num = sc.nextLong();

  }
}
