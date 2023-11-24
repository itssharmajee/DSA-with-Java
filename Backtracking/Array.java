package Backtracking;
// this a program where an array takes empty sized element having size n and assign value 1 to n
// and subtract -2 from all element.
public class Array {
    public static void printArr(int arr[]){
        for(int i:arr){//used for each loop to print elements
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[], int si,int val){
        // base case 
        if(si==arr.length){
            printArr(arr);
            return;
        }
        arr[si]=val;
        changeArr(arr, si+1, val+1);
        arr[si]=arr[si]-2;
    }

    public static void main(String argv[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
