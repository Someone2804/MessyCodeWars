package Katas;


import java.util.Arrays;

public class StringMerger {

    public static void main(String[] args){
        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
        System.out.println(isMerge("codewars", "cod", "wars"));
        System.out.println(isMerge("Can we merge it? Yes, we can!", "n wrge es ca!", "Cae meit? Y, wen"));

    }

    public static boolean isMerge(String s, String part1, String part2) {
        if(s.length() != part1.length() + part2.length()){
            return false;
        }
        int a = 0, b = 0;
        char[] s1 = part1.toCharArray();
        char[] s2 = part2.toCharArray();
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            if(b < s2.length-1 && a < s1.length && s1[a] == s2[b]){
                if(s2[b+1] == str[i+1]) b++;
                else a++;
            }else if(a < s1.length && s1[a]==(str[i]))a++;
            else if(b < s2.length && s2[b]==(str[i]))b++;
            else return false;
        }
        return true;
    }
}
