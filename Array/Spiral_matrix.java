package Array;
import java.util.*;
public class Spiral_matrix {
    public static void spiralMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol= m-1;

        while(startRow<=endRow && startCol <= endCol){

            // top part 
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right

            for(int i=startRow+1; i<=endRow; i++ ){
                System.out.print(matrix[i][endCol] +" ");
            }

            // bottom 

            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){break;}
                System.out.print(matrix[endRow][j]+ " ");
            }

            // left

            for(int i=endRow-1; i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        // int matrix[][] = {{1,2,3,4},
        //                     {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13,14,15,16}
        //                     };
        int arr_matrix[][] = new int [3][2];

        for(int i=0;i<arr_matrix.length; i++){
            for(int j=0;j<arr_matrix[0].length; j++){
                arr_matrix[i][j]=sc.nextInt();
            }
        }
spiralMatrix(arr_matrix);
        // spiralMatrix(matrix);

    }
}