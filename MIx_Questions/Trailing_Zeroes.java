package MIx_Questions;
class Trailing{
    // finding the traling zeroes using recursive function
    static int trailingZeroes =0;
            public int recc(int num){
                if(num==0){
                    return 1;
                }
                if(num %5 == 0){
                    trailingZeroes++;
                }
                return num*recc(num-1);
                
            }
        }


public class Trailing_Zeroes {

    // finding the traling zeroes using simple function

         // this function will find the tralling zeroes in factorial of num
        public static void rec(int num){
            int count = 0;
            int i=1;
            int fact=1;
            while(true){
                if(i%5==0){
                    count ++;

                }
                fact=fact*i;
                if(i==num){
                    break;
                }
                i++;
            }
            System.out.println("factorial of "+num+" = "+fact);
            System.out.println(count+" zeroes");
    }
    
    // simple function to find out the trailing zeroes
    public static void simpleTrailing(int num){
        int quotent = 0;
        while(true){
            quotent +=num/5;
            num =num/5;
            if(num < 5){
                break;
            }
        }
        System.out.println(quotent + " Zeroes");
    }
    public static void main(String[] args) {
        // int num=10;
        // rec(num);

        simpleTrailing(10);

    // Trailing r= new Trailing();
    //     System.out.println(r.recc(5));
    //     //accessing  static member using object 
    //     // System.out.println(r.trailingZeroes);
    //     // accessing static member using Class 
    //     System.out.println(Trailing.trailingZeroes+ "  Zeroes");
    }
}
