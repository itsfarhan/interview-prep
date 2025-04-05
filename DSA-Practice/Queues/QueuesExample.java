package Queues;

class ArrayQueue{
    private int queue[];
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
        front = size = 0;
        rear = -1;
        this.capacity = capacity;
    }

    public int size(){
        return rear - front + 1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int x){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity; //Circular increment. Here modulo is used to wrap around the array.
        queue[rear] = x; // queue of rear array is assigned x
        size++; //size is incremented       
        System.out.println("Enqueued: " + x);
    }

    public int dequeue(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + x);
        return x;  
    }

    public int peek(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}

public class QueuesExample {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10); // [10]
        queue.enqueue(20); // [10, 20]
        queue.enqueue(30); // [10, 20, 30]

        System.out.println(queue.peek()); // Output: 10

        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20

        queue.enqueue(40); // [30, 40]
        queue.enqueue(50); // [30, 40, 50]

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}

/*
 * Queue<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek
        System.out.println("Front: " + queue.peek()); // Output: 10

        // Dequeue
        System.out.println("Removed: " + queue.poll()); // Output: 10
        System.out.println("Removed: " + queue.poll()); // Output: 20

        // Check if empty
        System.out.println("Is Empty? " + queue.isEmpty()); // Output: false
 */