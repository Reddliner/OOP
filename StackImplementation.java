/* Lab Record - 31
 * Write a Java program to implement a stack with push and pop operations. Find the top element
 * of the stack and check if it is empty or not.
 */

import java.util.EmptyStackException;

public class StackImplementation {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to store stack elements
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack
    public StackImplementation(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value; // Increment top and insert element
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedValue = stackArray[top--]; // Get element and decrement top
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    // Method to get the top element of the stack
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        StackImplementation stack = new StackImplementation(5);

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
}
