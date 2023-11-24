package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=1; i<=6; i++){
        list.add(i);
    }
    int target=10;
    System.out.println(list);
    System.out.println(pairSum(list,target));
    }
}
