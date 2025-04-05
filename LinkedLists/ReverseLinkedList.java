package LinkedLists;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class ReverseLL{
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
    
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next =  prev;
            prev = current;
            current = next;                
        }
        head = prev;
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


public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Original Linked List:");
        list.display(); // 1 -> 2 -> 3 -> 4 -> null

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display(); // 4 -> 3 -> 2 -> 1 -> null
    }
}
