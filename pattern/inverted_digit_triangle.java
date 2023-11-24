package pattern;
public class inverted_digit_triangle {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        
        
    }


    public static void main(String argv[]){
        pattern(5);
    }
}
