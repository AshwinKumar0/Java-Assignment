package mrkool;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        stack1 my_stack = new stack1();
        System.out.println("Initial Stack Empty : " + my_stack.isEmpty());
        //push elements
        my_stack.push(10);
        my_stack.push(20);
        my_stack.push(30);
        my_stack.push(40);
        my_stack.push(50);
        System.out.println("After Push Operation...");
        //print the elements
        my_stack.display();
        //pop two elements
        my_stack.pop();
        my_stack.pop();
        System.out.println("After pop Operation...");
        //print the stack Again
        my_stack.display();
    }
}
  class stack1 {

    // Stack implementation using an array

    int top;     //define top of stack
    int maxsize = 5;  //max size of the stack
    int[] stack_array = new int[maxsize]; //define array that will hold stack elements

    stack1(){       // stack constructor; initially top = -1
        top = -1;
    }

    boolean isEmpty() { //isEmpty () method
        return (top < 0);
    }

    boolean push (int val) { // push method
        if(top == maxsize-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            top++;
            stack_array[top] = val;
            return true;
        }
    }

    boolean pop () { // pop method
        if (top == -1) {
            System.out.println("Stack Underflow!!");
            return false;
        }
        else {
            System.out.println("\nItem popped: "+ stack_array[top--]);
            return true;
        }
    }
    void display() { //print the stack elements
        System.out.println("Printing stack elements ....");
        for (int i = top; i>=0; i--){
            System.out.println(stack_array[i]+" ");
        }
    }


}
