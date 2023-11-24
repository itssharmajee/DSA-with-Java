package Array;
//import java.util.*;

public class basic {
    public static void main(String argv[]){

        // 1D array 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value");
        // int[] arr=new int[3];
        // for(int i=0;i<3;i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0; i<3;i++){
        //     System.out.println(arr[i]);


        // 2D Array
        //int arr[][] = new int[2][3];
        // Or
        int array[][] = {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }

        }
    }
