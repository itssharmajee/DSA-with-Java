package LinkedList;

class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Floyds {
    
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail= newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public static boolean isCycle(){
        if(head== null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        head = new Node(12);
        head.next = new Node(13);
        head.next.next = new Node(14);
        head.next.next.next = head;

        System.out.println(isCycle());
    }
}


