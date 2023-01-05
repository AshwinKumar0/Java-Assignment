package mrkool.pakage;

import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans= rotate(mat);
        System.out.println(Arrays.deepToString(ans));

    }
    static int[][] rotate(int[][] mat){
        int[][] arr=new int[mat.length][mat[0].length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                arr[row][col] = mat[col][row];
            }

        }
        return arr;
    }
}
