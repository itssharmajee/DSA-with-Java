package recursion;

public class power {
    public static int pow(int n,int p){
        if(p==1){
            return n;
        }
        return n*pow(n,p-1);
    }

    // optimized solution for this code 

    public static int optPower(int n, int p){
        if(p==0){
            return 1;
        }
        int pa=optPower(n, p/2);
        int pas=pa*pa;

        // if p is odd 
        if(p % 2 !=0){
            pas=n*pas;
        }
        return pas;
    }
    public static void main(String[] args) {
        //System.out.println(pow(2, 5));
        System.out.println(optPower(2,5));
    }
}
