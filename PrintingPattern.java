public class PrintingPattern {
    /*
this function will print like 

            *
            ***
            *****
            ***
            * 


 */
public static void print(int i) {
    if (i == 0) {
        System.out.println();
        return;
    }
    System.out.print("*");
    print(--i);
}
public static void printPattern(int n){
    for (int i = 1; i <= n; i++) {
            if(i%2 !=0){
                print(i);
            }              
    }
    for (int i =n-1; i>=1; i--) {
        if(i%2 !=0){
            print(i);
        } 
    }
}

/* 
n=5

        55555
        45555
        34555
        23455
        12345


*/
    public static void printPattern2(int n) {
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in descending order
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            // Print repeated number 5
            for (int j = 1; j <= n - i; j++) {
                System.out.print("5");
            }

            System.out.println(); // Move to the next line
        }
    }

/*
            A
            BB
            CCC
            DDDD
            EEEEE
            FFFFFF
            GGGGGGG
 */
    public static void printPattern3(int n){
        int c = 65;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)c);
            }
            System.out.println();
            c++;
            
        }
    }


    /* 
    55555
    4444
    333
    22
    1
    */

    public static void printPattern4(int n){
        int c = n;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(c);
            }
            System.out.println();
            c--;
            
        }
    }

    /*
    13579
    35791
    57913
    79135
    91357
    */
    public static void printPattern5(int n){
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num += 2;
                if(num >9){
                    num = 1;
                }
            }
            System.out.println();
            num += 2; 
        }
    }
public static void main(String[] args) {
    // printPattern(5);
    // printPattern2(5);// problem 
    // printPattern3(7);
    // printPattern4(7);
    printPattern5(5);

    
}
}
