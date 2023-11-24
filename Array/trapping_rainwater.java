package Array;

public class trapping_rainwater {
    public static int find_trap_rain_water_vol(int arr[]){
        int size=arr.length;
        // calculate left max boundary
        int max_left[] = new int[size];
        max_left[0]=arr[0];
        for(int i=1; i<size;i++){
            max_left[i]=Math.max(arr[i],max_left[i-1]);
        }
        // calculate right max boundary
        int max_right[] = new int[size];
        max_right[size-1]=arr[size-1];
        for(int i=size-2;i>=0 ;i--){
            max_right[i]=Math.max(arr[i],max_right[i+1]);
        }

        // looping traversing all the elements
        int trappedWater=0;
        for(int i=0; i<size;i++){
            int walterLevel=Math.min(max_left[i],max_right[i]);
            trappedWater += walterLevel - arr[i];
        }
        return trappedWater;
    }
    


    public static void main(String argv[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(find_trap_rain_water_vol(height));
    }
    
}
