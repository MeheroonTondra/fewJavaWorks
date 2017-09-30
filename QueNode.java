public class QueNode {
    private int data;
	private int key;
	private QueNode next;
	//constructor
	public QueNode (int d, int k, QueNode n) {
	    data = d;
		key = k;
		next = n;
	}
	//accessor methods
	public int getData() {
		return data;
	}
	public int getKey() {
		return key;
	}
	public QueNode getNext() {
		return next;
	}
	//mutator methods
	public void setData(int newD) {
		data = newD;
	}
	public void setKey(int newK) {
		key = newK;
	}
	public void setNext(QueNode newN) {
		next = newN;
	}
}
