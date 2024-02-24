// // // /*class Queue{
// // //     static int size;
// // //     static int front;
// // //     static int rear;
// // //     static int arr[];
// // //     Queue(int n){
// // //         arr=new int[n];
// // //         size=n;
// // //         rear=-1;
// // //     }

// // //     public static boolean isEmpty(){
// // //         return rear==-1;
// // //     }
// // //     //add
// // //     public static void Enqueue(int data){
// // //         if(rear==size-1){
// // //             System.out.println("Queue is full");
// // //             return;
// // //         }
// // //         rear=rear+1;
// // //         arr[rear]=data;
// // //     }
// // //     // remove

// // //     public static int Dequeue(){
// // //         if(isEmpty()){
// // //             System.out.println("empty queue");
// // //             return -1;
// // //         }

// // //         front=arr[0];
// // //         for(int i=0; i<rear; i++){
// // //             arr[i]=arr[i+1];
// // //         }
// // //         rear=rear-1;
// // //         return front;
// // //     }
// // //     //peek
// // //     public static int peek(){
// // //         if(isEmpty()){
// // //             System.out.println("empty queue");
// // //             return -1;
// // //         }
// // //         return arr[0];
// // //     }
// // // }

// // // public class Demo{
// // //     public static void main(String[] args) {
// // //         Queue q=new Queue(5);
// // //         System.out.println(q.isEmpty());
// // //         q.Enqueue(12);
// // //         q.Enqueue(13);
// // //         q.Enqueue(14);
// // //         q.Enqueue(15);

// // //         while(!q.isEmpty()){
// // //             System.out.println(q.peek());
// // //             q.Dequeue();
// // //         }
// // //         System.out.println("front element " + q.peek());
// // //     }
// // // }
// // // */



// // // // public class Demo {

// // // //     public static void main(String[] args) {
// // // //         // Creating an instance of the shared resource
// // // //         SharedResource sharedResource = new SharedResource();

// // // //         // Creating two threads with the same shared resource
// // // //         Thread thread1 = new Thread(new PrintTask(sharedResource));
// // // //         Thread thread2 = new Thread(new PrintTask(sharedResource));

// // // //         // Start the threads
// // // //         thread1.start();
// // // //         thread2.start();
// // // //     }

// // // //     // Shared resource class
// // // //     static class SharedResource {
// // // //         // Synchronized method to ensure thread safety
// // // //         synchronized void print(String message) {
// // // //             for (char ch : message.toCharArray()) {
// // // //                 System.out.print(ch);
// // // //                 try {
// // // //                     // Introducing a small delay to simulate real-world conditions
// // // //                     Thread.sleep(50);
// // // //                 } catch (InterruptedException e) {
// // // //                     e.printStackTrace();
// // // //                 }
// // // //             }
// // // //             System.out.println(); // Print a newline after the message
// // // //         }
// // // //     }

// // // //     // Task to be performed by each thread
// // // //     static class PrintTask implements Runnable {
// // // //         private SharedResource sharedResource;

// // // //         PrintTask(SharedResource sharedResource) {
// // // //             this.sharedResource = sharedResource;
// // // //         }

// // // //         @Override
// // // //         public void run() {
// // // //             // Synchronized block to ensure exclusive access to the shared resource
// // // //             synchronized (sharedResource) {
// // // //                 // Print the message using the shared resource's print method
// // // //                 sharedResource.print("My name is Rahul I am working in ABC Company.");
// // // //             }
// // // //         }
// // // //     }
// // // // }




// // // // class CustomException extends Exception {
// // // //     public CustomException(String message) {
// // // //         super(message);
// // // //     }
// // // // }

// // // // public class Demo {

// // // //     public static void main(String[] args) {
// // // //         try {
// // // //             // Simulate a condition that triggers an exception
// // // //             int result = divide(10, 0);

// // // //             // This line won't be reached if an exception occurs
// // // //             System.out.println("Result: " + result);
// // // //         } catch (CustomException e) {
// // // //             System.out.println("Caught CustomException: " + e.getMessage());
// // // //         } catch (ArithmeticException e) {
// // // //             System.out.println("Caught ArithmeticException: " + e.getMessage());
// // // //         } catch (Exception e) {
// // // //             System.out.println("Caught generic Exception: " + e.getMessage());
// // // //         } finally {
// // // //             System.out.println("Finally block - This will always execute.");
// // // //         }
// // // //     }

