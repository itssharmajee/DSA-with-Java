package Array;

public class kadanes_algorithm {
    public static void kadanes(int arr[]){
        int cs = 0; //current sum 
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ ){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("the max array sum is " + ms);
    }
    // this logic for all 
    public static void kadanesForAll(int arr[]){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        if(max < 0)
        {
            System.out.println(max);
            return;
        }
        int cs = 0; //current sum 
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ ){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("the max array sum is " + ms);
    }

    public static void main(String argv[]){
        // this is for miture element means negative and positive
        int arr[] = {-2,-3,4,-1,-2,1,500,-3};
        kadanes(arr);
        
        // but all the elments value is negative then it will return zero 
        int arr1[] = {-2,-3,-4,-1,-2,2010,-5,-3};
        kadanesForAll(arr1);
        
    }
}
