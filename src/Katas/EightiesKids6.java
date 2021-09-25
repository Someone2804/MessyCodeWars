package Katas;

import java.util.HashMap;
import java.util.Map;

public class EightiesKids6 {

    public static void main(String[] args){
        Robot robot1 = new Robot("Rocky", 200, 20, new String[] { "punch", "punch", "laser", "missile" });
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[] { "missile", "missile", "missile", "missile" });
        Map<String, Integer> tactics = new HashMap<>(3, 1f);
        tactics.put("punch", 20);
        tactics.put("laser", 30);
        tactics.put("missile", 35);
        System.out.println(fight(robot1, robot2, tactics));
    }

    public static class Robot {
        private String name;
        private int health;
        private int speed;
        private String[] tactics;

        public Robot(String name, int health, int speed, String[] tactics) {
            this.name = name;
            this.health = health;
            this.speed = speed;
            this.tactics = tactics;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getSpeed() {
            return speed;
        }

        public String[] getTactics() {
            return tactics;
        }
    }

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
        // Which robot will Rock 'em, Sock 'em?!
        if(robot1.getSpeed() < robot2.getSpeed()){
            var rob = robot1;
            robot1 = robot2;
            robot2 = rob;
        }
        var health1 = robot1.getHealth();
        var health2 = robot2.getHealth();
        var tl1 = robot1.getTactics().length;
        var tl2 = robot2.getTactics().length;
        for(int i = 0; i < tl1 || i < tl2; i++){
            if((health2-=tactics.get(robot1.getTactics()[i])) <= 0) return robot1.getName() + " has won the fight.";
            if(tl2 > i && (health1 -= tactics.get(robot2.getTactics()[i])) <= 0) return robot2.getName() + " has won the fight.";
        }
        if(health1 < health2) return robot2.getName() + " has won the fight.";
        else if(health1 > health2) return robot1.getName() + " has won the fight.";
        return "The fight was a draw.";
    }
}
