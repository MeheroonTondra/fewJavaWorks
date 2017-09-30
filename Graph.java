import java.util.*;
public class Graph {  // collection of vertex and edge classes and use arraylist for implementation
    private ArrayList<Vertex> vertex;
	private ArrayList<Edge> edge;
	public Graph(ArrayList<Vertex> v, ArrayList<Edge> e) { //constructor 
		vertex = v;
		edge = e;
	}
	//accessor methods
	public ArrayList<Vertex> getVertex() {
		return vertex;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	//mutator methods
	public void setVertex(ArrayList<Vertex> v) {
		vertex = v;
	}
	public void setEdge(ArrayList<Edge> e) {
		edge = e;
	}
	// update methods
    public void addEdge(int val, Vertex a, Vertex b) {
		Edge e2 = new Edge(val, a, b);
	}
	public void addVertex(int val, Vertex a) {
	    Vertex b = new Vertex(val, null, null);
		b.setAdjVertex(a);
	}
	public void removeEdge(Vertex a, Vertex b) {
		a.setNext(null);
		b.setNext(null);
	}
	public void removeVertex(Vertex a) {
		Vertex b = new Vertex(0, null, null);
		b = a;
		a.setNext(null);
		a = a.getAdjVertex();
		
	}
	// main method
	public static void main(String[] args) {
		Vertex v1 = new Vertex(9, null, null);
		Vertex v2 = new Vertex(11, null, null);
		Edge e1 = new Edge(1, v1, v2);
		v1.setNext(e1);
		v1.setAdjVertex(v2);
		v2.setAdjVertex(v1);
		ArrayList<Vertex> v = new ArrayList<Vertex>();
		ArrayList<Edge> e = new ArrayList<Edge>();
		v.add(v1);
		v.add(v2);
		e.add(e1);
		Graph g = new Graph(v, e); //graph object
		Vertex v3 = new Vertex(2, null, null);
		Vertex v4 = new Vertex(4, null, null);
		g.addEdge(7, v3, v4);
		
	}
}