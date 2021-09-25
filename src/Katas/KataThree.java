package Katas;

import java.util.HashSet;
import java.util.Set;

public class KataThree {

    public static void main(String[] args){
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram1));
    }
    public static boolean check(String sentence){
        //code
        char[] c = sentence.toLowerCase().toCharArray();
        Set<Character> count = new HashSet<Character>();
        for(char i : c) {
            if (i >= 'a' && i <= 'z') {
                count.add(i);
            }
        }
        return count.size() == 26;
    }
}
