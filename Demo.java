class Queue{
    static int size;
    static int front;
    static int rear;
    static int arr[];
    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }
    //add
    public static void Enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }
    // remove

    public static int Dequeue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        front=arr[0];
        for(int i=0; i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }
}

public class Demo{
    public static void main(String[] args) {
        Queue q=new Queue(5);
        System.out.println(q.isEmpty());
        q.Enqueue(12);
        q.Enqueue(13);
        q.Enqueue(14);
        q.Enqueue(15);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
        System.out.println("front element " + q.peek());
    }
}