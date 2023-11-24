package Array;

public class assesmentQuestion {
    // print the no of 7 in a given 2D array

    public static void find_element(int arr[][],int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("Number of " + key + " is : " + count);
    }

    //sum of the number in second row 
    public static void rowSum(int arr[][],int row){
        int row_sum= 0;
        for(int i=0; i<arr[0].length; i++){
            row_sum += arr[row][i];
        }
        System.out.println(row+1 + "Sum is " + row_sum);
    }


    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int arr1[][] = {{1,4,9},{11,4,3},{2,2,3}};

        //find_element(arr, 7);
        rowSum(arr1, 1);
    }
}
