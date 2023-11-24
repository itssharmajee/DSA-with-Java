package pattern;

public class opposite_triangle {
    public static void invTriangle(int n){
        for(int i=1; i<=n; i++){
            // print space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // print * star

            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String argv[]){
        invTriangle(5);
    }
}
