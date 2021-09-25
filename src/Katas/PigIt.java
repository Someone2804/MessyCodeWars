package Katas;

import java.util.Arrays;

public class PigIt {

    public static void main(String[] args){
        String pangram1 = "The quick brown fox jumps over the lazy .";
        System.out.println(pigIt(pangram1));
    }
    public static String pigIt(String str) {
        // Write code here
        String[] strarr = str.split(" ");
        for(int i = 0; i < strarr.length; i++){
            if(!strarr[i].matches("^[\\p{L}]+")){
                continue;
            }
            strarr[i] = editWord(strarr[i]);
        }
        return String.join(" ", Arrays.asList(strarr));
    }

    public static int countPunctuation(int length, String str){
        for(int b = length-1; !str.substring(b, length).matches("[\\p{L}]"); b--) {
            length--;
        }
        return length;
    }

    public static String editWord(String str){
        int length = countPunctuation(str.length(), str);
        StringBuilder builder = new StringBuilder(str);
        builder.insert(length, builder.substring(0, 1) + "ay");
        builder.delete(0, 1);
        return builder.toString();
    }
}
