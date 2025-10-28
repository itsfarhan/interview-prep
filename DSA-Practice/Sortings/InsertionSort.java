package Sortings;

import java.util.Arrays;

public class InsertionSort{
    public static void insertionSort(int[] arr){
        if (arr == null || arr.length == 0){ return; }
        int j, tmp;
        for (int i=1; i<arr.length; i++){
            j=i-1;
            while(j>=0 && arr[j+1]<arr[j]){
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = new int [] {2,4,7,6,8,9,3,1};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
