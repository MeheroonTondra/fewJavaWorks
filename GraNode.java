public class GraNode {
    private int data;
	private GraNode next;
	public GraNode(int d, GraNode n) {
       data = d;
       next = n;
	}
    public int getData() {
	   return data;
	}
	public GraNode getNext() {
		return next;
	}
	public void setData(int d) {
		data = d;
	}
	public void setNext(GraNode n) {
		next = n;
	}
}
    