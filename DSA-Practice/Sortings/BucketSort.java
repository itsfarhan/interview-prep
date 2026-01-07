package Sortings;

import java.util.Arrays;

public class BucketSort {
    public static int[] bucketSort(int[] arr) {
        int[] counts = new int[101]; // assuming input values are in the range 0-100
        // Count occurrences of each number
        for (int num : arr) {
            counts[num]++;
        }
        int index = 0;
        // Reconstruct the sorted array
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[index++] = i;
                counts[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 29, 25, 3, 49, 9, 37, 21, 43 };
        System.out.println("Original array: " + Arrays.toString(arr));
        bucketSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
 * Another apporach
 * 
 * public class BucketSort {
    * public static int[] bucketSort(int[] arr, int bucketSize) {
    * if (arr.length == 0) {
    * return arr;
    * }
 * 
    * // Determine minimum and maximum values
    * int minValue = arr[0];
    * int maxValue = arr[0];
    * for (int num : arr) {
        * if (num < minValue) {
        * minValue = num;
        * } 
        * else if (num > maxValue) {
        * maxValue = num;
        * }
    * }
 * 
    * // Initialize buckets
    * int bucketCount = (maxValue - minValue) / bucketSize + 1;
    * List<List<Integer>> buckets = new ArrayList<>(bucketCount);
    * for (int i = 0; i < bucketCount; i++) {
    *   buckets.add(new ArrayList<>());
    * }
 * 
    * // Distribute input array values into buckets
    * for (int num : arr) {
        * int bucketIndex = (num - minValue) / bucketSize;
        * buckets.get(bucketIndex).add(num);
    * }
 * 
    * // Sort each bucket and concatenate results
    * int index = 0;
    * for (List<Integer> bucket : buckets) {
        * Collections.sort(bucket);
        * for (int num : bucket) {
            * arr[index++] = num;
        * }
    * }
     * return arr;
 * }
 * 
    * public static void main(String[] args) {
    * int[] arr = { 29, 25, 3, 49, 9, 37, 21, 43 };
    * System.out.println("Original array: " + Arrays.toString(arr));
    * bucketSort(arr, 10);
    * System.out.println("Sorted array: " + Arrays.toString(arr));
    * }
 * }
 */