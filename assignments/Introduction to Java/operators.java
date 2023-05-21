public class operators {
  public static void main(String[] args) {
    System.out.println("Relational operator usage:");
    int num1  = 10;
    int num2 = 20;
    
    System.out.println(num1 + " is greather than "+num2 +":"+(num1>num2));
    System.out.println(num1 + " is lesser than "+num2 +":"+(num1<num2));

    System.out.println("---------------------------");
    System.out.println("Assignmemt Operator usage:");
    int num = 10;
    System.out.println("After addition:num ="+(num+2));
    System.out.println("After subtraction:num ="+ (num-2));
    System.out.println("After multiplication:num ="+(num*5.6));
    System.out.println("After division:num="+(140/num));
    System.out.println("After modulus num ="+(12%num));
  }
}

