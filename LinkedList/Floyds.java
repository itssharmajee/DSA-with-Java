package LinkedList;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Floyds {

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isCycle() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        // int count = 0;
        while (fast != null && fast.next != null) {
            // count++;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // System.out.println(count);
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detecting cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        // when cycle is not detecting
        if(cycle == false){
            return;
        }

        // removing cycle

        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev= fast;
            fast = fast.next;
        } 
        prev.next = null;
    }

    public static void main(String[] args) {
        // head = new Node(12);
        // head.next = new Node(13);
        // head.next.next = new Node(14);
        // head.next.next.next = head;
        // System.out.println(isCycle());



        head = new Node(12);
        Node temp = new Node(11);
        head.next = new Node(13);
        head.next.next = new Node(14);
        head.next.next.next = temp;
        temp.next=head.next.next;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());


    }
}
