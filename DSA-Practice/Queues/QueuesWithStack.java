package Queues;

import java.util.LinkedList;
import java.util.Queue;

// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.

// Approaches:

// 1. Using 2 Queues (Push operation costly)
    // We use 2 queues: q1 and q2. We will use q1 for primary operations like push and pop and q2 for temporary storage.
    // Push operation: The new element is always enqueued to q2. Then we dequeue all the elements from q1 and enqueue them to q2. Then we swap the names of q1 and q2.

// 2. Using 1 Queues (Pop operation costly)
    // We use 1 queue: q1. We will use q1 for all operations.
    // Push operation: The new element is always enqueued to q1.
    // Pop operation: We dequeue all the elements from q1 except the last one and enqueue them back to q1. Finally, we dequeue the last element and return it.

// 3. For frequent pops, Use push costly.
// - For frequent pushes, use pop costly.

class MyStackPush{
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStackPush(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        // Step 1: Add new element to queue2
        q2.add(x);

        // Step 2: Transfer all elements from queue1 to queue2
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

         // Step 3: Swap the queues
         Queue<Integer> temp = q1;
         q1 = q2;
         q2 = temp;
    }

    public int pop(){
        // Remove the element from the front of queue1
        if(q1.isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        // Remove the element from the front of queue1
        return q1.poll();
    }

    public int top(){
        if(q1.isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        // Return the front element of queue1
        return q1.peek();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }
}

class MyStackPop{
    private Queue<Integer> queue;

    public MyStackPop(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        queue.add(x);
    }

    public int pop(){
        if(queue.isEmpty()){
            System.out.println("Empty");
            return -1;
        }

        int size = queue.size();
        for(int i = 0; i < size - 1; i++){
            queue.add(queue.poll());
        }

        return queue.poll();
    }

    public int top(){
        if(queue.isEmpty()){
            System.out.println("Empty");
            return -1;
        }

        int size = queue.size();
        int top = -1;
        for(int i = 0; i < size; i++){
            top = queue.poll();
            queue.add(top);
        }
        return top;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}

public class QueuesWithStack {
    public static void main(String[] args) {
        MyStackPush pushstack = new MyStackPush();

        //MyStackPop popstack = new MyStackPop();

        pushstack.push(10);
        pushstack.push(20);
        pushstack.push(30);
    
        System.out.println(pushstack.top());    // Output: 30
        System.out.println(pushstack.pop());    // Output: 30
        System.out.println(pushstack.pop());    // Output: 20
    
        System.out.println(pushstack.isEmpty()); // Output: false
        System.out.println(pushstack.pop());    // Output: 10
        System.out.println(pushstack.isEmpty()); // Output: true
    }

}

