package Questions;

import Questions.QuestionNo1.Node;

public class QuestionNo2 {

	class Node {

		int data;
		Node left;
		Node right;

		public Node(int val) {
			data = val;
			left = null;
			right = null;

		}

	}

	Node root;

	public QuestionNo2() {
		root = null;
	}

	public void addNode(int val) {
		root = addNode(val, root);

	}

	public Node addNode(int val, Node trav) {

		if (trav == null) {
			return new Node(val);
		}

		if (trav.data > val) {
			trav.left = addNode(val, trav.left);
		} else {
			trav.right = addNode(val, trav.right);
		}

		return trav;

	}

	public void inOrder(Node trav) { /// (L v R)

		if (trav == null) {
			return;

		}
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);

	}

	public void inOrder() {
		inOrder(root);
	}

	public Node BinarySearch(int val) {
		return BinarySearch(root, val);

	}

	public Node BinarySearch(Node trav, int val) {

		if (trav == null) {
			return null;
		}
		if (trav.data == val) {
			return trav;
		} else if (trav.data > val) {

		return BinarySearch(trav.left, val);

		} else {
			return BinarySearch(trav.right, val);
		}

		
	}

	public static void main(String[] args) {

		QuestionNo2 list = new QuestionNo2();
		list.addNode(10);
		list.addNode(14);
		list.addNode(15);
		list.addNode(16);
		list.addNode(18);
		
		
	//	list.inOrder();
		Node temp = list.BinarySearch(15);
		if (temp == null) {
			System.out.println("key is not found ");

		} else {
			System.out.println("key is found ");
		}
	}

}
