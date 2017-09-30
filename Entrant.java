public class Entrant {
   private String name;
   private int entryNum;
   private int time;
   public Entrant(String n, int e, int t) {
      name = n;
	  entryNum = e;
	  time = t;
	}
	public String getName() {
	   return name;
	}
	public int getEntryNum() {
	   return entryNum;
	}
	public int getTime() {
	   return time;
	}
	public void setName(String newN) {
	   name = newN;
	}
	public void setEntryNum(int newE) {
	   entryNum = newE;
	}
	public void setTime(int newT) {
	   time = newT;
	}
	public String toString() {
		return "Name: " + name + ", Entry number: " + entryNum + ", Time: " + time + " minutes";
    }
}