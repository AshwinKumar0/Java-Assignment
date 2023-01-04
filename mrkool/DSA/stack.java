package mrkool;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        myStack.push(25);

        int val = myStack.pop();
        System.out.println(val);
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.search(25));

    }

}
