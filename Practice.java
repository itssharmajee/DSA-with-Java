import java.util.*;

public class Practice {

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int searchElement(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int largestValue(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > min) {
                min = i;
            }
        }
        return min;
    }

    public static void noOfPairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.print("("+arr[i]+","+arr[j]+")"+",");
                totalPairs++;
            }
            // System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void printSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }

    // public static void reverseArray(int arr[]){
    // int back = arr.length-1;
    // for(int i=0; i<arr.length/2; i++){
    // int temp = arr[i];
    // arr[i] = arr[back];
    // arr[back] =temp;
    // back--;
    // }
    // }

    // or you can do it like

    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    // it is not more optimized code for finding the max subarray sum
    public static void maxArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    // check given string is palindrome or not

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // find the shortest path containing directions

    public static int shortestPath(String str) {
        int path = 0;
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else {
                x--;
            }
        }

        x = x * x;
        y = y * y;
        path = (int) Math.sqrt(x + y);
        return path;
    }

    // check whether two string are equal or not
    // we can use predefined function as well to find out that is equals()
    public static boolean isEqualString(String str1, String str2) {

        /*
         * if (str1.length() != str2.length()) {
         * return false;
         * }
         * for (int i = 0; i < str1.length(); i++) {
         * if (str1.charAt(i) != str2.charAt(i)) {
         * return false;
         * }
         * }
         * return true;
         */

        // other way to find out
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }

    // a function for substring
    // OR...we have also inbuilt function for substring str.subString(start,end);

    public static String subString(String str, int start, int end) {
        if (start >= end && start > str.length() && end > str.length()) {
            return " ";
        }
        String strNew = "";
        for (int i = start; i < end; i++) {
            strNew += str.charAt(i);
        }
        return strNew;
    }

    // function for finding largest string
    public static void largestString() {
        String str[] = new String[] { "yak", "sapna", "zebra", "gautam", "deepak" };
        String letLargest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (letLargest.compareTo(str[i]) < 0) {
                letLargest = str[i];
            }
        }
        System.out.println(letLargest);
    }

    // this will change to sentence in camel case
    // this is me ---> This Is Me
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // we are going to write now Backtracking problems

    // we are just subtracting -2 from all the element of an empty array

    public static void changeArr(int arr[], int i, int value) {
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = value;
        changeArr(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }

    // subset of finding the string using backtracking

    // public static void subSet(String str, String ansString, int idx) {
    // if (idx == str.length()) {
    // if (ansString.length() == 0) {
    // System.out.println("Null");
    // } else {
    // System.out.println(ansString);
    // }
    // return;
    // }
    // // Yes Condition
    // subSet(str, ansString + str.charAt(idx), idx + 1);
    // // No Condition
    // subSet(str, ansString, idx + 1);
    // }

    // as you know string is immutable so we prefer to use stringbuffer
    public static void subSet(String str, StringBuffer ansString, int idx) {
        if (idx == str.length()) {
            if (ansString.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ansString);
            }
            return;
        }
        // Yes Condition
        ansString.append(str.charAt(idx));
        subSet(str, ansString, idx + 1);
        ansString.deleteCharAt(ansString.length() - 1); // Backtrack
        // No Condition
        subSet(str, ansString, idx + 1);
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();

        // System.out.println("Enter the value of x");
        // int x = sc.nextInt();

        // int arr[] = new int [size];

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("Enter the" + i + " element");
        // int temp = sc.nextInt();
        // arr[i] = temp;
        // }

        // System.out.println(searchElement(arr, x));
        //

        // int arr[] = {12,13,1,3,32};
        // System.out.println(largestValue(arr));

        // int arr[] = { 2, 4, 6, 8, 10, 1 };
        // noOfPairs(arr);
        // printSubArray(arr);

        // reverseArray(arr);
        // printArray(arr);

        // maxArraySum(arr);

        // bubbleSort(arr);
        // printArray(arr);

        // System.out.println(isPalindrome("n"));

        // System.out.println(shortestPath("WNEENESENNN"));

        // System.out.println(isEqualString("sa","s"));

        // System.out.println(subString("Sapna Kumari", 0, 5));

        // System.out.println("Sapna".substring(0,3));
        // largestString();
        // String str = "hey there i am gautam kumar";
        // System.out.println(toUpperCase(str));

        // int arr2[] = new int[5];
        // changeArr(arr2, 0, 1);
        // System.err.println();
        // printArray(arr2);

        // subSet("abc", "", 0);

        // subSet("abc", new StringBuffer(), 0);

        

    }
}
