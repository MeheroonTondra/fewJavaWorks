public class Students {
    private int number;
	private String name;
	private int grade;
	private Students next;
	//constructor
	public Students(int k, String n, int g) {
	   number = k;
	   name = n;
	   grade = g;
	   next = null;
	}
	//accessor methods
	public int getNumber() {
       return number;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public Students getNext() {
		return next;
	}
	//mutator methods
	public void setNumber(int k) {
		number = k;
	}
	public void setName(String n) {
		name = n;
	}
	public void setGrade(int g) {
		grade = g;
	}
	public void setNext(Students n) {
		next = n;
	}
}