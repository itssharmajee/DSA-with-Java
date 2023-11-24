package pattern;

public class inverted_triangle {
    public static void main(String argv[]){
        int n=10;
        for(int i=1;i<=n;i++){                 
            for(int j=n;j>=i;j--){               // or you can write this in other fashion as well
                System.out.print(" * ");        // for( int j=1; j<=n-i+1 ;j++ ){ now write ajeties }
            }
            System.out.println();
        }
    }
}
