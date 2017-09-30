public class Edge { // doubly linked list edge node
    private int data;
	private Vertex previous;
	private Vertex next;
	public Edge(int d, Vertex p, Vertex n) { //contructor
       data = d;
	   previous = p;
       next = n;
	}
	//accessor
    public int getData() {
	   return data;
	}
	public Vertex getPrevious() {
		return previous;
	}
	public Vertex getNext() {
		return next;
	}
	//mutator
	public void setData(int d) {
		data = d;
	}
	public void setPrvious(Vertex p) {
		previous = p;
	}
	public void setNext(Vertex n) {
		next = n;
	}
}