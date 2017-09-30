import java.util.PriorityQueue;

public class MinHeap_PQ {
	PriorityQueue<Integer> pq;
	private int size;
	private int count;
    //constructor 
	public MinHeap_PQ() {
		pq = new PriorityQueue<Integer>();
		size = 0;
		count = 0;
	}
     //method for adding new values in priority queue
	public void insert(int[] x) {
		for (int i = 0; i < x.length; i++) {
			pq.offer(x[i]);
			size = size + 1;
			count = count + 1;
		}
	}
	//to get the counter
	public int QueCount() {
		return count;
	}

	public int peek() {
		return pq.peek();
	}

	public int extractMin() {
		return pq.poll();
	}
    //size of the queue
	public int getSize() {
		return pq.size();
	}
	public void setSize(int s) {
		size = s;
	}
	//removing minimum value from the queue
	public void removeMin(int [] arrA) {
		int v = arrA[1];
		arrA[1] = arrA[getSize() - 1];
		size--;
	}
    
	public void print() {
		System.out.println(pq);
	}
    //main method for implementation
	public static void main(String[] args) {
		int[] arrA = { 1, 6, 2, 9, 4, 3, 8 };
		MinHeap_PQ i = new MinHeap_PQ();
		i.insert(arrA);
		i.print();
		System.out.println("Min Element in the Priority Queue: "
				+ i.extractMin());
		System.out.println("Min Element in the Priority Queue: "
				+ i.extractMin());
		System.out.println("Min Element in the Priority Queue: "
				+ i.extractMin());
		System.out.println("Priority Queue Size: " + i.getSize());
		
	}
}