package mrkool.stackQuestions;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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
public class NextGreaterToLeft {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array elements");
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Stack<Integer> s = NGL(arr);
    System.out.println(s);	
    }

    static Stack<Integer> NGL(int[] arr) {
     Stack<Integer> useStack = new Stack<>();
     Stack<Integer> ansStack = new Stack<>();
     List<Integer> ans = new ArrayList<>();

     for(int i = 0; i < arr.length; i++) {
      if (i == 0) {
        ansStack.push(-1);
        useStack.push(arr[i]);
      }  
      else{
       while (!useStack.isEmpty() && useStack.peek() <= arr[i]) {
         useStack.pop();
       }
       if (useStack.isEmpty()) {
        ansStack.push(-1);
        useStack.push(arr[i]);
       }
       else{
         ansStack.push(useStack.peek());
         useStack.push(arr[i]);
       }
      }
     }
      
     //Iterator<Integer> Value =  ansStack.iterator();
     return ansStack; 

    }
}
