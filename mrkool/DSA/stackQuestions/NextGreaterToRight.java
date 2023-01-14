package mrkool.stackQuestions;
/*
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
import java.util.Stack;

public class NextGreaterToRight {
    public static void main(String[] args) {
        long[] arr= {6273, 6273, 8726, 8726, 5881, 5881, 1953 ,1953, 8305, 8305, 9909, 9909, 5936, 5936, 4961, 4961, 7822, 7822, 4622, 4622, 2296, 2296};
      long[] ans = Nge(arr,arr.length);
        System.out.println(Arrays.toString(ans));
    }

    static long[] Nge(long[] arr, int n) {
        long[] ans = new long[n];
        Stack<Long> useStack = new Stack<>();
        //Stack<Integer> ansStack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            if(i == n-1) {
                ans[i] = -1;
                useStack.push(arr[i]);
            }
            else{
                while(!useStack.isEmpty() && useStack.peek() <= arr[i]) {
                    useStack.pop();
                }
                if(useStack.isEmpty()) {
                    ans[i] = -1;
                    useStack.push(arr[i]);
                }
                else{
                    ans[i] = useStack.peek();
                    useStack.push(arr[i]);
                }
            }
        }
        return ans;
    }
}
