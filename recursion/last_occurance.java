package recursion;

public class last_occurance {
public static int lastOccurance(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }

    public static void main(String argv[]){
        int arr[] = {1,2,4,5,6,4,6,4};
        int key=40;
        System.out.println(lastOccurance(arr, key, arr.length-1));
    }
}
