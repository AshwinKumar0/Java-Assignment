package mrkool.stackQuestions;

 class Stack {

    private final int[] Data;
    private final int[] auxData;
    private int Top;
    private int auxTop;
    public Stack(int size) {
        Data = new int[size];
        auxData = new int[size];
        Top = -1;
        auxTop = -1;
    }
    public boolean isEmpty() {
        return Top == -1;
    }
    public boolean isFull() {
        return Top == Data.length -1;
    }

    public int size() {
        return Top;
    }

    public int peek() {
        if (Top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return Data[Top];
    }
    public void Push(int Value) {
        if (Top == Data.length -1) {
            throw new RuntimeException("Stack is Full");
        }
        else {
            Data[++Top] = Value;
            if (auxTop == -1) {
                auxData[++auxTop] = Value;
            }
            else if (Value <= auxData[auxTop]) {
                auxData[++auxTop] = Value;
            }
        }
    }
    public void Pop() {
        if (Top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        else{
            if (Data[Top] == auxData[auxTop]) {
                auxTop--;
            }

            Top--;
        }
    }

    public int MinValue() {
        return auxData[Top];
    }


}

public class MinStack {
    public static void main(String[] args) {
        Stack NewStack = new Stack(5);
        NewStack.Push(5);
        NewStack.Push(4);
        NewStack.Push(3);
        NewStack.Push(2);
        NewStack.Push(1);

        int l = NewStack.size();
        System.out.println("Smallest Element in Stack:- "+NewStack.MinValue());

        for (int i = 0; i <= l; i++) {
            System.out.println(NewStack.peek());
            NewStack.Pop();
        }
        //System.out.println(NewStack.peek());
        NewStack.Push(0);
        System.out.println("Smallest Element in Stack:- "+NewStack.MinValue());



    }
}
