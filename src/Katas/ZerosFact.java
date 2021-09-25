package Katas;

import java.math.BigInteger;

public class ZerosFact {

    public static void main(String[] args){
        for(int i = 1; i < 10000; i++) {
            System.out.println(zeros(i));
        }
    }

    public static int zeros(int n) {
        BigInteger bigInteger = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        String s = bigInteger.toString();
        String s2 = s.replaceAll("[0]+$", "");
        // your beatiful code here
        return s.length() - s2.length();
    }
}
