public class IntNode {
    private int data;
	private IntNode next;
	public IntNode (int d, IntNode n) {
	    data = d;
		next = n;
	}
	public int getData() {
		return data;
	}
	public IntNode getNext() {
		return next;
	}
	public void setData(int newD) {
		data = newD;
	}
	public void setNext(IntNode newN) {
		next = newN;
	}
}
