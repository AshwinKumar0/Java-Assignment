package mrkool.stackQuestions;

/*"Next Smaller element on the left" of an element x is defined as the first element to left of x having value smaller than x.
  Note -> If an element does not have any element on it's left side smaller than it, consider -1 as it's "next smaller element on left"
 e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next Smaller for 2 is -1
Next Smaller for 5 is 2
Next Smaller for 9 is 5
Next Smaller for 3 is 2
Next Smaller for 1 is -1
Next Smaller for 12 is 1
Next Smaller for 6 is 1
Next Smaller for 8 is 6
Next Smaller for 7 is 6
*/

import java.util.Scanner;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallerToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> s = NSL(arr);
        System.out.println(s);
        //System.out.println(s.size());
        int l = s.size();
        for (int i = 0; i < l; i++) {
            System.out.print(s.peek() + " ");
            if (!s.isEmpty()) s.pop();
        }

    }
    static Stack<Integer> NSL(int[] arr) {
        Stack<Integer> useStack = new Stack<>();
        Stack<Integer> ansStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                ansStack.push(-1);
                useStack.push(arr[i]);
            }
            else{
                while (!useStack.isEmpty() && useStack.peek() >= arr[i]) {
                    useStack.pop();
                }
                if (useStack.isEmpty()) {
                    ansStack.push(-1);
                    useStack.push(arr[i]);
                }
                else {
                    ansStack.push(useStack.peek());
                    useStack.push(arr[i]);
                }
            }
        }
        return ansStack;
    }
}
