package mrkool.stackQuestions;
import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        String x = "[()]{}{[()()]()}";
        System.out.println(Checker(x));
    }
    static boolean Checker(String x){
        Stack<Character> S = new Stack<>();
        for(int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                S.push(ch);
            }
            else if(!S.isEmpty()){
                if (ch == ')' && S.peek() == '('){
                   S.pop();
                   }
                if (ch == '}' && S.peek() == '{'){
                    S.pop();
                }
                if (ch == ']' && S.peek() == '['){
                    S.pop();
                }


            }
            else {
                S.push(ch);
            }
        }
        return S.isEmpty();
    }
}
