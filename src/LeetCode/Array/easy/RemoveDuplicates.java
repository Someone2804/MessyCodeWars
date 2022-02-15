package LeetCode.Array.easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] arr = {
                1,1,2
        };
        int[] arr2 = {
                0,0,1,1,1,2,2,3,3,4
        };
        System.out.println(removeDuplicates(arr) + ", " + Arrays.toString(arr));
        System.out.println(removeDuplicates(arr2) + ", " + Arrays.toString(arr2));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int lastelem = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(lastelem == nums[i]){
                nums[i] = 0;
                count++;
            }else{
                lastelem = nums[i];
                nums[i-count] = nums[i];
                nums[i] = 0;
            }
        }
        return nums.length - count;
    }
}
