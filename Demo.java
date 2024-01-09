// /*class Queue{
//     static int size;
//     static int front;
//     static int rear;
//     static int arr[];
//     Queue(int n){
//         arr=new int[n];
//         size=n;
//         rear=-1;
//     }

//     public static boolean isEmpty(){
//         return rear==-1;
//     }
//     //add
//     public static void Enqueue(int data){
//         if(rear==size-1){
//             System.out.println("Queue is full");
//             return;
//         }
//         rear=rear+1;
//         arr[rear]=data;
//     }
//     // remove

//     public static int Dequeue(){
//         if(isEmpty()){
//             System.out.println("empty queue");
//             return -1;
//         }

//         front=arr[0];
//         for(int i=0; i<rear; i++){
//             arr[i]=arr[i+1];
//         }
//         rear=rear-1;
//         return front;
//     }
//     //peek
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("empty queue");
//             return -1;
//         }
//         return arr[0];
//     }
// }

// public class Demo{
//     public static void main(String[] args) {
//         Queue q=new Queue(5);
//         System.out.println(q.isEmpty());
//         q.Enqueue(12);
//         q.Enqueue(13);
//         q.Enqueue(14);
//         q.Enqueue(15);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.Dequeue();
//         }
//         System.out.println("front element " + q.peek());
//     }
// }
// */



// // public class Demo {

// //     public static void main(String[] args) {
// //         // Creating an instance of the shared resource
// //         SharedResource sharedResource = new SharedResource();

// //         // Creating two threads with the same shared resource
// //         Thread thread1 = new Thread(new PrintTask(sharedResource));
// //         Thread thread2 = new Thread(new PrintTask(sharedResource));

// //         // Start the threads
// //         thread1.start();
// //         thread2.start();
// //     }

// //     // Shared resource class
// //     static class SharedResource {
// //         // Synchronized method to ensure thread safety
// //         synchronized void print(String message) {
// //             for (char ch : message.toCharArray()) {
// //                 System.out.print(ch);
// //                 try {
// //                     // Introducing a small delay to simulate real-world conditions
// //                     Thread.sleep(50);
// //                 } catch (InterruptedException e) {
// //                     e.printStackTrace();
// //                 }
// //             }
// //             System.out.println(); // Print a newline after the message
// //         }
// //     }

// //     // Task to be performed by each thread
// //     static class PrintTask implements Runnable {
// //         private SharedResource sharedResource;

// //         PrintTask(SharedResource sharedResource) {
// //             this.sharedResource = sharedResource;
// //         }

// //         @Override
// //         public void run() {
// //             // Synchronized block to ensure exclusive access to the shared resource
// //             synchronized (sharedResource) {
// //                 // Print the message using the shared resource's print method
// //                 sharedResource.print("My name is Rahul I am working in ABC Company.");
// //             }
// //         }
// //     }
// // }




// // class CustomException extends Exception {
// //     public CustomException(String message) {
// //         super(message);
// //     }
// // }

// // public class Demo {

// //     public static void main(String[] args) {
// //         try {
// //             // Simulate a condition that triggers an exception
// //             int result = divide(10, 0);

// //             // This line won't be reached if an exception occurs
// //             System.out.println("Result: " + result);
// //         } catch (CustomException e) {
// //             System.out.println("Caught CustomException: " + e.getMessage());
// //         } catch (ArithmeticException e) {
// //             System.out.println("Caught ArithmeticException: " + e.getMessage());
// //         } catch (Exception e) {
// //             System.out.println("Caught generic Exception: " + e.getMessage());
// //         } finally {
// //             System.out.println("Finally block - This will always execute.");
// //         }
// //     }

// //     static int divide(int numerator, int denominator) throws CustomException {
// //         try {
// //             if (denominator == 0) {
// //                 // Throw a custom exception if the denominator is zero
// //                 throw new CustomException("Cannot divide by zero.");
// //             }
// //             return numerator / denominator;
// //         } catch (ArithmeticException e) {
// //             // Wrap the ArithmeticException in a CustomException and re-throw
// //             throw new CustomException("Error during division: " + e.getMessage());
// //         }
// //     }
// // }

