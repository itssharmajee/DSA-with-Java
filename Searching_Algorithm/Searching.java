package Searching_Algorithm;

public class Searching {

    // in terms of binary search the TC = O(logN) 
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // writing binary search using recursion

    public static int binarySearchRecursive(int arr[], int key, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return mid;

        if (key < arr[mid]) {
            return binarySearchRecursive(arr, key, start, mid - 1);
        }
        return binarySearchRecursive(arr, key, mid + 1, end);
    }


    // in terms of linear search the TC = O(n) 
    public static int linearSearch(int arr[], int key) {
        int size = 0;
        while (size < arr.length) {
            if (arr[size] == key) {
                return size;
            }
            size++;
        }
        return -1;
    }

    public static void main(String argv[]) {
        int sortedArr[] = new int[] { -4, -1, 3, 7, 10, 11 };
        int key = 7;
        // System.out.println(binarySearch(sortedArr, key));
        // System.out.println(linearSearch(sortedArr, key));

        System.out.println(binarySearchRecursive(sortedArr, key, 0, sortedArr.length-1));
    }
}
