public class Queue {   
   private QueNode front;
   private QueNode back;
   private int count;
   private int size;
   //constructor for Queue class
   public Queue () { 
	   front = null;
	   back = null;
	   size = 0;
	   count = 0;
   }
   // accessor methods
   public QueNode getFront() {
	   return front;
   }
   public QueNode getBack() {
	   return back;
   }
   //mutator methods
   public void setFront(QueNode f) {
	   front = f;
   }
   public void setBack(QueNode b) {
	   back = b;
   }
   //to find size of queue
   public int QueSize() {
	   return size;
   }
   //to get the counter
   public int QueCount() {
	   return count;
   }
   public boolean isEmpty() {
	   return size == 0;
   }
   //insert method for adding values in priority queue
   public void insert(int val, int k) {
	   QueNode current = new QueNode(val, k, null);
	   if (back == null) {
		   front = current;
		   back = current;
	   }
	   else {
		   back.setNext(current);
		   back = current;
	   }
	   count = count + 1;
	   size = size + 1;
   }
   public static QueNode search(QueNode n, int key) {
	   QueNode m = n;
	   while(m != null) {
		   if(m.getKey() < m.getNext().getKey()) {
			   return m;
		   }
		   else {
			   m = m.getNext();
		   }
	   }
	   return m;
   }
   //method for removing value with minimun key
   public int removeMin() {
	   int element = front.getData();
	   front = front.getNext();
	   if (front == null) {
		   back = null;
	   }
	   size = size - 1;
	   return element;
   }
   //main method for implementation 
   public static void main(String[] args) {
	   Queue one = new Queue();
	   one.insert(5, 1);
	   one.insert(3, 2);
	   one.insert(7, 3);
	   System.out.println(one.getFront().getData());
	   one.removeMin();
	   System.out.println(one.getFront().getData());
   }
}  

   
	   