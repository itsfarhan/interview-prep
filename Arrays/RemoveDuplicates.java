// Problem Statement
// Given a sorted array, remove the duplicates in-place such that each unique element appears only once. Return the length of the modified array. The final array should be stored in the same array (in-place modification).

package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        if (arr == null || arr.length == 0){ return 0; }

        int j = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int newLength = removeDuplicates(arr);
        
        //Return length of modified array
        System.out.println("Length after removing duplicates: "+newLength);

        //Travesing modified array to display elements
        System.out.println("Modified array elements are:");
        for(int i=0; i<newLength; i++){
            System.out.print(arr[i] + " "); 
        }
    }
}