// // // //     static int divide(int numerator, int denominator) throws CustomException {
// // // //         try {
// // // //             if (denominator == 0) {
// // // //                 // Throw a custom exception if the denominator is zero
// // // //                 throw new CustomException("Cannot divide by zero.");
// // // //             }
// // // //             return numerator / denominator;
// // // //         } catch (ArithmeticException e) {
// // // //             // Wrap the ArithmeticException in a CustomException and re-throw
// // // //             throw new CustomException("Error during division: " + e.getMessage());
// // // //         }
// // // //     }
// // // // }

// // // import java.util.Scanner;

// // // public class Demo {

// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //          // Simulate a division operation
// // //         System.out.println("Enter Num");
// // //             int numerator = sc.nextInt();
// // //             System.out.println("Enter dem");
// // //             int denominator = sc.nextInt();
// // //         try {

// // //             if (denominator == 0) {
// // //             throw new ArithmeticException("Cannot divide by zero.");
// // //         }else{
// // //             System.out.println("Result: " + numerator/denominator);
// // //         }

// // //             // This line won't be reached if an exception occurs
            
// // //         } catch (ArithmeticException e) {
// // //             System.out.println("Caught ArithmeticException: " + e.getMessage());
// // //         } finally {
// // //             System.out.println("Finally block - This will always execute.");
// // //         }
// // //     }
// // // }


// // // public  class Demo{
// // //     static Object resource1=new Object();
// // //     static Object resource2=new Object();

// // //     public static void main(String[] args) {
// // //         Thread thread1=new Thread(new Thread1());
// // //         Thread thread2=new Thread(new Thread2());

// // //         thread1.start();;
// // //         thread2.start();
// // //     }

// // //     static class Thread1 extends Thread{
// // //         public void run(){
// // //             synchronized(resource1){
// // //                 System.out.println("thread1 : locked resource 1");
// // //                 try{
// // //                     Thread.sleep(100);
// // //                 }catch(InterruptedException e){
// // //                     e.printStackTrace();
// // //                 }
// // //                 System.out.println("TThread1 : waiting for resource 2");
// // //                 synchronized(resource2){
// // //                     System.out.println("Thread 1 :Locked resource 2");
// // //                 }
// // //             }
// // //         }

// // //     }

// // //     static class Thread2 extends Thread{
// // //         public void run(){
// // //             synchronized(resource1){
// // //                 System.out.println("thread1 : locked resource 1");
// // //                 try{
// // //                     Thread.sleep(100);
// // //                 }catch(InterruptedException e){
// // //                     e.printStackTrace();
// // //                 }
// // //                 System.out.println("TThread1 : waiting for resource 2");
// // //                 synchronized(resource2){
// // //                     System.out.println("Thread 1 :Locked resource 2");
// // //                 }
// // //             }
// // //         }

// // //     }
// // // }

// // // // public class Demo{
// // //     public static void main(String[] args) {
// // //         int x=12;
// // //         int y=0;
// // //     try{
// // //         if(y==0){
// // //             throw new Exception("Divided by zero");
// // //         }
// // //         System.out.println(x/y);
// // //     }catch(Exception e){
// // //         e.printStackTrace();
// // //     }
// // //     }
// // // }

// // import java.util.*;

// // public class Demo{

// //     // public static void main(String[] args) {
// //         // LinkedList <String> np = new LinkedList<>();
// //         // np.addFirst("Sapna");
// //         // np.addFirst("Deepak");
// //         // np.addFirst("Julie");
// //         // np.add("deepak");
// //         // System.out.println(np);

// //         // Iterator <String> it = np.iterator();
// //         // while(it.hasNext()){
// //         //     System.out.println(it.next());
// //         // }

// //         // ArrayList <Integer> arr = new ArrayList<>();
// //         // arr.add(12);
// //         // arr.addFirst(14);
// //         // arr.add(34);
// //         // arr.set(0, 85);
// //         // System.out.println(arr.indexOf(12));
// //         // System.out.println(arr.get(0));
// //         // System.out.println(arr.size());

