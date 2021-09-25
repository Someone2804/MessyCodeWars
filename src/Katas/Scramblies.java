package Katas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Scramblies {

        public static void main(String[] args){
            System.out.println(scramble("rkqodlw","world"));
            System.out.println(scramble("cedewaraaossoqqyt","codewars"));
            System.out.println(scramble("katas","steak"));
            System.out.println(scramble("scriptjavx","javascript"));
            System.out.println(scramble("scriptingjava","javascript"));
            System.out.println(scramble("scriptsjava","javascripts"));
            System.out.println(scramble("javscripts","javascript"));
        }

        public static boolean scramble(String str1, String str2) {
            // your code
            str1 = str1.replaceAll("[^" + str2 + "]", "");

            if(str1.length() < str2.length()){
                return false;
            }
            for(char i : str2.toCharArray()){
                if(str1.contains(Character.toString(i))){
                    str1 = str1.replaceFirst("[" + i + "]", "");
                }else
                    return false;
            }
            return true;

//                return str2.replaceAll("[" + str1 + "]", "").isEmpty();
        }
    }
