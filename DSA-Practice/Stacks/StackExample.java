// Custom implementation of Stacks using arrays

package Stacks;

class Stack{
    private int[] arr; //array created for stack
    private int top; //max or last of the stack
    private int capacity; //length of the stack

    public Stack(int size) { // size - length of the stack
        arr = new int[size]; 
        top = -1; // Empty stack
        capacity = size;
    }

    // Get size of the stack
    public int size(){
        return top + 1;
    }

    // Return Empty stack
    public boolean isEmpty(){
        return top == -1;
    }

    // Push a value in Stack
    public void push(int x){
        if (top == capacity - 1){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = x;
    }

    // Remove a value from stack
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    //Display entire stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        

        System.out.println("Top element is: "+ stack.peek());
        System.out.println("Size of Stack: "+ stack.size());

        System.out.println("Popped element: "+ stack.pop());
        System.out.println("Is stack empty? "+ stack.isEmpty());

        // Stack<Integer> stack = new Stack<>();

        // // Push elements into the stack
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println("Stack after pushing: " + stack);

        // // Peek the top element
        // System.out.println("Top element: " + stack.peek());

        // // Pop an element from the stack
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Stack after popping: " + stack);

        // // Check if the stack is empty
        // System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
