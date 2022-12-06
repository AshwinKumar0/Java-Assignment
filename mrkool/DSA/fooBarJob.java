package mrkool;
import java.util.*;

public class fooBarJob {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String B = scn.next();
        String H = " ";
        int I = scn.nextInt();
        int N = scn.nextInt();
        printGiantM(B,H,I,N);
    }

    public static void printGiantM(String B, String H, int I, int N) {
        for(int i=I;i<=N;i++) {
            for(int j=I;j<N;j++) {
                if(i==(N-j+1))
                    System.out.print(B);
                else
                    System.out.print(H);
            }
            for(int j=I;j<N;j++) {
                if(i==j)
                    System.out.print(B);
                else
                    System.out.print(H);
            }
            for(int j=I;j<N;j++) {
                if(i==(N-j+1))
                    System.out.print(B);
                else
                    System.out.print(H);
            }
            for(int j=I;j<=N;j++) {
                if(i==j)
                    System.out.print(B);
                else
                    System.out.print(H);
            }
            System.out.println();
        }
    }
}