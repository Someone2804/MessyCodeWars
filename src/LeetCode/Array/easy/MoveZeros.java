package LeetCode.Array.easy;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args){

        int[] arr = new int[]{0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int lastidx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastidx] = nums[i];
                lastidx++;
            }
        }
        Arrays.fill(nums, lastidx, nums.length, 0);
    }
}
