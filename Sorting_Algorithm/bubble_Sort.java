package Sorting_Algorithm;

public class bubble_Sort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length-i; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String argv[]){
        int arr[]= {12,13,15,9,8,45,3,20};
        bubbleSort(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
