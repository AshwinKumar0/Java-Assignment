package mrkool.pakage;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n1");
        int a = in.nextInt();
        System.out.println("n2");
        int b = in.nextInt();
        int product = mul(a,b);
        System.out.println(product);
        System.out.println("Enter your name");
        String s = in.next();
        String nam =invitation(s);
        System.out.println(nam);

    }
    static int mul(int a, int b){
        return a*b;
    }
    static String invitation(String name){
        return "hello"+name;
    }
}