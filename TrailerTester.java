import java.util.Arrays;
public class TrailerTester {
	  public static void main(String[] args) {
     	  Trailer[] a = new Trailer[10];
	      a[0] = new Trailer ("John", 9253262, "ABC123", 12, 2, "05-09-26", "10-09-16");
		  a[1] = new Trailer ("Kenny", 7623662, "EKC123", 8, 1, "15-09-26", "20-09-16");
		  a[2] = new Trailer ("Peter", 6545132, "MSC123", 10, 4, "08-09-26", "10-09-16");
		  a[3] = new Trailer ("Ashley", 9253469, "AB633", 15, 3, "09-09-26", "20-09-16");
		  a[4] = new Trailer ("Elizabeth", 7093516, "ARC653", 11, 1, "20-09-26", "30-09-16");
		  a[5] = new Trailer ("Paul", 1254362, "AF55B3", 20, 2, "27-09-26", "01-10-16");
		  a[6] = new Trailer ("Eren", 5624862, "A64C23", 17, 4, "30-09-26", "10-10-16");
		  a[7] = new Trailer ("Katy", 9345662, "FD523", 17, 1, "01-09-26", "07-09-16");
		  a[8] = new Trailer ("Marco", 7575262, "A5C123", 25, 3, "10-09-26", "11-09-16");
		  a[9] = new Trailer ("Anne", 8523622, "A6D123", 28, 1, "05-09-26", "10-09-16");
		  for(int i = 0; i < a.length; i++) {
			  System.out.println(a[i].toString());
		  }
		  SelectionSorter s = new SelectionSorter(a);
		  s.sort();
          for(int i = 0; i < a.length; i++) { 
		      System.out.println(a[i].getOwnerName());
          }			  
		  BinarySearch b = new BinarySearch();
		  int value = b.searchString(a, "Peter");
		  System.out.println(a[value]);
		  System.out.println();
		  BubbleSorter m = new BubbleSorter(a);
		  m.sort();
		  for(int i = 0; i < a.length; i++) { 
		      System.out.println(a[i].getBuildingNum());
          }
		  
		  
	}

}