// import java.util.Scanner;

// public class Demo {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          // Simulate a division operation
//         System.out.println("Enter Num");
//             int numerator = sc.nextInt();
//             System.out.println("Enter dem");
//             int denominator = sc.nextInt();
//         try {

//             if (denominator == 0) {
//             throw new ArithmeticException("Cannot divide by zero.");
//         }else{
//             System.out.println("Result: " + numerator/denominator);
//         }

//             // This line won't be reached if an exception occurs
            
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException: " + e.getMessage());
//         } finally {
//             System.out.println("Finally block - This will always execute.");
//         }
//     }
// }


// public  class Demo{
//     static Object resource1=new Object();
//     static Object resource2=new Object();

//     public static void main(String[] args) {
//         Thread thread1=new Thread(new Thread1());
//         Thread thread2=new Thread(new Thread2());

//         thread1.start();;
//         thread2.start();
//     }

//     static class Thread1 extends Thread{
//         public void run(){
//             synchronized(resource1){
//                 System.out.println("thread1 : locked resource 1");
//                 try{
//                     Thread.sleep(100);
//                 }catch(InterruptedException e){
//                     e.printStackTrace();
//                 }
//                 System.out.println("TThread1 : waiting for resource 2");
//                 synchronized(resource2){
//                     System.out.println("Thread 1 :Locked resource 2");
//                 }
//             }
//         }

//     }

//     static class Thread2 extends Thread{
//         public void run(){
//             synchronized(resource1){
//                 System.out.println("thread1 : locked resource 1");
//                 try{
//                     Thread.sleep(100);
//                 }catch(InterruptedException e){
//                     e.printStackTrace();
//                 }
//                 System.out.println("TThread1 : waiting for resource 2");
//                 synchronized(resource2){
//                     System.out.println("Thread 1 :Locked resource 2");
//                 }
//             }
//         }

//     }
// }

// // public class Demo{
//     public static void main(String[] args) {
//         int x=12;
//         int y=0;
//     try{
//         if(y==0){
//             throw new Exception("Divided by zero");
//         }
//         System.out.println(x/y);
//     }catch(Exception e){
//         e.printStackTrace();
//     }
//     }
// }

import java.util.*;

public class Demo{

    // public static void main(String[] args) {
        // LinkedList <String> np = new LinkedList<>();
        // np.addFirst("Sapna");
        // np.addFirst("Deepak");
        // np.addFirst("Julie");
        // np.add("deepak");
        // System.out.println(np);

        // Iterator <String> it = np.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // ArrayList <Integer> arr = new ArrayList<>();
        // arr.add(12);
        // arr.addFirst(14);
        // arr.add(34);
        // arr.set(0, 85);
        // System.out.println(arr.indexOf(12));
        // System.out.println(arr.get(0));
        // System.out.println(arr.size());

        // Stack <Integer> st = new Stack<>();
        // st.push(14);
        // st.push(34);
        // st.push(23);
        // st.push(35);
        // st.addFirst(12);
        // st.set(3, 89);
        // System.out.println(st.get(4));;
        // System.out.println(st);
        
        // for (int index = 1; index < 10; index++) {
        //     for (int j = 1; j < index; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

    //     int arr[] = new int[]{12,1,3,10,14,11,16,17};
    //     traversal(arr);
    //     for (int i : arr) {
    //         System.out.println(i);
    //     }

    // }
    // public static void traversal(int arr[]) {
    //     int n = arr.length;
    
    //     // Outer loop for each element
    //     for (int i = 0; i < n - 1; i++) {
    //         // Inner loop to compare and swap elements
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 // Swap elements if they are in the wrong order
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }

    // this function will find the tralling zeroes in factorial of num
        public static void rec(int num){
            int count = 0;
            int i=1;
            while(true){
                if(i%5==0){
                    count ++;

                }
                if(i==num){
                    break;
                }
                i++;
            } 
            System.out.println(count+" zeroes");
        }

    
        public static void main(String[] args) {
            // int num=4;
            // rec(num);

        }
}

