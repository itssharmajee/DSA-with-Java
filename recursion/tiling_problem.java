package recursion;

public class tiling_problem {
    public static int tilingProblem(int n){ // here n is length
        if(n==0 || n==1){
            return 1;
        }

        // vertical choice
        int fnm1=tilingProblem(n-1);

        // horizontal choice 

        int fnm2= tilingProblem(n-2);

        int totWay = fnm1+fnm2;
        return totWay;
    }

    public static void main(String argv[]){
        System.out.println(tilingProblem(4));

    }
}
