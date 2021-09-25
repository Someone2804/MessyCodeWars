package Katas;

import java.util.Arrays;

public class KataFour {
    public static void main(String[] args){
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(high(pangram1));
    }

    public static String high(String s) {
        // Your code here...
        String[] sarr = s.split(" ");
        int max = 0;
        String word = "";
        for(String w : sarr){
            int check = 0;
            char[] chararr = w.toCharArray();
            for(char letter : chararr){
                if(letter >= 'a' && letter <= 'z'){
                    check += letter;
                }
            }
            if(check > max){
                max = check;
                word = w;
            }
        }
        return word;
    }

}
