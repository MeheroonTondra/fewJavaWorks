import java.util.Scanner;
import java.util.NoSuchElementException;

public class Node {
    private Customer data;
	private Node next;
	public Node (Customer d, Node n) {
	    data = d;
		next = n;
	}
	public Node (Customer d) {
		data = d;
		next = null;
	}
	public Customer getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setData(Customer newD) {
		data = newD;
	}
	public void setNext(Node newN) {
		next = newN;
	}
	//customer accessor and mutator
	public String getName() {
		return data.getName();
	}
	public String getAddress() {
		return data.getAddress();
	}
	public int getNum() {
		return data.getNum();
	}
	public String getYear() {
		return data.getYear();
	}	
	public void setName(String newNa) {
		data.setName(newNa);
	}
	public void setAddress(String newA) {
		data.setAddress(newA);
	}
	public void setNum(int newN) {
		data.setNum(newN);
	}
	public void setYear(String newY) {
		data.setYear(newY);
	}
	//method, given customer number
	public static void search(Node first, int n) {
		if(first == null) {
			System.out.println (first); 
		}
		else if(first.getData().getNum() == n) {
			System.out.println(first.getData());
		}
		else {
		    search(first.getNext(), n);
		}
	}
	public static Node remove(Node bad) {
		if (bad == null) { throw new NoSuchElementException(); }
		bad = bad.getNext();
		Node some = bad;
		return some;
	}
	
	public static void main(String[] args) throws NoSuchElementException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name, address, customer number and year");
        Customer a1 = new Customer(input.next(), input.next(), input.nextInt(), input.next());
		Node one = new Node(a1);
		System.out.println("Enter name, address, customer number and year");
        Customer a2 = new Customer(input.next(), input.next(), input.nextInt(), input.next());
		one = new Node(a2, one);
		System.out.println("Enter name, address, customer number and year");
        Customer a3 = new Customer(input.next(), input.next(), input.nextInt(), input.next());
		one = new Node(a3, one);
		while (one != null) {
     		System.out.println(one.getData());
			one = one.getNext();
		}
		search(one, 1);
		Node two = one;
		while(two != null) {
			if(two.getData().getYear().equals("2015")) {
				System.out.println(two.getData().getName());
			}
			else {
				two = two.getNext();
			}
		}
		remove(two);
		
	}
}