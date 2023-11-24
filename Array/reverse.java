package Array;

public class reverse {
    public static void rev_array(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String argv[]){
        int arr[]={12,13,14,15,16};
        rev_array(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +  " ");
        }
    }
}
