package pattern;

public class Number_Pyramid {
    
    public static void pyramid(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            // space print 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }

    public static void main(String argv[]){

        pyramid(7);
    }
}
