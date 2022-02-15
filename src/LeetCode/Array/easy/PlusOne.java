package LeetCode.Array.easy;

import java.util.Arrays;

public class PlusOne {

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
