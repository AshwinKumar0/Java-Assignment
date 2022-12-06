package mrkool.pakage;
import java.util.*;
public class matr {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        for (int i=1;i<4;i++){
            if(Arrays.deepEquals(mat,target)){
                System.out.println("target matched at " +i);
            }
                mat=rotation(mat);
            System.out.println("target not matched");

            }
        }
    static int[][] rotation(int[][] mat){
        int n=mat.length;
        int [][] arr=new int[n][n];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                arr[i][j]=mat[n-j-1][i];
            }
            n= mat.length;
        }
        return arr;
    }
}
