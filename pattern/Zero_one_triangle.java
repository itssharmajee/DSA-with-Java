package pattern;

public class Zero_one_triangle {
    public static void ZeroOneTriangle(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String argv[]){
        ZeroOneTriangle(10);
    }
}
