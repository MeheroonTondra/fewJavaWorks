import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
public class LinkedQueue {
    private IntNode2 front;
    private IntNode2 rear;
    private int size;
    public LinkedQueue() {
		front = null;
		rear = null;
		size = 0;
	} 
	public IntNode2 getFront() {
		return front;
	}
	public IntNode2 getRear() {
		return rear;
	}
	public int getSize() {
		return size;
	}
	public void setFront(IntNode2 f) {
		front = f;
	}
	public void setRear(IntNode2 r) {
		rear = r;
	}
	public void setSize(int s) {
		size = s;
	}
	public boolean isEmpty() {
		return (front == null);
	}
   
    public void add(String data) {
        IntNode2 node = new IntNode2(data, null);
        if (rear == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
			rear = rear.getNext();
        }
        size++;
    }

    public String remove() {
        if (front == null) {
            return "empty queue";
        }
        IntNode2 node = front;
        front = node.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return node.getData();
    }

    public String peek() {
        if (isEmpty()) {
			return "empty queue";
        }
        return front.getData();
    }

    public void process() throws FileNotFoundException {
		FileReader file1 = new FileReader("document.txt");
		Scanner input = new Scanner(file1);
		PrintWriter out = new PrintWriter("doc2.txt");
		String value = "";
		while(input.hasNext()) {
			value = input.next();
		    add(value);
		}
		int n = 1;
		while(peek() == "{" || peek() == "}") {
		    front.setData("(Endnote " + n + ")");
			out.print(remove());
			front = front.getNext();
			n = n + 1;
		}
		input.close();
		out.close();
	}
}