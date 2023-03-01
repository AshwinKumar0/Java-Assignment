package mrkool.pakage;

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many disc");
        int a = sc.nextInt();
        long b = (long) (Math.pow(2,a) -1);
        System.out.println(b);

    }
}
