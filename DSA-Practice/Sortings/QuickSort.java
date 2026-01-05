package Sortings;

import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] arr, int start, int end) {
        // base case
        if (end - start + 1 <= 1) {
            return arr;
        }

        int pivot = arr[end]; // choosing last element as pivot
        int left = start; // pointer for the left subarray

        // move elements smaller than pivot to the left side
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }

        // move pivot in-between left and right subarrays
        arr[end] = arr[left];
        arr[left] = pivot;

        quickSort(arr, start, left - 1); // Sort left subarray

        quickSort(arr, left + 1, end); // Sort right subarray

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 4, 2, 7, 1, 10 };
        System.out.println("Original array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
