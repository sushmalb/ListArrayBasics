import java.util.Scanner;

public class breakoutroom {
    public static void main(String[] args) {
        System.out.println( " Enter Your name: ");
        Scanner s = new Scanner (System.in);
        String name = s.nextLine();
        System.out.println("Enter the capital of India: ");
        String option = s.nextLine();
        int score= 0;
        if (option.equalsIgnoreCase("Delhi")){
            System.out.println("You are correct! ");
            score ++;
               } else {
            System.out.println("Try next question. ");
        }
        System.out.println("Enter the Nation Animal of India: ");
        String option1 = s.nextLine();
        if (option1.equalsIgnoreCase("Tiger")){
            System.out.println("You are correct! ");
            score ++;
               } else {
            System.out.println("Try next question. ");
               }
        System.out.println("Enter the Nation Flower of India: ");
        String option2= s.nextLine();
        if (option2.equalsIgnoreCase("Lotus")){
        System.out.println("You are correct! ");
          score ++;
            } 
        //     else {
        //         System.out.println("Try next question. ");
        // }
System.out.println(" Your score is : " + score);
    }
}