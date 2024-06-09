package stack;

public class LinkedList {
	 
	    int data;
	    LinkedList next;

	    public LinkedList(int data) {
	        this.data = data;
	        this.next = null;
	    }

		public void push() {
			// TODO Auto-generated method stub
			
		}

		public int pop() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int peek() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	class Stack {
	    private LinkedList top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(int data) {
	    	LinkedList newNode = new LinkedList(data);
	        if (top == null) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        int poppedData = top.data;
	        top = top.next;
	        return poppedData;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.data;
	    }

	    public boolean isEmpty() {
	        return top == null;
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


