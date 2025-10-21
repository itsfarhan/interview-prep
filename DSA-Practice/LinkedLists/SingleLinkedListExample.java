package LinkedLists;

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList{
    Node head;

    public void insertAtStart(int data){
        //Create a new node
        Node newNode = new Node(data);
        
        // Connect new Node with Head.
        newNode.next = head;
        // New Node becomes head
        head = newNode;
    }

    //Inserting at the End
    public void insertAtEnd(int data){
        // Create a new node 
        Node newNode = new Node(data);
        // if list is empty
        if(head == null){
            head = newNode; // create a new head
            return;
        }

        // Traverse to reach at End.
        Node current = head; //Start from head
        while(current.next != null){
            // Traverse till you get last node 
            current = current.next; // Move forward.
        }
        // Adding a new node after last node
        current.next = newNode; 
    }

    public void deleteAtStart(){
        // If head is empty, nothing to delete
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        // Moving head to second node
        head = head.next;
    }

    public void deleteAtEnd(){
        // if head is null, list is empty.
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        //if only 1 head exists
        if(head.next == null){
            head = null;
            return;
        }

        // Assigning current as head
        Node current = head;

        // Traverse till second last node
        while(current.next.next != null){ //current.next.next == current -> node -> node
            current = current.next; //assinging current as second last node
        }
        // Removed last node by assinging second last node.next as null
        current.next = null;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SingleLinkedListExample {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("List after inserting at the end:");
        list.display(); // 10 -> 20 -> 30 -> null

        list.insertAtStart(5);
        System.out.println("List after inserting at the beginning:");
        list.display(); // 5 -> 10 -> 20 -> 30 -> null

        list.deleteAtStart();
        System.out.println("List after deleting from the beginning:");
        list.display(); // 10 -> 20 -> 30 -> null

        list.deleteAtEnd();
        System.out.println("List after deleting from the end:");
        list.display(); // 10 -> 20 -> null
    }
}