package Katas;

import java.util.Arrays;

public class Fracts {

    public static void main(String[] args){
        System.out.println(convertFrac(new long[][] { {1, 2}, {1, 3}, {10, 40} }));
    }

    public static String convertFrac(long[][] lst) {
        // your code
        for(int i = 0; i < lst.length; i++){
            if(lst[i][0]%10==0 && lst[i][1]%10==0){
                lst[i][0]/=10;
                lst[i][1]/=10;
            }
        }
        long num = 0;
        boolean sw = true;
        while(sw) {
            num+=lst[0][1];
            for (int i = 0; i <= lst.length; i++) {
                if(i == lst.length){
                    sw = false;
                    break;
                }
                if((double)num%lst[i][1] != 0){
                    break;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < lst.length; i++){
            builder.append("(").append(num / lst[i][1]).append(",").append(num).append(")");
        }

        return builder.toString();
    }

}
