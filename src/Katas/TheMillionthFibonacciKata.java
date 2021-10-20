package Katas;

import java.math.BigInteger;

public class TheMillionthFibonacciKata {

    public static void main(String[] args){
        System.out.println(fib(BigInteger.valueOf(2000000)));
    }

    public static BigInteger fib(BigInteger n) {
        BigInteger positive = n;
        if(positive.longValue() < 0){
            positive = new BigInteger(String.valueOf(n.longValue() * -1));
        }
        if(positive.longValue() == 0){
            return positive;
        }
        BigInteger result = fib(positive.longValue());
        return n.longValue() < 0 ? result.multiply(BigInteger.valueOf(-1)) : result;
    }

    private static BigInteger fib(long n)
    {
        BigInteger F[][] = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(1)},{BigInteger.valueOf(1),BigInteger.valueOf(0)}};
        if (n == 0)
            return BigInteger.valueOf(0);
        power(F, n-1);

        return F[0][0];
    }

    private static void multiply(BigInteger F[][], BigInteger M[][])
    {
        BigInteger x =  F[0][0].multiply(M[0][0]).add(F[0][1].multiply(M[1][0]));
        BigInteger y =  F[0][0].multiply(M[0][1]).add(F[0][1].multiply(M[1][1]));
        BigInteger z =  F[1][0].multiply(M[0][0]).add(F[1][1].multiply(M[1][0]));
        BigInteger w =  F[1][0].multiply(M[0][1]).add(F[1][1].multiply(M[1][1]));

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    private static void power(BigInteger[][] F, long n)
    {
        if( n == 0 || n == 1)
            return;
        BigInteger M[][] = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(1)},{BigInteger.valueOf(1),BigInteger.valueOf(0)}};

        power(F, n/2);
        multiply(F, F);

        if (n%2 != 0)
            multiply(F, M);
    }
}
