// Problem: Min Stack
// A Min Stack is a stack data structure that, along with the standard stack operations (push, pop, and peek), supports an additional operation getMin, which retrieves the smallest element in the stack in O(1) time.

// Problem Statement
// Design a stack that supports the following operations efficiently:

// push(x) - Push element x onto the stack.
// pop() - Remove the element on the top of the stack.
// top() - Get the top element of the stack.
// getMin() - Retrieve the smallest element in the stack.
// Constraints
// All operations must run in O(1) time.
// Stack elements will be integers.

package Stacks;

import java.util.Stack;

class MinStack{
    Stack<Integer> mainstack;
    Stack<Integer> minstack;

    public MinStack(){
        mainstack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x){
        mainstack.push(x);
        if(minstack.isEmpty() || x <= minstack.peek()){
            minstack.push(x);
        }
    }

    public void pop(){
        if(!mainstack.isEmpty()) {
            mainstack.pop();
            minstack.pop();
        }
    }

    public int top(){
        if (!mainstack.isEmpty()){
            return mainstack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int getMin(){
        if (!minstack.isEmpty()){
            return minstack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
}

public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Minimum: " + minStack.getMin()); // 2
        minStack.pop();
        System.out.println("Minimum: " + minStack.getMin()); // 3
        minStack.pop();
        System.out.println("Top: " + minStack.top());         // 3
        System.out.println("Minimum: " + minStack.getMin()); // 3
    }
}

// Approach
// Key Idea:
// To ensure that getMin works in constant time, we use a second stack (minStack) to keep track of the minimum element at each step.

// Two Stacks:
// Main Stack: Stores all elements.
// Min Stack: Stores the current minimum at each operation.

// Workflow:
// =========
// Push:
// Push the element to the mainStack.
// For minStack, push the element if it is smaller or equal to the current minimum. 
// Otherwise, push the current minimum again.

// Pop:
// Pop elements from both mainStack and minStack.

// Top:
// Return the top element of the mainStack.

// GetMin:
// Return the top element of the minStack (current minimum).