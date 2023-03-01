package mrkool;

import java.util.Arrays;
import java.util.Stack;

/*
"Next greater element on the left" of an element x is defined as the first element to left of x having value greater than x.
Note -> If an element does not have any element on it's left side greater than it, consider -1 as it's "next greater element on left"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is -1
Next greater for 5 is -1
Next greater for 9 is -1
Next greater for 3 is 9
Next greater for 1 is 3
Next greater for 12 is -1
Next greater for 6 is 12
Next greater for 8 is 12
Next greater for 7 is 8
 */

public class NGL {
public static void main (String[] args) {
    int[] arr = {2,5,9,3,1,12,6,8,7};
    System.out.println(Arrays.toString(Find(arr)));
}
static int[] Find(int[] arr) {
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
}
