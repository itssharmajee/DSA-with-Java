public class Decimal_to_Binary {
public static void dectobinary(int binary){
    int decimal = 0;
    int i = 0;
    while(binary != 0){
        int temp = binary % 2;
        decimal += temp*(int)Math.pow(10,i);
        i++;
        binary /=2;
    }
    System.out.print(decimal);
}

public static void main(String agrv[]){
    dectobinary(7);

}

}
