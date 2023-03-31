//1. You are given a postfix expression.
//        2. You are required to evaluate it and print it's value.
//        3. You are required to convert it to infix and print it.
//        4. You are required to convert it to prefix and print it.
//
//        Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
//        Input Format
//        Input is managed for you
//        Output Format
//        value, a number
//        infix
//        prefix


//Constraints
//        1. Expression is a valid postfix expression
//        2. The only operators used are +, -, *, /
//        3. All operands are single digit numbers.


//        Sample Input
//        264*8/+3-

//        Sample Output
//        2
//        ((2+((6*4)/8))-3)
//        -+2/*6483


package mrkool.stackQuestions;
import  java.util.Stack;
public class value_Infix_Prefix {
    public static void main(String[] args) {
     String Postfix = "264*8/+3-";
     findValue(Postfix);
     toInfix(Postfix);
     toPrefix(Postfix);
    }
    static void findValue(String postFix) {
        Stack<Integer> opdStack = new Stack<>();
        for (int i = 0; i < postFix.length(); i++) {
            char ch = postFix.charAt(i);
            if (ch - 48 >= 0 && ch - 48 <= 9) {
                opdStack.push(ch - 48);
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                int n1 = opdStack.peek();
                opdStack.pop();
                int n2 = opdStack.peek();
                opdStack.pop();
                opdStack.push(Operation(n2, n1, ch));
            }
        }
        System.out.println(opdStack.peek());
    }
    static int Operation(int x, int y, char op){
        if (op == '+') return x+y;
        if (op == '-') return x-y;
        if (op == '/') return x/y;
        if (op == '*') return x*y;
        return 0;
    }
    static void toInfix(String postFix) {
        Stack<String> opdStack = new Stack<>();
        for (int i = 0; i < postFix.length(); i++) {
            char ch = postFix.charAt(i);
            String st = "";
            if (ch - 48 >= 0 && ch - 48 <=9){
                opdStack.push(String.valueOf(ch));
            }
            else if(!opdStack.isEmpty()) {
                String a = opdStack.peek();
                opdStack.pop();
                String b = opdStack.peek();
                opdStack.pop();
                st = infixOp(b,a,ch);
                opdStack.push(st);
            }
        }
        System.out.println(opdStack.peek());
    }

    static String infixOp(String a, String b, char op) {
        return "("+a+op+b+")";
    }

    static void toPrefix(String postFix) {
        Stack<String> opdStack = new Stack<>();
        for (int i = 0; i < postFix.length(); i++) {
            char ch = postFix.charAt(i);
            if (ch - 48 >=0 && ch - 48 <=9) {
                opdStack.push(String.valueOf(ch));
            }
            else if (!opdStack.isEmpty()){
                String a = opdStack.peek();
                opdStack.pop();
                String b = opdStack.peek();
                opdStack.pop();
                String st = prefixOp(b,a,ch);
                opdStack.push(st);
            }
        }
        System.out.println(opdStack.peek());
    }

    static String prefixOp(String a, String b, char op) {
        return op+a+b;
    }


}
