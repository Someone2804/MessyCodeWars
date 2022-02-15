package LeetCode.Array.easy;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepEquals(matrix, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));
    }

    public static void rotate(int[][] matrix) {
        int tmp1, tmp2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                tmp1 = matrix[i][j];
                tmp2 = matrix[j][i];
                matrix[i][j] = tmp2;
                matrix[j][i] = tmp1;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                tmp1 = matrix[i][j];
                tmp2 = matrix[i][matrix.length-1-j];
                matrix[i][j] = tmp2;
                matrix[i][matrix.length-1-j] = tmp1;
            }

        }
    }
}
