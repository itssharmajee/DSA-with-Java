package Array;
public class duplicate_element {
    // this function will return whether there is exit duplicate element in array or not 
    // time complexity will be O(n^2)
    public static boolean check_duplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String argv[]){
        int arr[] = {1,2,3,4,20,20,5};
        if(check_duplicate(arr)){
            System.out.println("it exists");
        }else
        {
            System.out.println("Not exits");
        }

    }
}
