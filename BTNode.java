public class BTNode {
    private int data;
	private BTNode left;
	private BTNode right;
	public BTNode(int d) {
	   data = d;
	   left = null;
	   right = null;
	}
	public BTNode(int d, BTNode l, BTNode r) {
       data = d;
       left = l;
       right = r;
	}
    public int getData() {
		return data;
	}
	public BTNode getLeft() {
		return left;
	}
	public BTNode getRight() {
		return right;
	}
	public void setData(int d) {
		data = d;
	}
	public void setLeft(BTNode l) {
		left = l;
	}
	public void setRight(BTNode r) {
		right = r;
	}
	public static void inOrder(BTNode root) {
		if(root != null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
	public static void postOrder(BTNode p) {
		if(p.getLeft() != null) {
			postOrder(p.left);
		}
        if(p.getRight() != null) {
			 postOrder(p.right);
		}
		System.out.println(p.getData());
	}
	public static int height(BTNode root) {
		int h = 0;
		if(root == null) {
			return 0;
		}
		else {
			return (1 + Math.max(height(root.left), height(root.right)));
		}
	}
	public static int count(BTNode r) {
		if(r != null) {
			return (1 + count(r.left) + count(r.right));
		}
		else {
			return 0;
		}
	}
	public static BTNode bSearch(BTNode root, int val) {
		BTNode current;
		boolean found = false;
		current = root;
		while(current != null && !found) {
			if(current.getData() == val) {
				found = true;
			}
			else if(val < current.getData()) {
				current = current.getLeft();
			}
			else {
				current = current.getRight();
			}
		}
		return current;
	}
	public static int sum(BTNode root) {
		int val = 0;
		if(root != null) {
			val = root.getData();
			return val + sum(root.getLeft()) + sum(root.getRight());
		}
		else {
			return 0;
		}
	}
	public static void draw(BTNode root) {
		if(root != null) {
			System.out.println("     " + root.getData());
			System.out.println("    /" + " \\");
			if(root.getLeft() != null) {
				System.out.print("   " + root.getLeft().getData());
				//draw(root.getLeft());
			}
			if(root.getRight() != null) {
				System.out.print("   " + root.getRight().getData());
				//draw(root.getRight());
			}
		}
	}
	
	
	public static void main(String[] args) {
		BTNode one = new BTNode(1);
		BTNode two = new BTNode(2);
		BTNode root = new BTNode(3, one, two);
		System.out.println(count(root));
		int h = height(root);
		inOrder(root);
		postOrder(root);
		bSearch(root, 1);
		System.out.println(sum(root));
		draw(root);
		
	}
}
		
		
			
		

		

		 