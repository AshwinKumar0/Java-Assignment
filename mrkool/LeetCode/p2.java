package mrkool.pakage;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        //int min = Integer.MIN_VALUE;
        System.out.println("PRESS Y TO CONTINUE");
        char choice = sc.next().charAt(0);
        while (choice == 'Y') {
            int count = 0;
            System.out.println("enter a number");
            int num = sc.nextInt();
            if (num != 0) {
                if (num > max) {
                    max = num;
                } else if (num < max) {
                    max = count + max;
                }

            } else {
                break;
            }

        }
        System.out.println("higest no. is "+max);
    }
}
