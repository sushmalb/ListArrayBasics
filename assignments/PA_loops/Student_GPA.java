package assignments.PA_loops;

import java.util.Scanner;

public class Student_GPA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks obtained by student");
    int marks = sc.nextInt();

    System.out.println("Enter total marks");
    int total_marks = sc.nextInt();

    // By dividing an integer by a non-integer (in this case, an integer divided by
    // a double), the result will be a decimal value.
    double percentage = ((double) marks / total_marks) * 100;
    // System.out.println(percentage);
    String grade;
    double gpa;
    if (percentage > 0 && percentage < 60) {
      grade = "F";
      gpa = 0.0;
    } else if (percentage >= 60 && percentage < 70) {
      grade = "D";
      gpa = 1.0;
    } else if (percentage >= 70 && percentage < 80) {
      grade = "C";
      gpa = 2.0;
    } else if (percentage >= 80 && percentage < 90) {
      grade = "B";
      gpa = 3.0;
    } else {
      grade = "A";
      gpa = 4.0;
    }
    System.out.print("Your percentage is:");
    System.out.printf("%.2f", percentage);
    System.out.println();
    System.out.println("Your received a grade of " + grade + " and a GPA of: " + gpa);

  }
}
