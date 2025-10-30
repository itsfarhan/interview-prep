package Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end){
        if (end - start + 1 <= 1){ return; }

        int middle = (start + end)/2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
        merge(arr, start, middle, end);
    }

    public static void merge(int[] arr, int start, int middle, int end){
        int leftSize = middle - start + 1;
        int rightSize = end - middle;

        int left[] = new int[leftSize];
        int right[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[start + i];
        }

        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = start;
        
        //merging two sorted subarrays
        while(i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from either subarray
        while (i < leftSize) {
                arr[k++] = left[i++];
        }
        while (j < rightSize) {
                arr[k++] = right[j++];
        }

        // int left[] = Arrays.copyOfRange(arr, start, middle + 1);
        // int right[] = Arrays.copyOfRange(arr, middle + 1, end + 1);

        // int i = 0, j = 0, k = start;
        // while(i < left.length && j < right.length){
        //     if(left[i] <= right[j]){
        //         arr[k++] = left[i++];
        //     } else {
        //         arr[k++] = right[j++];
        //     }
        // }
        // while (i < left.length) {
        //         arr[k++] = left[i++];
        // }
        // while (j < right.length) {
        //         arr[k++] = right[j++];
        // }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int start = 0, end = arr.length - 1;
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, start, end);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}