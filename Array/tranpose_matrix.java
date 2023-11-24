package Array;

public class tranpose_matrix {
    public static void tranoseMatrix(int matrix[][]){
        int transpoed[][]= new int [matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpoed[j][i]=matrix[i][j];
            }
        }

        for(int i=0; i<transpoed.length; i++){
            for(int j=0; j<transpoed[0].length; j++){
                System.out.print(transpoed[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        tranoseMatrix(arr);
    }
}
