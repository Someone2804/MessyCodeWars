package LeetCode.Array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for(int i = 0; i < nums.length - 1; i++){
//            for(int b = i+1; b < nums.length; b++){
//                if(nums[b] == target - nums[i]){
//                    result[0] = i;
//                    result[1] = b;
//                    return result;
//                }
//            }
//        }
//        return result;
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(arr.containsKey(num)){
                return new int[]{arr.get(num), i};
            }else{
                arr.put(nums[i], i);
            }
        }
        return null;
    }
}
