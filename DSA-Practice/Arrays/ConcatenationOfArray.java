// Problem Statement
// Given an integer array nums, return an array result of length 2 * nums.length such that:

// The first half of result is nums. (Source array)
// The second half of result is also nums. (Target array)

package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation (int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n]; 

        // for(int i=0; i<nums.length; i++){
        //     result[i] = nums[i];
        //     result[i + n] = nums[i];
        // }

        //Optimized approach
        // System.arraycopy(Source array, Source start, Target array, Target start, Length);
        System.arraycopy(nums, 0, result, 0, n);

        System.arraycopy(nums, 0, result, n, n);

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int[] result = getConcatenation(nums);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
        // for (int i : result) {
        //     System.out.print(i+"");
        // }
    }
}
