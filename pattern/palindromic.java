package pattern;

public class palindromic {
    public static void palindromic_pattern(int n){
        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print number descending part
            for(int j=i; j>=2; j--){
                System.out.print(j);
            }
            // print ascending order 
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String gautam[]){
        palindromic_pattern(12);
    }
}
