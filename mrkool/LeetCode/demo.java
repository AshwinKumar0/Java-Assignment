package mrkool.pakage;

import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Row");
        int n = sc.nextInt();
        System.out.println("Enter the length of Column");
        int m = sc.nextInt();
        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        int MinRow = 0;
        int MinCol = 0;
        int MaxRow = Matrix.length - 1;
        int MaxCol = Matrix[0].length - 1;

//Spiral Travesal
//1. column constant Right wall and Row will Change.
        while (MinCol <= MaxCol || MinRow <= MaxRow) {
            for (int i = MinRow; i <= MaxRow; i++) {
                System.out.println(Matrix[i][MinCol]);
            }
            MinCol++;
            for (int i = MinCol; i <= MaxCol; i++) {
                System.out.println(Matrix[MaxRow][i]);
            }
            MaxRow--;
            for (int i = MaxRow; i >= MinRow; i--) {
                System.out.println(Matrix[i][MaxCol]);
            }
            MaxCol--;
            for (int i = MaxCol; i >= MinCol; i--) {
                System.out.println(Matrix[MinRow][i]);
            }
            MinRow++;
        }
    }
}

