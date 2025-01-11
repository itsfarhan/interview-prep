// Problem Statement
// Given an integer array nums and an integer val, remove all occurrences of val in-place. Return the new length of the array. Order of elements can be changed, and it doesn't matter what's beyond the new length.

package Arrays;

public class RemoveElement {
    public static int removeElement(int[] arr, int val){
        if(arr == null || arr.length == 0) { return 0; }
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int newLength = removeElement(arr, val);
        System.out.println("Length of the modified array: "+newLength);

        for(int i=0; i<newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
