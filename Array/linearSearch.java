package Array;

public class linearSearch {
    public static int linear_Search(int num[],int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String argn[]){
        int []arr = {2,4,6,8,10,12,14,16};
        int key=10;
        System.out.print(linear_Search(arr, key));
    }
}
