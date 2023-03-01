package mrkool.stackQuestions;

/*
 The stock span problem is a financial problem where
 we have a series of N daily price quotes for a stock
 and we need to calculate the span of the stock’s price for all N days.
 The span Si of the stock’s price on a given day i
 is defined as the maximum number of consecutive days just before the given day,
 for which the price of the stock on the current day is less than its price on the given day.

 Input: N = 7, price[] = [100 80 60 70 60 75 85]
 Output: 1 1 1 2 1 4 6
 Explanation: Traversing the given input span for 100 will be 1, 80 is smaller than 100 so the span is 1,
 60 is smaller than 80 so the span is 1, 70 is greater than 60 so the span is 2 and so on.
 Hence the output will be 1 1 1 2 1 4 6.
 */

import java.util.*;



public class StockSpan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = {68,735,101,770,525,279,559,563,465,106,146,82,28,362,492,596};
        int n = price.length;
        int[] ans = Stocks(price);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Stocks(int[] price) {
        Stack<Integer> useStack = new Stack<>();
        int[] ans = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            while (!useStack.isEmpty() && price[useStack.peek()] <= price[i]){
                useStack.pop();
            }
            ans[i] = useStack.isEmpty()?(i+1):(i-useStack.peek());
            useStack.push(i);
        }
        return ans;
    }
}

