package LinkedList;
//import java.util.*;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // creating new node 
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step-2  it is now head 
        newNode.next=head;// linking that it is now head 

        // step-3 
        head=newNode;

    }

    // adding last node 
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    // printing all nodes 
    public void print(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // Adding in the middle or paricular index 
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            if (temp == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            temp=temp.next;
            i++;
        }

        // finally we reached to the just before index that is idx-1
        newNode.next=temp.next;
        temp.next=newNode;   
    }
     // removing first node 
    public int removeFirst(){
        
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //  removing last node

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data; // tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;


    }


    public static void main(String agrv[]){
        LinkedList l1=new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        // l1.print();
        l1.addFirst(3);
        // l1.print();
        l1.addLast(10);
        //l1.print();
        //System.out.println(l1.size);
        l1.add(2, 12);
        l1.print();
        System.out.println(l1.size);
        // System.out.println(l1.removeFirst());
        // l1.print();
        // System.out.println(l1.size);

        l1.removeLast();
        System.out.println(l1.size);
        l1.print();

    }
}
