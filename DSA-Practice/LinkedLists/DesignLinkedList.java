// Problem Statement - Implement Linkedlist

// Input:

// ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
// [[], [1], [3], [1, 2], [1], [1], [1]]

// Output:
// [null, null, null, null, 2, null, 3]

// Explanation:

// 1. "MyLinkedList" creates an empty list.        => []
// 2. "addAtHead(1)" adds 1 at the head.           => [1]
// 3. "addAtTail(3)" adds 3 at the tail.           => [1, 3]
// 4. "addAtIndex(1, 2)" adds 2 at index 1.        => [1, 2, 3]
// 5. "get(1)" returns the value at index 1.       => 2
// 6. "deleteAtIndex(1)" deletes node at index 1.  => [1, 3]
// 7. "get(1)" returns the value at index 1.       => 3

// Approach
// Define a Node class for the linked list nodes.
// Implement the operations using a head pointer and optionally a tail pointer for easier tail operations.

package LinkedLists;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }  
}

class MyLinkedList{
    Node head;
    int size = 0;

    public int get(int index){
        if(index < 0 || index >= size) return -1;

        Node current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        return current.data;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void insertAtIndex(int index, int data){
        if (index < 0 || index > size) return;

        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for(int i = 0; i < index-1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index > size) return;

        if(index == 0){
            head = head.next;
            return;
        }
        Node current = head;
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}

public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.insertAtStart(1);             // [1]
        myLinkedList.insertAtEnd(3);               // [1, 3]
        myLinkedList.insertAtIndex(1, 2);    // [1, 2, 3]
        System.out.println(myLinkedList.get(1));  // 2
        myLinkedList.deleteAtIndex(1);            // [1, 3]
        System.out.println(myLinkedList.get(1));  // 3

    }
}
