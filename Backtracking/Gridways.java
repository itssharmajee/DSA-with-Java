package Backtracking;

public class Gridways {
    // find the possible way to reach from (0,0) to (n-1,m-1) the 2D matrix direction is only either right or down 
    public static int possibleGridWays(int i,int j,int n,int m){
        if (i==n-1 && j==m-1) {// base condition
            return 1;
        }
        else if(i==n || j==m){// out of boundary
            return 0;
        }
        // direction right 
        int w1 = possibleGridWays(i,j+1,n,m);
        // direction down 
        int w2 = possibleGridWays(i+1,j,n,m);
        // total ways 
        return w1+w2;
    }

    public static int fact(int n){
        if(n==0 | n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    // you can also find this using permutation formula 
    public static int optimizedPossibleways(int n,int m){
        int f1 = fact(n-1+m-1);
        int f2 = fact(n-1);
        int f3 = fact(m-1);
        return (f1)/(f2*f3);
    }
    public static void main(String[] args) {
        int order = 3;
        int n=order,m = order;
        // System.out.println(possibleGridWays(0,0,n,m));

        System.out.println(optimizedPossibleways(n, m));
    }
}
