class C extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello DEAR");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}

class D extends Thread{
    public void run(){
        for(int i=0 ;i<5; i++){
            System.out.println("Deepak");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}

public class thread_class {
    public static void main(String[] agrv){

        C obj1=new C();
        D obj2=new D();

        obj1.start();
        try{
                Thread.sleep(10);
            }
            catch(Exception e){}
        obj2.start();

    }
}
