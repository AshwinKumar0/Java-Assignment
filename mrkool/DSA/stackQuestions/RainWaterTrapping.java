package mrkool.stackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1,0};
        int[] GTL = GreaterToLeft(arr);
        int[] GTR = GreaterTORight(arr);
        System.out.println(Arrays.toString(GTL));
        System.out.println(Arrays.toString(GTR));
        int[] Min = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Min[i] = Math.min(GTL[i], GTR[i]);
        }
        System.out.println(Arrays.toString(Min));
        int[] WaterUnits = new int[arr.length];
        int Ans = 0;
        for (int i = 0; i < WaterUnits.length; i++){
            WaterUnits[i] = arr[i] - Min[i];
            if (WaterUnits[i] > 0) {
                Ans += WaterUnits[i];
            }
        }
        System.out.println(Ans);
    }
    static int[] GreaterToLeft(int[] arr) {
        int[] Output = new int[arr.length];
        Stack<Integer> UseStack = new Stack<>();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                Output[i] = 0;
                UseStack.push(arr[i]);
            }
            else {
                while (!UseStack.isEmpty() && UseStack.peek() <= arr[i]) {
                    UseStack.pop();
                }
                if (UseStack.isEmpty()){
                    Output[i] = 0;
                    UseStack.push(arr[i]);
                }
                else{
                  temp = UseStack.peek();
                  UseStack.pop();
                }
                while (!UseStack.isEmpty() && UseStack.peek() >= temp) {
                    temp = UseStack.peek();
                    UseStack.pop();
                }
                Output[i] = temp;
                UseStack.push(temp);
                UseStack.push(arr[i]);
            }
        }
        return Output;
    }

    static int[] GreaterTORight(int[] arr) {
        int[] Output = new int[arr.length];
        Stack<Integer> UseStack = new Stack<>();
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                Output[i] = 0;
                UseStack.push(arr[i]);
            }
            else {
                while (!UseStack.isEmpty() && UseStack.peek() <= arr[i]) {
                    UseStack.pop();
                }
                if (UseStack.isEmpty()){
                    Output[i] = 0;
                    UseStack.push(arr[i]);
                }
                else{
                 temp = UseStack.peek();
                 UseStack.pop();
                }
                while (!UseStack.isEmpty() && UseStack.peek() >= temp) {
                    temp = UseStack.peek();
                    UseStack.pop();
                }
                Output[i] = temp;
                UseStack.push(temp);
                UseStack.push(arr[i]);
            }
        }
        return Output;
    }
}
