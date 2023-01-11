package mrkool.stackQuestions;
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
 */
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
