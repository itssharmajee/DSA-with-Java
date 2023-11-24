package pattern;

public class FLOYDs_triangle {
    public static void floyd_s_triangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String argv[]){
        floyd_s_triangle(5);
    }
}