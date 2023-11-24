import java.util.*;
public class prime{

    //optimized code for checking whether the number is prime or not
    public static boolean isPrime(int num )
    {
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // printing all prime numbers from a given range 

    public static void printPrime(int s,int e){
        for(int i=s;i<=e;i++){
            if(isPrime(i)){
                System.out.print(" " + i);
            }
        }

    }
    
    public static void main(String argn[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number Starting and ending ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if(num == 1 ){
            num = num +1;
        }
        printPrime(num, num2);
        }
        


}