package recursion;

public class fibonacci {
    public static int fibo(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // you can write these things in other manner
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String argv[]){
        System.out.println(fibo(3));
    }
}
