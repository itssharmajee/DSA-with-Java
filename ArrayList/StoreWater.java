package ArrayList;
import java.util.*;
public class StoreWater {
    public static int storewater(ArrayList<Integer> height){
        int max=0;
        int start=0;
        int end=height.size()-1;
        while(start<end){
            int heightt=Math.min(height.get(start),height.get(end));
            int width=end-start;
            int currWater=heightt*width;
            max=Math.max(max, currWater);
            if(start<end){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(storewater(height));
    }
}
