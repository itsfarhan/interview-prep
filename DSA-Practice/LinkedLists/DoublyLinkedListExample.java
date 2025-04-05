package LinkedLists;

class Node{
    int data;
    Node prev, next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLL{
    Node head;
    
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // Connect new node with head
        newNode.next = head; 
        // Connect head with new node
        head.prev = newNode; 
        // New node becomes head
        head = newNode; 
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        // Go to last node
        while(current.next != null){
           current = current.next;
        }

        // Now current is at last node
        current.next = newNode; 
        // Connect new node with last node
        newNode.prev = current; 

        // Connect new node with last node (tail)
        // tail.next = newNode;
        // newNode.prev = tail;
        // tail = newNode;
    }

    public void deleteFromStart() {
        // Case 1: If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        // Case 2: If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }
        
        // Case 3: Normal case - Multiple nodes
        head = head.next;    // Move head to second node
        head.prev = null;    // Break connection with old first node
    }

    public void deleteFromEnd() {
        // Case 1: If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        // Case 2: If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }
        
        // Case 3: Normal case
        Node current = head;
        // Go to last node
        while (current.next != null) {
            current = current.next;
        }
        // Now current is at last node
        // Break connections
        current.prev.next = null;
    }

    public void displayForward(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        if (head == null) return;

        Node current = head;

        //Step 1: Go to last node
        while(current.next != null){
            current = current.next;
        }
        //Step 2: Traverse backward
        while(current != null){
            System.out.print(current.data + " <-> ");
            current =  current.prev;
        }
        // Print null
        System.out.println("null");
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();

        System.out.println("Insert at the beginning");
        doublyLL.insertAtStart(10);
        doublyLL.insertAtStart(20);
        doublyLL.insertAtStart(30);
        doublyLL.displayForward();

        System.out.println("Inserting at the end");
        doublyLL.insertAtEnd(40);
        doublyLL.insertAtEnd(50);
        doublyLL.displayForward();

        System.out.println("Display Backward");
        doublyLL.displayBackward();
    }
}
