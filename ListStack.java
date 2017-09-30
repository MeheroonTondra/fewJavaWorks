public class ListStack {
	private int capacity = 10;
	private IntNode first;
	private IntNode current;
    private IntNode top;
	private int size;
	public ListStack(int value) {
	   first = new IntNode(value, null);
	   current = first;
	   top = null;
	   size = 0;
	}
	public IntNode getTop() {
		return top;
	}
	public int getSize() {
		return size;
	}
	public void setTop(IntNode t) {
		top = t;
	}
	public void setSize(int s) {
		size = s;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public int size1() {
		return size;
	}
	public void push(int value) {
		if (capacity == 10) {
			first = new IntNode(value, current);
			first.setNext(top);
			top = first;
			size = size + 1; 
		}
		else {
			current = new IntNode(value, current); 
			current.setNext(top);
			top = current;
			size = size + 1;
		}
	}
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		else {
			return top.getData();
		}
	}
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		else {
			int v = top.getData();
			top = top.getNext();
			size = size - 1;
			return v;
		}
	}
}