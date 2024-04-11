import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DSA_Practice {

    // reverse an arraylist
    public static void reverseArray(ArrayList<Integer> ls){
        for (int i = ls.size()-1; i >=0; i--) {
            System.out.println(ls.get(i)+" ");
        }
    }

    // minimum in the arrayList

    public static int maximumElement(ArrayList<Integer> ls){
        int max = Integer.MIN_VALUE;
        /*for(int i=0; i<ls.size(); i++){
            if(max<ls.get(i)){
                max=ls.get(i);
            }
        }*/

        // you can also use inbuilt function to find out the maximum element 
        for (int i = 0; i < ls.size(); i++) {
            max=Math.max(max, ls.get(i));
        }
        return max;
    }

    // swapping two particular number mentioned index element at index 1 with index 3

    public static void swappingNumber(ArrayList<Integer> ls,int idx1,int idx2){
        int temp = ls.get(idx1);
        ls.set(idx1, ls.get(idx2));
        ls.set(idx2, temp);
    }

    // Multidimensional array

    public static void multiDimensionalArray(){
        ArrayList<ArrayList<String>> str = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        str1.add("Sapna");
        str1.add("Sapna kumari");
        str1.add("Sapna Sharma");
        str1.add("Deepak Sharma");
        str1.add("Deepak");

        str2.add("Gautam Kumar");
        str2.add("Gautam ");
        str2.add("Gaagan ");
        str2.add("Gagan Sharma");
        str2.add("Guddan ");

        str.add(str1);
        str.add(str2);

        System.out.println(str.get(0));
        System.out.println(str);

        
    }





    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(17);
        list.add(19);

        // reverseArray(list);
        // System.out.println(maximumElement(list));

        // System.out.println(list);
        // swappingNumber(list, 1, 3);
        // System.out.println(list);

        /*// soting an array
        Collections.sort(list);
        System.out.println(list);
        */

        // multiDimensionalArray();


        

    }
}
