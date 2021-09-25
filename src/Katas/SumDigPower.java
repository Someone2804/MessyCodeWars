package Katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class SumDigPower {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println(sumDigPow(1, 10000000000L));
        System.out.println((double)(System.currentTimeMillis() - startTime)/1000);
    }


    public static List<Long> result;
    public static long count;


    public static List<Long> sumDigPow(long a, long b) {
        // your code
        byte size = getSize(b);
        byte[] digits = getDigits(b, size);
        long[][] pows = getPows(size);
        count = b;
        result = new ArrayList<>();
        for(;size > 0; size--){
            digitsIterator(a, (byte) 0, size, pows, digits, 0);
            digits = new byte[size-1];
            Arrays.fill(digits, (byte) 9);
        }
        Collections.reverse(result);
        return result;
    }
    /*
            Here I tried to implement the method using recursion, but it didn't turn out very nicely.
            Nevertheless, the method recalculates only the last digits of the number by iterating the array,
            starting from the maximal number.
    */
    public static void digitsIterator(long a,
                                      byte index,
                                      byte size,
                                      long[][] pows,
                                      byte[] digits,
                                      long sum){
        for(;index < size && digits[index] >= 0; digits[index]--, count--){
            if(digits[0] == 0 || count < a){
                break;
            }
            if(sum+pows[digits[index]][index] == count){
                result.add(count);
            }
            digitsIterator(a, (byte) (index+1), size, pows, digits, sum+pows[digits[index]][index]);
            if (digits[index] == 0){
                digits[index] = 9;
                break;
            }
        }
    }
    /*
        Returns the size of the maximum number.
     */
    public static byte getSize(long x){
        long p = 10L;
        for(byte i = 1; i < 19; i++){
            if(x < p){
                return i;
            }
            p *= 10L;
        }
        return 19;
    }
    /*
         Returns a table of powers based on the size of the maximum number, so you don't have to recalculate each time.
    */
    public static long[][] getPows(int n){
        long[][] pow = new long[10][n];
        for(int i = 1; i < 10; i++){
            for(int p = 1; p <= n; p++){
                long pown = (long)Math.pow(i, p);
                pow[i][p-1] = pown;
            }
        }
        return pow;
    }

    /*
    Splits the number into digits and adds them all up into an array.
     */
    public static byte[] getDigits(long a, byte size){
        byte[] digits = new byte[size];
        do{
            digits[size-1] = (byte)(a % 10);
            a /= 10;
            size--;
        } while(size > 0);
        return digits;
    }
}
