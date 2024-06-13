package LinkedList;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Doubly {
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        System.out.print("null");
        while (temp !=null) {
            System.out.print(temp.data + " <-> ");
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Doubly dll = new Doubly();
        dll.addFirst(12);
        dll.addFirst(13);
        dll.addFirst(14);
        dll.addFirst(16);

    }
}
