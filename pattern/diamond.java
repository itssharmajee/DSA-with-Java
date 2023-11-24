package pattern;
public class diamond {
    public static void diamonds(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n; i>=1; i--){
            for(int j=i; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String argv[]){
        diamonds(4);

    }
}
