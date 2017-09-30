public class Customer {
    private String name;
	private String address;
	private int num;
	private String year;
	public Customer (String na, String a, int n, String y) {
		name = na;
		address = a;
		num = n;
		year = y;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getNum() {
		return num;
	}
	public String getYear() {
		return year;
	}	
	public void setName(String newNa) {
		name = newNa;
	}
	public void setAddress(String newA) {
		address = newA;
	}
	public void setNum(int newN) {
		num = newN;
	}
	public void setYear(String newY) {
		year = newY;
	}
	public String toString() {
		return "Name: " + name + 
		       " ,Address: " + address +
			   " ,Customer number: " + num + 
			   " ,Date(year)when the customer last placed an order: " + year;
	}
}	