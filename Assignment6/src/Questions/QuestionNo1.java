package Questions;

public class QuestionNo1 {
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int val) {
			data = val;
			left = null;
			right=null;
			
			
		}
		
		
		
	}
	
	Node root;
	public QuestionNo1() {
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
		
	}

	public void inOrder() {
		inOrder(root);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		QuestionNo1 list= new QuestionNo1();
		list.addNode(10);
		list.addNode(14);
		list.inOrder();
	
	}

}
