package Katas;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class Greed{

    public static void main(String[] args){
        System.out.println(greedy(new int[]{2,4,4,5,4}));

    }

    public static int greedy(int[] dice){
        //code here
        Map<String, Long> map = Arrays.stream(dice)
                                .mapToObj(Integer::toString)
                                .collect(groupingBy(Function.identity(), counting()));

        return countPoints(map);
    }

    public static int countPoints(Map<String, Long> map){
        int count = 0;
        for(int i = 1; i <= 5; i++){
            if(!map.containsKey(Integer.toString(i))){
                continue;
            }
            long num = map.get(Integer.toString(i));
            int multiply = 100;
            if(i == 1){
                multiply = 1000;
            }
            while(num > 0){
                if(num >= 3){
                    count += i*multiply;
                    num -= 3;
                }else if(i == 5){
                    count += 50;
                    num -= 1;
                }else if(i == 1){
                    count += 100;
                    num -= 1;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
