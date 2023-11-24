public class binarytDecimal {
    public static int convertBtD(int num){
        int result=0;
        int i = 0;
        while(num != 0){
            int digit = num % 10;
            result = (result + digit*(int)Math.pow(2,i));
            i++;
            num /= 10;
        }
        return result;
    }
    public static void main(String argv[]){
        int binary = 10110;
        System.out.print("Decimal of binary number : " +  binary  + " is " + convertBtD(binary));

    }
}
