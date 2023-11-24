import java.util.*;
public class looping {
    public static void main(String argn[]){
        // for(int i=1;i<=10;i++){
        //     System.out.print(" " + i);      //this will print space between two numbers as well
        //     // or
        //     //System.out.print(i + " "); //this will print space between two numbers as well 
        // }






        // printing the number from 1 to n , n is being taken by the user

        Scanner sc = new Scanner (System.in);
        /*int number = sc.nextInt();
        int i = 1; // this is a counter that is used to iterate the value 
        while (i<=number)
        {
            System.out.print(" " + i);
            i++;
        }
        */


        // print the first n natural numbers

        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=num)
        {
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
        

    }
}
