package mrkool.stackQuestions;
import java.util.Arrays;
import java.util.Stack;

public class MAH {
    public static void main(String[] args) {
        int[] arr = {6,5,4,5,1,6};
        int[] areas = FindAreas(arr);
        int max = Integer.MIN_VALUE;
        for (int area : areas) {
            if (area > max) {
                max = area;
            }
        }
        System.out.println(max);
    }
    static int[] FindAreas(int[] arr) {
        int[] count = findCount(arr);
        int[] Ans = new int[arr.length];
        for (int i = 0; i < Ans.length; i++) {
            Ans[i] = count[i] * arr[i];
        }
        return Ans;
    }

    //Find count using simple nested for loop


    /*
    static int[] findCount(int[] arr) {
        int[] TotalCount = new int[arr.length];
        int left = 0;
        int right = 0;
        for (int i = 0; i < TotalCount.length; i++) {
            left = leftCount(i,arr);
            right = rightCount(i,arr);
            TotalCount[i] = 1 + left + right;
        }
        return TotalCount;
    }
    static int leftCount(int x , int[] arr){
        if (x == 0) return 0;
        int count = 0;
        int i = x-1;
        while (i>=0 && arr[i] >= arr[x] ){
            count++;
            i--;
        }
        return count;
    }

    static int rightCount(int y , int[] arr) {
        if (y == arr.length-1) return 0;
        int count = 0;
        int i = y+1;
        while (i<= arr.length-1 && arr[i] >= arr[y]){
            count++;
            i++;
        }
        return count;
    }


     */

    // Find count in linear time using Stack Data Structure

    static int[] findCount(int[] heights) {
        int[] counts = new int[heights.length];
        int[] NSR = SmallerToRight(heights);
        int[] NSL = SmallerToLeft(heights);
        System.out.println(Arrays.toString(NSR));
        System.out.println(Arrays.toString(NSL));
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (NSR[i] - NSL[i]) - 1;
        }
        System.out.println(Arrays.toString(counts));
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

