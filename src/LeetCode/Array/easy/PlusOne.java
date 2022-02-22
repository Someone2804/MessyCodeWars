package LeetCode.Array.easy;

import java.util.Arrays;

public class PlusOne {

    /*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
     */

    public static void main(String[] args){
        int[] arr = {
                8,9,9,9
        };
        System.out.println(Arrays.toString(plusOne(arr)));
    }


    public static int[] plusOne(int[] digits) {
        return incDig(digits, digits.length-1);
    }

    public static int[] incDig(int[] digits, int start){
        int[] result = Arrays.copyOf(digits, digits.length);
        if(digits[start] == 9){
            if(start == 0){
                digits[start] = 1;
                return Arrays.copyOf(digits, digits.length+1);
            }
            result = incDig(digits, start-1);
            result[start] = 0;
        }else result[start] += 1;

        return result;
    }
}
