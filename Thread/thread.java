
// Using Runner Interface
class A implements Runnable
{
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println("Hello sapna");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                }
            }
    }
}

class B implements Runnable
{
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println("Hello Deepak");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                }
        }
    }
}

public class thread{
    public static void main(String[] args) throws Exception{
        Runnable obj1=new A();
        Runnable obj2= new B();
        Thread P=new Thread(obj1);
        Thread Q=new Thread(obj2);
        P.start();
        Q.start();
        P.join();
        Q.join();
        System.out.println("Bye ");
    }
}