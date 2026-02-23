package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        // edge case
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 7, 9, 16, 18 };
        int target = 9;
        System.out.println("The index of target is: " + binarySearch(arr, target));
    }
}
