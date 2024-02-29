import java.util.*;
public class Practice {

    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public static int searchElement(int arr[], int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    
    public static int largestValue(int arr[]){
        int min = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>min){
                min = i;
            }
        }
        return min;
    }

    public static void noOfPairs(int arr[]){
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // System.out.print("("+arr[i]+","+arr[j]+")"+",");
                totalPairs++;
            }
            // System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void printSubArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
            
        }

    }


    // public static void reverseArray(int arr[]){
    //     int back = arr.length-1;
    //     for(int i=0; i<arr.length/2; i++){
    //         int temp = arr[i];
    //         arr[i] = arr[back];
    //         arr[back] =temp;
    //         back--;
    //     }
    // }

    // or you can do it like 

    public static void reverseArray(int arr[]){
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
    // it is not more optimized code for finding the max subarray sum 
    public static void maxArraySum(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <=end; k++) {
                    
                    sum +=arr[k];
                }
                if(sum > max){
                    max = sum ;
                }
            }
        }
        System.out.println(max);
    }
    */

    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array");
    //     int size = sc.nextInt();

    //     System.out.println("Enter the value of x");
    //     int x = sc.nextInt();


    //     int arr[] = new int [size];

    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println("Enter the" + i +  " element");
    //         int temp = sc.nextInt();
    //         arr[i] = temp;
    //     }

    //     System.out.println(searchElement(arr, x));
    // 


    // int arr[] = {12,13,1,3,32};
    // System.out.println(largestValue(arr));

    int arr[] = {2,4,6,8,10};
    // noOfPairs(arr);
    // printSubArray(arr);

    // reverseArray(arr);
    // printArray(arr);

    // maxArraySum(arr);


    }
}
