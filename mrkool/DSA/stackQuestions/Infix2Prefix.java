package mrkool.stackQuestions;
import java.util.Stack;
public class Infix2Prefix {
    public static void main(String[] args) {
      String Infix = "5 * (7 - 2)";
        System.out.println(ConvertToPrefix(Infix));
    }
    static String ConvertToPrefix(String str) {
        String result = "";
        Stack<String> opd = new Stack<>();
        Stack<Character> opt = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch - 48 >= 0 && ch - 48 <= 9) {
                opd.push(String.valueOf(ch));
            } else if (ch == '(') {
                opt.push(ch);
            } else if (ch == ')') {
                while (opt.peek() != '(') {
                    String ch1 = opd.peek();
                    opd.pop();
                    String ch2 = opd.peek();
                    opd.pop();
                    char ch3 = opt.peek();
                    opt.pop();
                    result = ch3 + ch2 + ch1;
                    opd.push(result);
                    result = "";
                }
                opt.pop();
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                if (!opt.isEmpty() && Precedence(opt.peek()) >= Precedence(ch)) {

                    String ch1 = opd.peek();
                    opd.pop();
                    String ch2 = opd.peek();
                    opd.pop();
                    char ch3 = opt.peek();
                    opt.pop();
                    result = ch3 + ch2 + ch1;
                    opd.push(result);
                    result = "";
                }
                opt.push(ch);
            }
        }
                while (!opt.isEmpty()){

                    String ch1 = opd.peek();
                    opd.pop();
                    String ch2 = opd.peek();
                    opd.pop();
                    char ch3 = opt.peek();
                    opt.pop();
                    result = ch3 + ch2  + ch1;
                    opd.push(result);
                    result = "";
                }



        return opd.peek();
    }
    static int Precedence(char opt) {
        if (opt == '+' || opt == '-') return 1;
        if (opt == '/' || opt == '*') return 2;
        return -1;
    }
}
