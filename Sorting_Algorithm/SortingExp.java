package Sorting_Algorithm;

public class SortingExp {
    // Bubble Sort -- Time complexity will be O(n^2)
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    // Selection Sort -- Time complexity O(n^2)
    public static void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
        }
    }

    public static void main(String argv[]) {
        int arr[] = { 12, 13, 15, 9, 8, 45, 3, 20 };
        // int arr[]= {9,8,7,6,5,4,3,2,1};
        // bubbleSort(arr);
        selectionSort(arr);
        // insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
