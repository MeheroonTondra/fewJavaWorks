import java.util.Scanner;
public class StudentGPAs {
      public static void main(String[] args) {
              Scanner inPut = new Scanner(System.in);
              While(inputhasNext()) {
                         System.out.prin(“enter student name: “);
                         String name = inPut.next();
                         System.out.print(“Enter student number: “);
                         int num = input.nextInt();
                         double[] marks = new double[5];
                         for(int i = 0; i < marks.length; i++) {
                                   marks[i] = input.nextInt();
                         }
                         double total = 0;
                         for(int i = 0; i < marks.length; i++) {
                                   total = total + marks[i];
                         }
                         double avg = total / marks.length;
                         if(avg >= 80) {
                                   double gpa = 4.0;
                         }
                         if(avg >= 65 && avg < 80) {
                                   double gpa = 3.0;
                         }
                         if(avg >= 55 && avg < 65) {
                                   double gpa = 2.0;
                         }
                         if(avg >= 50 && avg < 55) {
                                   double gpa = 1.0;
                         }
                         else {
                                   double gpa = 0.0;
                         }
                         System.out.println(“Student Number:   “ + num + “     “ +  “GPA:   ” + gpa);
              }
      }
}       
