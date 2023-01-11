package mrkool.stackQuestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class NextGreaterToRight {
    public static void main(String[] args) {
        int[] arr = {5,3,8,-2,7};
        Stack<Integer> S = new Stack<>();
                S = Nge(arr);
        System.out.println(S);
    }

    static Stack<Integer> Nge(int[] arr) {
        Stack<Integer> useStack = new Stack<>();
        Stack<Integer> ansStack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                ansStack.push(-1);
                useStack.push(arr[i]);
            } else {
                if (arr[i] < useStack.peek()) {
                    ansStack.push(useStack.peek());
                    useStack.push(arr[i]);
                } else {
                    while (!useStack.isEmpty() && useStack.peek() < arr[i]) {
                        useStack.pop();
                    }
                    if (useStack.isEmpty()) {
                        ansStack.push(-1);
                        useStack.push(arr[i]);
                    } else if (arr[i] < useStack.peek()) {
                        ansStack.push(useStack.peek());
                        useStack.push(arr[i]);
                    }
                }
            }
        }
        int[] ans = new int[ansStack.size()];
        Iterator<Integer> value = ansStack.iterator();
        int i = ans.length-1;
        while (value.hasNext()){
            ans[i] = value.next();
            i--;
        }
        System.out.println(Arrays.toString(ans));
        return ansStack;
    }
}
