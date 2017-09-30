import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ProcessStudent
{
  public static void main( String[] args )
  {
    String first, last,stNum;
    double marks;
    int students = 0;
    double total = 0;
    try
    {
      File inFile = new File("student.txt");
      Scanner inPut = new Scanner(inFile);
      while(inPut.hasNext())
      {
        first = inPut.next();
        last = inPut.next();
        stNum= inPut.next();
        marks= inPut.nextDouble();
        System.out.println(last+ ", " + first + " "+ stNum + " " + marks);
        total = total + marks;
        students++;
      } 
      inPut.close();
      System.out.println("\nThe average mark for the class is: " + (total/students));
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }
}

