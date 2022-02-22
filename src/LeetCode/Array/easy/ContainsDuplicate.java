package LeetCode.Array.easy;

import java.util.Arrays;

public class ContainsDuplicate {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    }
}
