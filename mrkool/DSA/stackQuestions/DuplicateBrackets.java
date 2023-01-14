package mrkool.stackQuestions;
import java.util.Scanner;
import java.util.Stack;

/* Question1 .
 You are given a string expression representing an expression ,
 Assume that the expression is balanced i.e. the
 opening and closing brackets match with each other.
 But, some pair of brackets maybe extra needless.
 You are required to print true if you detect extra brackets and false otherwise.

 e.g
 1. ((a+b) + (c+d)) -> false.
 2. (a+b) + ((c+d)) -> true.

*/
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        String str = sc.nextLine();
        System.out.println(str);
        str = str.replaceAll("\\s","");
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                }
                else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println(false);

    }
}
