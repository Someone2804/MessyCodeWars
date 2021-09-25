package Katas;

import java.awt.*;
import java.util.Arrays;

public class HexToRGB {

    public static void main(String[] args){
        System.out.println(Arrays.toString(hexStringToRGB("#111111")));

    }

    public static int[] hexStringToRGB(String hex) {

        // hex -> {r, g, b}
        Color color = Color.decode(hex);
        return new int[]{
                color.getRed(),
                color.getGreen(),
                color.getBlue()
        };
    }
}
