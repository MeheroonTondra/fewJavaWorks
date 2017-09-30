public class HashTable {
	private Students[] table;
	private int key;
	//constructor
	public HashTable(Students a, Students b, Students c) {
		table = new Students[10];
		table[0] = a;
		table[1] = b;
		table[2] = c;
		
	}
	//accessor method
	public int getKey() {
		return key;
	}
	
	//method for searching the values using linear probing and first hash function
    public int get(int key) {
		int hash = (key % 10);
		while(table[hash] != null && table[hash].getNumber() != key) {
			hash = (hash + 1) % 10;
		}
		if(table[hash] == null) {
			return -1;
		}
		else {
			return table[hash].getNumber();
		}
	}
	//adding new entries in the table using linear probing and first hash function
	public void add(int key, Students a) {
		int hash = (key % 10);
		while (table[hash] != null && table[hash].getNumber() != key) {
			hash = (hash + 1) % 10;
			table[hash] = a;
		}
	}
	
	//method for searching the values using linear probing and second hash function
    public int get2(int key) {
		int hash = ((key - 120) % 10);
		while(table[hash] != null && table[hash].getNumber() != key) {
			hash = (hash + 1) % 10;
		}
		if(table[hash] == null) {
			return -1;
		}
		else {
			return table[hash].getNumber();
		}
	}
	//adding new entries in the table using linear probing and second hash function
	public void add2(int key, Students a) {
		int hash = ((key - 120) % 10);
		while (table[hash] != null && table[hash].getNumber() != key) {
			hash = (hash + 1) % 10;
			table[hash] = a;
		}
	}
	
	//method for searching values using seperate chaining and first hash function
	public int access(int key) {
		int hash = (key % 10);
		if (table[hash] == null) {
			return -1;
		}
		else {
			Students entry = table[hash];
			while (entry != null && entry.getNumber() != key) {
				entry = entry.getNext();
			}
			if(entry == null) {
				return -1;
			}
			else {
				return entry.getNumber();
			}
		}
	}	
	
	//method for adding new entries to the table using seperate chaining and first hash function
	public void update(int key, int k, String n, int g) {
		int hash = (key % 10);
		if(table[hash] == null) {
			table[hash] = new Students(k, n, g);
		}
		else {
			Students entry = table[hash];
			while(entry.getNext() !=null && entry.getNumber() != key) {
				entry = entry.getNext();
			}
			if(entry.getNumber() == key) {
				entry.setNumber(k);
			}
			else {
				entry.setNext(new Students(k, n, g));
			}
		}
	}
	
	//method for searching values using seperate chaining and second hash function
	public int access2(int key) {
		int hash = (key % 10);
		if (table[hash] == null) {
			return -1;
		}
		else {
			Students entry = table[hash];
			while (entry != null && entry.getNumber() != key) {
				entry = entry.getNext();
			}
			if(entry == null) {
				return -1;
			}
			else {
				return entry.getNumber();
			}
		}
	}	
	
	//method for adding new entries to the table using seperate chaining and second hash function
	public void update2(int key, int k, String n, int g) {
		int hash = (key % 10);
		if(table[hash] == null) {
			table[hash] = new Students(k, n, g);
		}
		else {
			Students entry = table[hash];
			while(entry.getNext() !=null && entry.getNumber() != key) {
				entry = entry.getNext();
			}
			if(entry.getNumber() == key) {
				entry.setNumber(k);
			}
			else {
				entry.setNext(new Students(k, n, g));
			}
		}
	}
	
	
	//main method 
	public static void main(String[] args) {
		Students one = new Students(201555661, "one", 80);
		Students two = new Students(201534594, "two", 70);
		Students three = new Students(201642312, "three", 90);
		HashTable data = new HashTable(one, two, three); //inputting and storing data in hash table
		
		//inputting number and outputing values using linear probing, both functions
		data.add(201555661, one);
		data.add(201534594, two);
		data.add(201642312, three);
		System.out.println(data.get(201555661));
		System.out.println(data.get(201534594));
		System.out.println(data.get(201642312));
		
		data.add2(201555661, one);
		data.add2(201534594, two);
		data.add2(201642312, three);
		System.out.println(data.get2(201555661));
		System.out.println(data.get2(201534594));
		System.out.println(data.get2(201642312));
		
		//inputting number and outputing values using seperate chaining, both functions
		data.update(201555661, 201555661, "one", 80);
		data.update(201534594, 201534594, "two", 70);
		data.update(201642312, 201642312, "three", 90);
		System.out.println(data.access(201555661));
		System.out.println(data.access(201534594));
		System.out.println(data.access(201642312));
		
		data.update2(201555661, 201555661, "one", 80);
		data.update2(201534594, 201534594, "two", 70);
		data.update2(201642312, 201642312, "three", 90);
		System.out.println(data.access2(201555661));
		System.out.println(data.access2(201534594));
		System.out.println(data.access2(201642312));

		
	}
}
		

	
	
      


		
		
	
			
			
		

	
	

	   