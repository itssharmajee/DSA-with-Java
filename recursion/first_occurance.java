package recursion;

public class first_occurance {
    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static void main(String argv[]){
        int arr[] = {1,2,4,5,6,4,6,4};
        int key=40;
        System.out.println(firstOccurance(arr, key, 0));
    }
}