// //         // Stack <Integer> st = new Stack<>();
// //         // st.push(14);
// //         // st.push(34);
// //         // st.push(23);
// //         // st.push(35);
// //         // st.addFirst(12);
// //         // st.set(3, 89);
// //         // System.out.println(st.get(4));;
// //         // System.out.println(st);
        
// //         // for (int index = 1; index < 10; index++) {
// //         //     for (int j = 1; j < index; j++) {
// //         //         System.out.print("*"+" ");
// //         //     }
// //         //     System.out.println();
// //         // }

// //     //     int arr[] = new int[]{12,1,3,10,14,11,16,17};
// //     //     traversal(arr);
// //     //     for (int i : arr) {
// //     //         System.out.println(i);
// //     //     }

// //     // }
// //     // public static void traversal(int arr[]) {
// //     //     int n = arr.length;
    
// //     //     // Outer loop for each element
// //     //     for (int i = 0; i < n - 1; i++) {
// //     //         // Inner loop to compare and swap elements
// //     //         for (int j = 0; j < n - i - 1; j++) {
// //     //             if (arr[j] > arr[j + 1]) {
// //     //                 // Swap elements if they are in the wrong order
// //     //                 int temp = arr[j];
// //     //                 arr[j] = arr[j + 1];
// //     //                 arr[j + 1] = temp;
// //     //             }
// //     //         }
// //     //     }

// //     // this function will find the tralling zeroes in factorial of num
// //         public static void rec(int num){
// //             int count = 0;
// //             int i=1;
// //             while(true){
// //                 if(i%5==0){
// //                     count ++;

// //                 }
// //                 if(i==num){
// //                     break;
// //                 }
// //                 i++;
// //             } 
// //             System.out.println(count+" zeroes");
// //         }

    
// //         public static void main(String[] args) {
// //             // int num=4;
// //             // rec(num);

// //         }
// // }
// import java.util.*;
// class Node {
//     int data;
//     Node parent;
//     Node left;
//     Node right;
//     int color;
// }
// public class Demo{
//     private Node root;
//     private Node TNULL;

//     // Preorder
//     public void preOrder() {
//         preOrderHelper(this.root);
//     }

//     // Inorder
//     public void inOrder() {
//         inOrderHelper(this.root);
//     }

//     // Post order
//     public void postOrder() {
//         postOrderHelper(this.root);
//     }

//     // Search the tree
//     public Node searchTree(int k) {
//         return searchTreeHelper(this.root, k);
//     }

//     // Balance the tree after deletion of a node
//     private void fixDelete(Node x) {
//         Node s;
//         while (x != root && x.color == 0) {
//             if (x == x.parent.left) {
//                 s = x.parent.right;
//                 if (s.color == 1) {
//                     s.color = 0;
//                     x.parent.color = 1;
//                     leftRotate(x.parent);
//                     s = x.parent.right;
//                 }

//                 if (s.left.color == 0 && s.right.color == 0) {
//                     s.color = 1;
//                     x = x.parent;
//                 } else {
//                     if (s.right.color == 0) {
//                         s.left.color = 0;
//                         s.color = 1;
//                         rightRotate(s);
//                         s = x.parent.right;
//                     }

//                     s.color = x.parent.color;
//                     x.parent.color = 0;
//                     s.right.color = 0;
//                     leftRotate(x.parent);
//                     x = root;
//                 }
//             } else {
//                 s = x.parent.left;
//                 if (s.color == 1) {
//                     s.color = 0;
//                     x.parent.color = 1;
//                     rightRotate(x.parent);
//                     s = x.parent.left;
//                 }

//                 if (s.right.color == 0 && s.right.color == 0) {
//                     s.color = 1;
//                     x = x.parent;
//                 } else {
//                     if (s.left.color == 0) {
//                         s.right.color = 0;
//                         s.color = 1;
//                         leftRotate(s);
//                         s = x.parent.left;
//                     }

//                     s.color = x.parent.color;
//                     x.parent.color = 0;
//                     s.left.color = 0;
//                     rightRotate(x.parent);
//                     x = root;
//                 }
//             }
//         }
//         x.color = 0;
//     }

