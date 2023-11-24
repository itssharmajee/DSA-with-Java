
import java.util.*;
public class test{

    public static void swap (ArrayList<Integer> list, int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String argv[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(13);
        System.out.println(list);
        // int max = Integer.MIN_VALUE;
        // System.out.println("Reverse an array ");
        // for(int i=list.size()-1; i>=0; i--){
        //     // System.out.print(list.get(i)+ " ");
        //     // if(list.get(i)>max){
        //     //     max=list.get(i);
        //     // }

        //     max=Math.max(max,list.get(i));
        // }
        // System.out.println(max);


        // swapping two numbers
        // int idx1=1,idx2=3;
        // swap(list,idx1,idx2);
        // System.out.println(list);

        // Sorting an Array

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        
        }
    }