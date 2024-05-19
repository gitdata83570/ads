package Questions;



public class QuestionNo3 {
	
	
	class Node {
		int data ;
		Node left;
		Node right;
		
		
		public Node(int val) {
			data = val;
			left=null;
			right=null;
			
			
			
		}

	}

	Node root;
	public QuestionNo3() {
		root=null;
		
	}
	
	public void addNode(int val) {
		root =addNode(val,root);
		
	}
	
	public Node addNode(int val, Node trav) {
		
		if(trav==null) {
			return new Node(val);
		}
		
		if(trav.data>val) {
			 trav.left=addNode(val, trav.left);
		}
		else {
			trav.right=addNode(val, trav.right);
		}
		
		return trav;
		
	}
	
	public void inOrder(Node trav) {  /// (L v R)
		
		if(trav==null) {
			return;
			
		}
		inOrder(trav.left);
		System.out.print(" "+ trav.data);
		inOrder(trav.right);
		System.out.println();
		
	}

	public void inOrder() {
		inOrder(root);
	}
	
	
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav = root;
		Node parent = null;
		
		while(trav != null) {
			
			if(key == trav.data)
				
				break;
			parent = trav;
			
			if(key < trav.data)
				
				trav = trav.left;
			
			else
				
				trav = trav.right;
		}
		if(trav == null)
			parent = null;
		return new Node[]{trav, parent};
	}
	
	public void deleteNode(int key) {
		
		Node ret[] = binarySearchWithParent(key);
		Node temp = ret[0], parent = ret[1];

		if(temp == null)
			return;

		if(temp.left != null && temp.right != null){
			//1. find predecessor of temp node
			Node pred = temp.right;
			parent = temp;
			while(pred.left != null){
				parent = pred;
				pred = pred.left;
			}
			
			temp.data = pred.data;
			
			temp = pred;
		}
		
		if(temp.left == null){
			if(temp == root)				
				root = temp.right;
			else if(temp == parent.left)		
				parent.left = temp.right;
			else if(temp == parent.right)	
				parent.right = temp.right;

		}
		
		else {
			if(temp == root)				
				root = temp.left;
			else if(temp == parent.left)		
				parent.left = temp.left;
			else if(temp == parent.right)	
				parent.right = temp.left;
		}
	}
	
	
	public void deleteAll() {
		root = null;
	}
	
	public static void main(String[] args) {
		
		QuestionNo3 list = new QuestionNo3();
		list.addNode(10);
		list.addNode(14);
		list.addNode(15);
		list.addNode(16);
		list.addNode(18);
		list.inOrder();
		list.deleteNode(10);
		list.inOrder();
	}

}
