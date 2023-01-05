package mrkool.pakage;

public class swap {

    public swap(int i, int i1) {
    }

    public static void main(String[] args) {
        int a=10,b=20;
       // swap(a,b);
        swapp(a,b);
      // System.out.println("swapped no.s are "+a+" "+b);
    }
    static void swapp(int x,int y){
        int temp = x;
         x=y;
         y=temp;
       System.out.println("swapped no.s are "+x+" "+y);

    }
}
