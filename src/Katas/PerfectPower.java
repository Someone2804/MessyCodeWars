package Katas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formatter;

public class PerfectPower {

    public static void main(String[] args){
        System.out.println(Arrays.toString(isPerfectPower(125)));

    }

    public static int[] isPerfectPower(int n) {
        // ...
        for(int i = 1; i < n; i++){
            BigDecimal bigDecimal = new BigDecimal(0);
            double num = Math.ceil((Math.log(bigDecimal.doubleValue()) / Math.log(i)) * 100) / 100;
            if(num%1==0){
                return new int[]{i, (int) num};
            }
        }
        return null;
    }
}
