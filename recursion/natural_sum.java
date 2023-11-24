package recursion;
public class natural_sum {
    public static int naturalSum(int n){
        if(n==1){
            return 1;
        }
        return n+naturalSum(n-1);
    }
    public static void main(String argv[]){
        System.out.println(5);
    }
}
