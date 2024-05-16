package assignment.q2;

public class DequeLinkedListMain {

	public static void main(String[] args) {
		List l = new List();
		
		l.pushFirst(10);
		l.pushFirst(20);
		l.pushLast(30);
		l.pushLast(40);
		l.pushPos(15, 2);
//		l.popFirst();
//		l.popLast();
//		l.popPos(3);
		System.out.println("First element : "+l.fwdPeek());
		System.out.println("last element : "+l.backPeek());
		l.Fdisplay();

	}

}
