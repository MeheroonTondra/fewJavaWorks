public class LeakyStack {
    private int[] data;
	private int top;
	private int size;
	public LeakyStack() {
	   data = new int[10];
	   top = -1;
	}
	public int[] getData() {
	   return data;
	}
	public int getTop() {
		return top;
	}
	public int getSize() {
		return size;
	}
	public void setData(int[] d) {
		data = d;
	}
	public void setTop(int t) {
		top = t;
	}
	public void setSize(int s) {
		size = s;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public int size1() {
		return size;
	}
	public void leak(int value) {
		int n = 0;
		if (!isEmpty()) {
			data[top] = data[n];
			n = n + 1;
			push(value);
		}
	}
	public void push(int value) {
		if (size == 10) {
			leak(value);
		}
		else {
			top = top + 1;
			data[top] = value;
			size = size + 1;
		}
	}
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		else {
			return data[top];
		}
	}
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		else {
			int v = data[top];
			top = top - 1;
			size = size - 1;
			return v;
		}
	}
}	
	