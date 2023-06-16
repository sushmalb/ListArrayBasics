public class loops {
  public static void main(String[] args) {
    for(int i = 1; i<=10; i++){
      System.out.print(i+ " ");
    }
System.out.println();
    System.out.println("-------------------");
    System.out.println("Even numbers between 1 to 10");
    for(int i = 1; i<=10;i ++){
      if(i%2 == 0){
        System.out.print(i+ " ");
      }
    }
    System.out.println();
    //WHILE LOOP
    int  i = 0;
    while (i<=10){
      System.out.print(i+ " ");
      i++;
    }

    // Factorial of a number
    int fact=1;
    int num = 5;
    for(i=1;i<=num;i++){
      fact  = fact*i;
      
    }
    System.out.println(" Factorial of "+ num +":"+fact);
     

  }
}
//
