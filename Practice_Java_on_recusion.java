public class Practice_Java_on_recusion {
    public static void main(String[] args) {
        Recusion rec = new Recusion();
        // rec.printNtoOne(12);
        // rec.printOnetoN(12);
        // System.out.println(rec.sumOfN(12));
        // System.out.println(rec.fibonacciNum(8));

        int arr[]  = {102,13,14,15,14,16,17};
        // System.out.println(rec.isSortedArr(arr, 0));
        // System.out.println(rec.firstOccurance(arr, 0, 14));
        // System.out.println(rec.lastOccurance(arr, arr.length-1, 102));
        // System.out.println(rec.findXtoThePowerY(10, 4));
        System.out.println(rec.findXtoThePowerY(2, 3));

    }
}

class Recusion {
    public static void printNtoOne(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        printNtoOne(num - 1);
    }

    public static void printOnetoN(int num) {
        if (num == 0) {
            return;
        }
        printOnetoN(num - 1);
        System.out.println(num);
    }

    public static int sumOfN(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumOfN(num - 1);
    }

    public static int fibonacciNum(int num){
        if(num == 0 || num == 1){
            return num;
        }

        return fibonacciNum(num -1) + fibonacciNum(num -2);
    }

    public static boolean isSortedArr(int arr[], int i){// problem 
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSortedArr(arr, i+1);
    }

    public static int firstOccurance(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }

    public static int lastOccurance(int arr[], int i, int key){// problem 
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, i+1, key);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int findXtoThePowerY(int x,int y){
        if(y==1){
            return x;
        }
        return x*findXtoThePowerY(x, y-1);
    }

    // optimized code finding x to the power y

    public static int findXtoThePowerY2(int x ,int y){
        if(y == 0){
            return 1;
        }
        int halfPower = x * findXtoThePowerY2(x, y/2);
        int halfPowerSq = halfPower * halfPower;

        if(y % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}