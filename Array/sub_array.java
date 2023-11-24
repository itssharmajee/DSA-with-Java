package Array;

public class sub_array {
    public static void print_sub_array(int arr[]){
        int tot_arr=0;
        for(int i=0; i<arr.length;i++){
            // Starting point 
            for(int j=i;j<arr.length;j++){
                // Ending point 
                for(int k=i;k<=j;k++){

                    // printing start to end point 
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
                tot_arr++;
            }
            System.out.println();
        }
        System.out.println(" Total number of sub-array = " + tot_arr);
    }

    public static void main(String argv[]){

        int arr[] = { 2,4,6,8,10};
        print_sub_array(arr);
    }
}
