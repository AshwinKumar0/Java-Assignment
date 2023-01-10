package mrkool.stackQuestions;

import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
 */
public class BalancedBrackets {
    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++){
             char ch = str.charAt(i);
             if (ch == '(' || ch == '{' || ch == '[') {
                 st.push(ch);
             } else if (ch == ')' || ch == '}' || ch == ']') {
                 if (st.isEmpty()){
                     System.out.println(false);
                     return;
                 }
                 else if (ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '['  ){
                     st.pop();
                 }
                 else {
                     System.out.println(false);
                     return;
                 }

             }
             else {
                 continue;
             }

        }
        System.out.println(st.isEmpty());

    }

}
