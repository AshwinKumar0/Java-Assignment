package mrkool.stackQuestions;

class minStack {

    private final int[] Data;
    private int Top;
    private int Min;

    public minStack(int size) {

        Data = new int[size];
        Top = -1;
        Min = Integer.MIN_VALUE;

    }

    public boolean isEmpty() {
        return Top == -1;
    }

    public boolean isFull() {
        return Top == Data.length - 1;
    }

    public int size() {
        return Top;
    }

    public void push(int value) {
        if(Top == Data.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        else{
            if (Top == -1) {
                Data[++Top] = value;
                Min = value;
            }
            else if (value <= Min) {
                Data[++Top] = (2 * value) - Min;
                Min = value;
            }
            else{
                Data[++Top] = value;
            }
        }
    }

    public void pop() {
        if (Top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        else if(Data[Top] <= Min) {
            int x = Min;
            Min = (2 * x) - Data[Top];
            Top--;
        }
        else
        {
            Top--;
        }
    }

    public int peek() {
        if (Top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        else if (Data[Top] <= Min) {
            return Min;
        }
        else{
            return Data[Top];
        }

    }

    public int Min() {
        return Min;
    }

}


public class OptimisedMinStack {
    public static void main(String[] args) {
        minStack st = new minStack(5);
        st.push(16);
        st.push(3);
        st.push(5);
        st.push(1);
        st.push(4);

        int l = st.size();
//        for (int  i = 0; i <=l; i++) {
//            System.out.println(st.peek());
//            st.pop();
//        }
        System.out.println("Peek element: "+st.peek());
        System.out.println("Min element: "+st.Min());
        st.pop();
        System.out.println("Peek element: "+st.peek());
        System.out.println("Min element: "+st.Min());
        st.pop();
        System.out.println("Peek element: "+st.peek());
        System.out.println("Min element: "+st.Min());
        st.pop();
        System.out.println("Peek element: "+st.peek());
        System.out.println("Min element: "+st.Min());
        st.pop();
        System.out.println("Peek element: "+st.peek());
        System.out.println("Min element: "+st.Min());
        st.pop();
        st.pop();


    }
}
