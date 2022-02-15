package LeetCode.Array.easy;

import java.util.Arrays;

public class Intersection {

    public static void main(String[] args){
        int[] arr = {
                1,2
        };
        int[] arr2 = {
                1,1
        };
        System.out.println(Arrays.toString(intersect(arr, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int count = 0;
        int i2 = 0;
        for(int i = 0; i < nums1.length && i2 < nums2.length;){
            if(nums1[i] < nums2[i2]){
                i++;
            }else if(nums1[i] > nums2[i2]){
                i2++;
            }else {
                nums1[count] = nums1[i];
                count++;
                i++;
                i2++;
            }
        }
        return Arrays.copyOf(nums1, count);
    }
}
