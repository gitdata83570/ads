package assignment.q1;

public class StackUsingLinkedListMain {

	public static void main(String[] args) {
	   Stack st = new Stack();
	   
	   st.push(40);
	   st.push(30);
	   st.push(20);
	   st.push(10);
	   
	   System.out.println("Top element = "+st.peek());
	   System.out.println("Popped element = ");
	   while(!st.isEmpty()) {
		   System.out.print(" "+st.pop());
	   }

	}

}
