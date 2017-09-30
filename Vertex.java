public class Vertex { // doubly linked list vertex node
    private int element;
	private Edge next;
	private Vertex adjVertex;
	public Vertex(int e, Edge n, Vertex v) { // constructor
       element = e;
       next = n;
	   adjVertex = v;
	}
	//accessor
    public int getElement() {
	   return element;
	}
	public Edge getNext() {
		return next;
	}
	public Vertex getAdjVertex() {
		return adjVertex;
	}
	//mutator
	public void setElement(int e) {
		element = e;
	}
	public void setNext(Edge n) {
		next = n;
	}
	public void setAdjVertex(Vertex v) {
		adjVertex = v;
	}
}