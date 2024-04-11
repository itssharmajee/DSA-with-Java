public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  =data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

    public void addFirst (int data){
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // adding to the middle in the linedlist
    public void addMiddile(int data,int index){
        Node newNode = new Node(data);
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        size++;
        int count=0;
        while (count <index-1) {
            temp=temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next=newNode;

    }

    //  size of the linkedlist 
    // but we prefer to make it static properties
    /*public int size(){
        Node temp = head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        return i;
    }
    */

    // removing first element from the linkelist 
    public int removeFirst(){
        if(size==0){
            System.out.println("Empty linkedlist you can't remove it");
            return 0;
        }
        else if(size==1){
            int value = head.data;
            size =0;
            head=tail=null;
            return value;
        }
        size--;
        int deletedData = head.data;
        head=head.next;
        return deletedData;
    }
    

    // removing last element from the linkedlist 
    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty linked list, you can't remove from it.");
            return 0;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null; // Empty the list
            size = 0;
            return val;
        }
        Node temp = head;
            /*while (temp.next != tail) {
                temp = temp.next;
            }
            int val = tail.data;
            temp.next = null;
            tail = temp;
            size--;
            return val;
            */

            // you can do it using for loop as well
            for (int i = 0; i < size-2; i++) {
                temp = temp.next;
            }
            int val = tail.data;
            temp.next = null;
            tail = temp;
            return val;
    }
    
    public void print(){
        // case for null linkedList
        if(head == null){
            System.out.println("Empty linkedlist");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    // seaching a key in the linkedlist
    public static int searchElement(int key){
        Node temp = head;
        int idx = 0;
        while(temp!= null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }


    // reverse a linkedlist 
    public void reverseLinkedlist(){
        Node prev=null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // search a key recursively
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }

    // removing nth positioned element from the end of linkedlist
    // as you know we are using singly linkedlist so we are moving from head to tail
    // formula is that so find nth position from the end = (size - nth position +1 ) this 
    // will find the position from the starting 
    // another method is also there like firstly reversed linked then perform an action
    
    public static void deleteNthfromEnd(int n){
        // calculate the size
        int sz =0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }

        int i=1;
        Node prev = head;
        while (i<(sz-n+1)-1) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addFirst(1);
        li.addFirst(3);
        li.addLast(12);
        li.addLast(23);
        li.addLast(26);
        li.print();

        // li.addMiddile(20, 4);
        // li.print();


        // System.out.println(li.size());
        // System.out.println(li.removeFirst());
        // li.print();
        // li.removeFirst();
        // li.print();
        // System.out.println(li.size);
        


        // System.out.println(li.removeLast());
        // li.print();
        // System.out.println(head.next.data);
        // System.out.println(searchElement(120));
        // System.out.println(li.recursiveSearch(120));
        // System.out.println(li.recursiveSearch(23));


        
        // li.reverseLinkedlist();
        // li.print();


        deleteNthfromEnd(3);
        li.print();


    }
}
