package Array;

public class pairs_Array {
    public static void print_pairs(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j]+ ")" + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs : " +count);
    }

    public static void main(String argv[]){
        int arr[] = {2,3,4,5,6};
        print_pairs(arr);
    }
}
