package recursion;

public class print_1_to_n {
    // print number in descending order n to 1 
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }


    // print number in ascending order 1 to n
    public static void printInc(int n){
        if(n<1){
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");

        }
    public static void main(String argv[]){
        //printDec(10);
        printInc(10);
    }
}
