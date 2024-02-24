package Sorting_Algorithm;
public class SortingExp {
    // Bubble Sort 
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

// Insertion Sort 
public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int j=i-1;
        while(j >=0 && curr < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = curr;
    }
}

// Selection Sort 
public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int letSmallest = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[letSmallest] > arr[j]){
                letSmallest = j;
            }
        }
        int temp = arr[letSmallest];
        arr[letSmallest] = arr[i];
        arr[i] = temp;
    }
}
    public static void main(String argv[]){
        int arr[]= {12,13,15,9,8,45,3,20};
        bubbleSort(arr);
        // insertionSort(arr);
        // selectionSort(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
