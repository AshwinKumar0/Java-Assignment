package mrkool.pakage;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a = in.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = in.nextInt();
        int cf = 0;
        int max = 0;
        //factors of a
        if (a > b) {
            for (int i = 1; i <= a; i++) {

                if (a % i == 0 && b % i == 0) {
                    cf = i;
                    if (cf > max) {
                        max = cf;
                    }
                }

            }
            System.out.println(max);
        }
        if (a < b) {
            for (int i = 1; i <= b; i++) {

                if (a % i == 0 && b % i == 0) {
                    cf = i;
                    if (cf > max) {
                        max = cf;
                    }
                }

            }
            System.out.println(max);
        }
    }
}
