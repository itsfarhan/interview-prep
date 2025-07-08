// Problem Statement
// Given an integer array nums and an integer val, remove all occurrences of val in-place. Return the new length of the array. Order of elements can be changed, and it doesn't matter what's beyond the new length.

package Arrays;

public class RemoveElement {
    public static int removeElement(int[] arr, int val) {
        if (arr == null || arr.length == 0) return 0; //edge case
        // Two pointers approach
        int j = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int []arr = new int [] {3,2,2,3};
        int val = 3;
        int newLength = removeElement(arr, val);
        System.out.println("New length of the array: " + newLength);

        System.out.println("Modified array: ");
        for(int i=0; i<newLength; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