//     private void rbTransplant(Node u, Node v) {
//         if (u.parent == null) {
//             root = v;
//         } else if (u == u.parent.left) {
//             u.parent.left = v;
//         } else {
//             u.parent.right = v;
//         }
//         v.parent = u.parent;
//     }

//     private void deleteNodeHelper(Node node, int key) {
//         Node z = TNULL;
//         Node x, y;
//         while (node != TNULL) {
//             if (node.data == key) {
//                 z = node;
//             }

//             if (node.data <= key) {
//                 node = node.right;
//             } else {
//                 node = node.left;
//             }
//         }

//         if (z == TNULL) {
//             System.out.println("Couldn't find key in the tree");
//             return;
//         }

//         y = z;
//         int yOriginalColor = y.color;
//         if (z.left == TNULL) {
//             x = z.right;
//             rbTransplant(z, z.right);
//         } else if (z.right == TNULL) {
//             x = z.left;
//             rbTransplant(z, z.left);
//         } else {
//             y = minimum(z.right);
//             yOriginalColor = y.color;
//             x = y.right;
//             if (y.parent == z) {
//                 x.parent = y;
//             } else {
//                 rbTransplant(y, y.right);
//                 y.right = z.right;
//                 y.right.parent = y;
//             }

//             rbTransplant(z, y);
//             y.left = z.left;
//             y.left.parent = y;
//             y.color = z.color;
//         }
//         if (yOriginalColor == 0) {
//             fixDelete(x);
//         }
//     }

//     private void preOrderHelper(Node node) {
//         if (node != TNULL) {
//             System.out.print(node.data + " ");
//             preOrderHelper(node.left);
//             preOrderHelper(node.right);
//         }
//     }

//     private void inOrderHelper(Node node) {
//         if (node != TNULL) {
//             inOrderHelper(node.left);
//             System.out.print(node.data + " ");
//             inOrderHelper(node.right);
//         }
//     }

//     private void postOrderHelper(Node node) {
//         if (node != TNULL) {
//             postOrderHelper(node.left);
//             postOrderHelper(node.right);
//             System.out.print(node.data + " ");
//         }
//     }

//     private Node searchTreeHelper(Node node, int key) {
//         if (node == TNULL || key == node.data) {
//             return node;
//         }

//         if (key < node.data) {
//             return searchTreeHelper(node.left, key);
//         }
//         return searchTreeHelper(node.right, key);
//     }

//     private Node minimum(Node node) {
//         while (node.left != TNULL) {
//             node = node.left;
//         }
//         return node;
//     }

//     private Node maximum(Node node) {
//         while (node.right != TNULL) {
//             node = node.right;
//         }
//         return node;
//     }

//     private Node successor(Node x) {
//         if (x.right != TNULL) {
//             return minimum(x.right);
//         }

//         Node y = x.parent;
//         while (y != TNULL && x == y.right) {
//             x = y;
//             y = y.parent;
//         }

//         return y;
//     }

//     private Node predecessor(Node x) {
//         if (x.left != TNULL) {
//             return maximum(x.left);
//         }

//         Node y = x.parent;
//         while (y != TNULL && x == y.left) {
//             x = y;
//             y = y.parent;
//         }

//         return y;
//     }

//     private void leftRotate(Node x) {
//         Node y = x.right;
//         x.right = y.left;
//         if (y.left != TNULL) {
//             y.left.parent = x;
//         }
//         y.parent = x.parent;
//         if (x.parent == null) {
//             this.root = y;
//         } else if (x == x.parent.left) {
//             x.parent.left = y;
//         } else {
//             x.parent.right = y;
//         }
//         y.left = x;
//         x.parent = y;
//     }

//     private void rightRotate(Node x) {
//         Node y = x.left;
//         x.left = y.right;
//         if (y.right != TNULL) {
//             y.right.parent = x;
//         }
//         y.parent = x.parent;
//         if (x.parent == null) {
//             this.root = y;
//         } else if (x == x.parent.right) {
//             x.parent.right = y;
//         } else {
//             x.parent.left = y;
//         }
//         y.right = x;
//         x.parent = y;
//     }

