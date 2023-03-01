package mrkool.stackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class MaxRecAreaInBinaryMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {
                {0, 1, 0, 1, 1},
                {1, 1, 0, 0, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1}
        };
        int m = Matrix.length;
        int n = Matrix[0].length;
        int[][] Heights = FindHeight(Matrix);
        int[][] Width = FindWidth(Heights);
        //System.out.println(Arrays.deepToString(Heights));
        //System.out.println(Arrays.deepToString(Width));
        int[][] Areas = new int[m][n];
        int MaxArea = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Areas[i][j] = Width[i][j] * Heights[i][j];
                if (Areas[i][j] > MaxArea) {
                    MaxArea = Areas[i][j];
                }
            }
        }
        System.out.println(MaxArea);
    }

    static int[][] FindHeight(int[][] Matrix) {
        int m = Matrix.length;
        int n = Matrix[0].length;
        int[][] Heights = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1) {
                    Heights[i][j] = Matrix[i][j];
                } else {
                    if (Matrix[i][j] != 0) {
                        Heights[i][j] = Heights[i + 1][j] + Matrix[i][j];

                    } else {
                        Heights[i][j] = 0;
                    }
                }
            }
        }
            return Heights;

    }
        static int[][] FindWidth ( int[][] Heights){
            int m = Heights.length;
            int n = Heights[0].length;
            int[][] Width = new int[m][n];
            int[][] NSL = NextSmallerToLeftInMatrix(Heights);
            int[][] NSR = NextSmallerToRightInMatrix(Heights);
            System.out.println(Arrays.deepToString(NSL));
            System.out.println(Arrays.deepToString(NSR));
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    Width[i][j] = (NSR[i][j] - NSL[i][j]) - 1;
                }
            }
            return Width;
        }
        static int[][] NextSmallerToLeftInMatrix ( int[][] Heights){
            int m = Heights.length;
            int n = Heights[0].length;
            int[][] NSL = new int[m][n];
            Stack<Integer> AnsStack = new Stack<>();
            for (int row = 0; row < m; row++) {
                Stack<Integer> UseStack = new Stack<>();
                for (int col = 0; col < n; col++) {
                    if (col == 0) {
                        AnsStack.push(-1);
                        UseStack.push(col);
                    } else {
                        while (!UseStack.isEmpty() && Heights[row][UseStack.peek()] >= Heights[row][col]) {
                            UseStack.pop();
                        }
                        if (UseStack.isEmpty()) {
                            AnsStack.push(-1);
                            UseStack.push(col);
                        } else {
                            AnsStack.push(UseStack.peek());
                            UseStack.push(col);
                        }
                    }
                }
            }
            for (int i = m -1; i >= 0; i--) {
                for (int j = n-1 ; j >=0 ; j--) {
                    NSL[i][j] = AnsStack.peek();
                    AnsStack.pop();
                }
            }
            return NSL;
        }
        static int[][] NextSmallerToRightInMatrix ( int[][] Heights){
            int m = Heights.length;
            int n = Heights[0].length;
            int[][] NSR = new int[m][n];
            Stack<Integer> AnsStack = new Stack<>();
            for (int row = 0; row < m; row++) {
                Stack<Integer> UseStack = new Stack<>();
                for (int col = n - 1; col >= 0; col--) {
                    if (col == n - 1) {
                        AnsStack.push(n);
                        UseStack.push(col);
                    } else {
                        while (!UseStack.isEmpty() && Heights[row][UseStack.peek()] >= Heights[row][col]) {
                            UseStack.pop();
                        }
                        if (UseStack.isEmpty()) {
                            AnsStack.push(n);
                            UseStack.push(col);
                        } else {
                            AnsStack.push(UseStack.peek());
                            UseStack.push(col);
                        }
                    }
                }
            }
            for (int i = m - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    NSR[i][j] = AnsStack.peek();
                    AnsStack.pop();
                }
            }
            return NSR;
        }

    }
