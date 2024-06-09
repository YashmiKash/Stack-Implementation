package stack;

public class ArrayBased {
	
	 
	    private int maxSize;
	    private int[] stackArray;
	    private int top;

	    public ArrayBased(int size) {
	        this.maxSize = size;
	        this.stackArray = new int[maxSize];
	        this.top = -1;
	    }

	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack is full. Cannot push element.");
	            return;
	        }
	        stackArray[++top] = element;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop element.");
	            return -1; // or throw an exception
	        }
	        return stackArray[top--];
	    }


public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty. Cannot peek element.");
        return -1; // or throw an exception
    }
    return stackArray[top];
}

public boolean isEmpty() {
    return (top == -1);
}

public boolean isFull() {
    return (top == maxSize - 1);
}
}