//     private void fixInsert(Node k){
//         Node u;
//         while (k.parent.color == 1) {
//             if (k.parent == k.parent.parent.right) {
//                 u = k.parent.parent.left;
//                 if (u.color == 1) {
//                     u.color = 0;
//                     k.parent.color = 0;
//                     k.parent.parent.color = 1;
//                     k = k.parent.parent;
//                 } else {
//                     if (k == k.parent.left) {
//                         k = k.parent;
//                         rightRotate(k);
//                     }
//                     k.parent.color = 0;
//                     k.parent.parent.color = 1;
//                     leftRotate(k.parent.parent);
//                 }
//             } else {
//                 u = k.parent.parent.right;
//                 if (u.color == 1) {
//                     u.color = 0;
//                     k.parent.color = 0;
//                     k.parent.parent.color = 1;
//                     k = k.parent.parent;
//                 } else {
//                     if (k == k.parent.right) {
//                         k = k.parent;
//                         leftRotate(k);
//                     }
//                     k.parent.color = 0;
//                     k.parent.parent.color = 1;
//                     rightRotate(k.parent.parent);
//                 }
//             }
//             if (k == root) {
//                 break;
//             }
//         }
//         root.color = 0;
//     }

//     // Insert a node
//     public void insert(int key) {
//         Node node = new Node();
//         node.parent = null;
//         node.data = key;
//         node.left = TNULL;
//         node.right = TNULL;
//         node.color = 1; // new node must be red

//         Node y = null;
//         Node x = this.root;

//         while (x != TNULL) {
//             y = x;
//             if (node.data < x.data) {
//                 x = x.left;
//             } else {
//                 x = x.right;
//             }
//         }

//         // y is parent of x
//         node.parent = y;
//         if (y == null) {
//             root = node;
//         } else if (node.data < y.data) {
//             y.left = node;
//         } else {
//             y.right = node;
//         }

//         // if new node is a root node, simply return
//         if (node.parent == null) {
//             node.color = 0;
//             return;
//         }

//         // if the grandparent is null, simply return
//         if (node.parent.parent == null) {
//             return;
//         }

//         // Fix the tree
//         fixInsert(node);
//     }

//     // Constructor
//     public RedBlackTree() {
//         TNULL = new Node();
//         TNULL.color = 0;
//         TNULL.left = null;
//         TNULL.right = null;
//         root = TNULL;
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         RedBlackTree tree = new RedBlackTree();

//         tree.insert(10);
//         tree.insert(20);
//         tree.insert(30);
//         tree.insert(15);
//         tree.insert(25);
//         tree.insert(5);

//         System.out.println("Inorder Traversal of Created Tree");
//         tree.inOrder();

//         System.out.println("\n\nPreorder Traversal of Created Tree");
//         tree.preOrder();

//         System.out.println("\n\nPost order Traversal of Created Tree");
//         tree.postOrder();

//         System.out.println("\n\nSearch for 25: " + (tree.searchTree(25) != null ? "Found" : "Not Found"));
//         System.out.println("Search for 50: " + (tree.searchTree(50) != null ? "Found" : "Not Found"));

//         tree.deleteNodeHelper(tree.root, 20);

//         System.out.println("\n\nAfter Deletion (Inorder Traversal)");
//         tree.inOrder();
//     }
// }

public class Demo{
    Node head;
    private int size;
    Demo(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data  = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode  = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void print(){
        Node curr  = head;
        if(head ==null){
            System.out.println("Empty");
        }
        while(curr != null){
            System.out.print(curr.data+ " -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("empty linked list ca't be deleted");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("empty linked list ca't be deleted");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secLast = secLast.next;
        }

        secLast.next = null;
    }

    public int size(){
        return size;
    }


    public static void main(String[] args) {
        Demo d  = new Demo();
        d.addFirst("Sapna");
        d.addFirst("Deepak");
        d.addLast("Suresh");
        d.addLast("Samesha");
        d.addFirst("Geeta");
        d.print();
        d.removeFirst();
        d.print();
        d.removeLast();
        d.print();
        d.addFirst("sapanaan");
        d.print();
        System.out.println(d.size());
    }
}