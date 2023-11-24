package pattern;

public class triangle {
    public static void main(String argv[]){
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                //System.out.print("*");
                // if they ask about print number then you just
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
