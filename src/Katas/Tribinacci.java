package Katas;

import java.util.Arrays;

public class Tribinacci {

    public static void main(String[] args){
        System.out.println(Arrays.toString(new Tribinacci().tribonacci(new double[]{1, 1, 1}, 10)));
    }

    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] trib = new double[10];
        for(int a = 0; a < s.length; a++){
            trib[a] = s[a];
        }
        for(int i = s.length; i < n; i++){
            trib[i] += trib[i-1] + trib[i-2] + trib[i-3];
        }
        return trib;
    }
}
