package Katas;

import java.util.LinkedList;

public class BattleshipFieldValidator {

    private static int submarine;
    private static int destroyer;
    private static int cruiser;
    private static int battleship;

    public static boolean fieldValidator(int[][] field) {
        submarine = 4;
        destroyer = 3;
        cruiser = 2;
        battleship = 1;

        for(int x = 0; x < field.length; x++){
            for(int y = 0; y < field.length; y++){
                if(field[x][y] == 1){
                    if(!validateShip(field, x, y)) return false;
                }
            }
        }
        return submarine == 0 && destroyer == 0 && cruiser == 0 && battleship == 0;
    }

    private static boolean validateShip(int[][] field, int x, int y){
        int count = 0;
        while(count <= 4){
            if(field[x][y] == 1){
                field[x][y] = 0;
                count++;
            }
            if(y+1 < field.length && field[x][y+1] == 1){
                if((x+1 < field.length &&  (field[x+1][y] == 1 || field[x+1][y+1] == 1)) || (y-1 >= 0 && x+1 < field.length && field[x+1][y-1] == 1)){
                    return false;
                }
                y++;
            }else if(x+1 < field.length && field[x+1][y] == 1){
                if((y+1 < field.length && (field[x][y+1] == 1 || field[x+1][y+1] == 1)) || (y-1 >= 0 && (field[x][y-1] == 1 || field[x+1][y-1] == 1))){
                    return false;
                }
                x++;
            }else break;
        }

        switch (count) {
            case(1):
                if ((x + 1 < field.length && field[x + 1][y] == 1) || (y + 1 < field.length && x + 1 < field.length && (field[x][y + 1] == 1 || field[x + 1][y + 1] == 1)) || (y - 1 >= 0 && x + 1 < field.length && (field[x + 1][y - 1] == 1))) {
                    return false;
                }
                submarine -= 1;
                break;
            case(2): destroyer -= 1; break;
            case(3): cruiser -= 1; break;
            case(4): battleship -= 1; break;
            default: return false;
        }
        return true;
    }
}
