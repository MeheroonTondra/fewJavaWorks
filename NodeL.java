public class NodeL{
   private Entrant data;
   private NodeL next;
   public NodeL(Entrant d, NodeL n) {
      data = d;
	  next = n;
	}
	public Entrant getData() {
		return data;
    }
	public NodeL getNext() {
		return next;
	}
	public void setData(Entrant newD) {
		data = newD;
	}
	public void setNext(NodeL newN) {
		next = newN;
	}
	public String getName() {
	   return data.getName();
	}
	public int getEntryNum() {
	   return data.getEntryNum();
	}
	public int getTime() {
	   return data.getTime();
	}
	public void setName(String newN) {
	   data.setName(newN);
	}
	public void setEntryNum(int newE) {
	   data.setEntryNum(newE);
	}
	public void setTime(int newT) {
	   data.setTime(newT);
	}
	
	public static NodeL remove(NodeL some, int num) {
		if(some.getData().getEntryNum() == num) {
			some = some.getNext();
		}
		else {
			remove(some.getNext(), num);
		}
		return some;
	}
	
	public static NodeL change(NodeL some, int t) {
		if(some.getData().getEntryNum() == t) {
			NodeL current = some;
			current.getData().setTime(t);
			some = current;
		}
		else {
			change(some.getNext(), t);
			}
		return some;
	}
			
	
	public static void main(String[] args) {
		Entrant one = new Entrant("Tom", 1, 0);
		Entrant two = new Entrant("Lom", 2, 4);
		Entrant three = new Entrant("Ann", 3, 6);
		Entrant four = new Entrant("Wood", 4, 3);
		Entrant five = new Entrant("Water", 5, 6);
		Entrant six = new Entrant("Silver", 6, 2);
		Entrant seven = new Entrant("Elizabeth", 7, 4);
		NodeL a = new NodeL(one, null);
		a = new NodeL(two, a);
		a = new NodeL(three, a);
		a = new NodeL(four, a);
		a = new NodeL(five, a);
		a = new NodeL(six, a);
		a = new NodeL(seven, a);
		
		NodeL b = remove(a, 5);
		
        NodeL c = change(a, 6);
		
		while (a != null) {
			System.out.println(a.getData());
			a = a.getNext();
		}
	}
}
		
		
		