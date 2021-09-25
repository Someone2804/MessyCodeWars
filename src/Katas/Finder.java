package Katas;

public class Finder {

    public static void main(String[] args){
        System.out.println(pathFinder(".W.\n"+
                ".W.\n"+
                "..."));
        System.out.println(pathFinder(".W.\n"+
                ".W.\n"+
                "W.."));
        System.out.println(pathFinder("......\n"+
                "......\n"+
                "......\n"+
                "......\n"+
                "...WWW\n"+
                "......"));
    }

    static boolean pathFinder(String maze) {
        // Your code here!!
        int height = maze.length() - maze.replaceAll("[\n]", "").length()+1;
        int width = maze.length() / height;
        String[][] mazearr = createArrMaze(maze, height, width);
        for(int a = 0, b = 0; a != height-1 && b != width-1;){
            int way = findWay(a, b, height, width);
            if(way > 0 && b+1 < width && !mazearr[a][b+1].equals("W")){
                b++;
            }else if (a+1 < height && !mazearr[a+1][b].equals("W")){
                a++;
            }else return false;
        }
        return true;
    }
    public static String[][] createArrMaze(String maze, int height, int width){
        String[][] mazearr = new String[height][width];
        int a = 0;
        for(String s : maze.split("\n")){
            int b = 0;
            for(String l : s.split("")){
                mazearr[a][b] = l;
                b++;
            }
            a++;
        }
        return mazearr;
    }

//    public static int[] findPoint(int a, int b){
//        for(){
//
//        }
//    }

    public static int findWay(int a, int b, int a2, int b2){
        return (a-b) - (a2 - b2);
    }
}
