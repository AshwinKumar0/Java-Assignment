package mrkool;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Stockspan {
    public static void main(String[] args) {
        int[] price = {100,80,60,70,60,75,85};
        System.out.println(Answers(price));
    }
    static Stack<Integer> Answers(int[] price) {
        int[] ans = new int[price.length];
        Stack<Integer> useStack = new Stack<>();
        Stack<Integer> ansStack = new Stack<>();
        for (int i = 0; i < price.length; i++) {
            if ( i == 0) {
                useStack.push(i);
                ansStack.push(1);
            }
            else {
                while(!useStack.isEmpty() && price[useStack.peek()] <= price[i]) {
                    useStack.pop();
                }
                if (useStack.isEmpty()){
                    ansStack.push(i+1);
                    useStack.push(i);
                }
                else {
                    ansStack.push(i-useStack.peek());
                    useStack.push(i);
                }
            }
        }
        Iterator<Integer> value = ansStack.iterator();
        int j = 0;
        while (value.hasNext()) {
            ans[j] = value.next();
            j++;
        }
        System.out.println(Arrays.toString(ans));
        return ansStack;
    }


}
