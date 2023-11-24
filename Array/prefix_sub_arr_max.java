package Array;

public class prefix_sub_arr_max {
    public static void prefix_sub_arr_max_sum(int arr[]){
        int temp_arr[]=new int[arr.length];
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = 0;
            for(int j=0;j<=i;j++){
                temp = temp + arr[j];
            }
            temp_arr[i]=temp;
        }

        for(int i=0; i<temp_arr.length; i++){
            System.out.print(temp_arr[i] + " ");
        }
    }

    public static void main(String argv[]){
        int arr[]= {1,-2,6,-1,3};
        prefix_sub_arr_max_sum(arr);
    }
}
