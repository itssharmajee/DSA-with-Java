public class reverse {
    public static void  main(String argv[]){
        int n = 1025;
        int result = 0;
        while (n != 0)
        {
            int temp = n % 10;
            result = result* 10 + temp ;
            n/=10;
        }
        System.out.println(result);
    }
}
