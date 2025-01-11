package LinkedLists;

// Problem: Merge Two Sorted Linked Lists
// Given two sorted linked lists, merge them into one sorted linked list in such a way that the resulting list is also sorted. The merge should be performed in-place without using any extra space.
// 
// Example
// Input:
// List 1: 1 -> 3 -> 5 -> null
// List 2: 2 -> 4 -> 6 -> null
// 
// Output:
// Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
// 
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MergeSortedLL{
    Node head;

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
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +" -> ");
        }
        System.out.println("null");
    }

    public static Node mergeSortList(Node l1, Node l2){
        // Assign dummy head
        Node dummy = new Node(0);
        Node current = dummy; // Current builds new list

        //Keep comparing and adding smaller number until one list ends
        while(l1 != null && l2 != null){
            //compare both lists head
            if(l1.data <= l2.data){
                current.next = l1; // if list1 is smaller then add them
                l1 = l1.next; // Ready the next node in list
            } else{
                    current.next = l2; // if list2 is smaller then add them
                    l2 = l2.next; // Ready the next node in list
            }
            current = current.next; // Move to new list
        }

        if(l1 != null){ //if list1 is not empty, add them.
            current.next = l1;
        } else if (l2 != null){ //if list2 is not empty, add them.
            current.next = l2;
        }
        return dummy.next; // After dummy, actual list starts.
    }
}

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        MergeSortedLL list1 = new MergeSortedLL();
        MergeSortedLL list2 = new MergeSortedLL(); 

        list1.insertAtEnd(1);
        list1.insertAtEnd(3);
        list1.insertAtEnd(5);

        list2.insertAtEnd(2);
        list2.insertAtEnd(4);
        list2.insertAtEnd(6);

        list1.display();

        list2.display();

        Node mergedHead = MergeSortedLL.mergeSortList(list1.head, list2.head);

        System.out.println("Merged List: ");
        Node current = mergedHead;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
