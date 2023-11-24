package pattern;

public class solid_rhombus {
    public static void sol_rh_pattern(int n){
        for(int i=1; i<=n; i++){
            // for space printing 
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String argn[]){
        sol_rh_pattern(5);
    }
    
}
