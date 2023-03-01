package mrkool;

import java.io.*;
import java.util.*;

public class Test{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] count = findCount(a);
        int[] Ans = new int[n];
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < Ans.length; i++) {
            Ans[i] = count[i] * a[i];
            if(Ans[i] > Max) {
                Max = Ans[i];
            }
        }

        System.out.println(Max);
    }
    static int[] findCount(int[] heights) {
        int[] counts = new int[heights.length];
        int[] NSR = SmallerToRight(heights);
        int[] NSL = SmallerToLeft(heights);
        System.out.println(Arrays.toString(NSR));
        System.out.println(Arrays.toString(NSL));
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (NSR[i] - NSL[i]) - 1;
        }
        return counts;
    }

    static int[] SmallerToRight(int[] arr) {
        int n = arr.length;
        Stack<Integer> useStack = new Stack<>();
        int[] ans = new int[n];
        for (int i = n -1; i >=0; i--) {
            if (i == n-1) {
                ans[i] = n;
                useStack.push(i);
            }
            else {
                while (!useStack.isEmpty() && arr[useStack.peek()] >= arr[i]) {
                    useStack.pop();
                }
                if (useStack.isEmpty()) {
                    ans[i] = n;
                    useStack.push(i);
                }
                else {
                    ans[i] = useStack.peek();
                    useStack.push(i);
                }
            }
        }
        return ans;
    }
    static int[] SmallerToLeft(int[] arr) {
        int n = arr.length;
        Stack<Integer> useStack = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                ans[i] = -1;
                useStack.push(i);
            }
            else {
                while (!useStack.isEmpty() && arr[useStack.peek()] >= arr[i]) {
                    useStack.pop();
                }
                if (useStack.isEmpty()) {
                    ans[i] = -1;
                    useStack.push(i);
                }
                else {
                    ans[i] = useStack.peek();
                    useStack.push(i);
                }
            }
        }
        return ans;
    }

}