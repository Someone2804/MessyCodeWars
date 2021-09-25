package Katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Parentheses {

    public static boolean validParentheses(String parens)
    {
        //Put code below
        int parenscount = 0;
        for(String s : parens.split("")){
            if (s.equals(")")){
                if(parenscount <= 0){
                    return false;
                }
                parenscount--;
            }else if (s.equals("(")){
                parenscount++;
            }
        }
        return parenscount == 0;
    }
}
