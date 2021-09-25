package Katas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {

    public static void main(String[] args){
        System.out.println("2000 103 123 4444 99".equals(orderWeight("103 123 4444 99 2000")));
        System.out.println("11 11 2000 10003 22 123 1234000 44444444 9999".equals(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123")));
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));

    }

    public static String orderWeight(String strng) {
        // your code
        return Arrays.stream(strng.split(" "))
                .sorted()
                .sorted(Comparator.comparingInt(a -> Arrays.stream(a.split(""))
                                                    .mapToInt(Integer::parseInt)
                                                    .sum()))
                .collect(Collectors.joining(" "));

    }
}
