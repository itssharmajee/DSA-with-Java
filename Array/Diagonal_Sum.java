package Array;

public class Diagonal_Sum {
    // this code is not optimized code because the time complexity is big o of n square so 


    // public static void diagonalSum(int matrix[][]){
    //     int digonal_sum = 0;
    //     for(int i=0; i<matrix.length; i++){
    //         // Primary diagonal 
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(i==j){
    //                 digonal_sum +=matrix[i][j];
    //                 System.out.print(i + "," + j+ "  ");
    //             }
    //             else if(i+j==matrix.length-1 && i !=j ){// this condition will hit in 3x3 metrices ie. i!=j
    //                 digonal_sum +=matrix[i][j];
    //                 System.out.print(i + "," + j+ "  ");
    //             }
    //         }
    //     }
    //     System.out.println(digonal_sum);
    // }

// optimized code, time complexity is big o of n
public static int diagonal_Sum_optimized (int matrix[][]){
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        // for Primary diagonal 
        sum +=matrix[i][i];

        // for secondary diagonal 
        if(i != matrix.length-1-i){
            sum +=matrix[i][matrix.length-i-1];
            }
    }
    return sum;
}


public static void main(String[] args) {
    int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //diagonalSum(matrix);

    System.out.println(diagonal_Sum_optimized(matrix));
}
}
