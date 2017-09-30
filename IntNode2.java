public class IntNode2 {
    private String data;
	private IntNode2 next;
	public IntNode2 (String d, IntNode2 n) {
	    data = d;
		next = n;
	}
	public String getData() {
		return data;
	}
	public IntNode2 getNext() {
		return next;
	}
	public void setData(String newD) {
		data = newD;
	}
	public void setNext(IntNode2 newN) {
		next = newN;
	}
}
