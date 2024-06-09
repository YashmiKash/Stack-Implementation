package stack;


public class Deque {
	 
	    private LinkedList deque;

	    public Deque() {
	        deque = new LinkedList(0);
	    }

	    public void push(int data) {
	        deque.push();
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return deque.pop();
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return deque.peek();
	    }


	public boolean isEmpty() {
        return ((CharSequence) deque).isEmpty();
    }
 
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after popping: " + stack.peek());
    }
}