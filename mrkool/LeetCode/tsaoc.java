package mrkool.pakage;

import java.util.Scanner;

public class tsaoc {
    public static void main(String[] args) {
        //total surface area of cube = 6a^2
        Scanner sc = new Scanner(System.in);
        System.out.println("input sides of cube in cm");
        int a = sc.nextInt();
        int tsaoc = 6*a*a;
        System.out.println("total surface area of cube is " +tsaoc+ "cm square");

    }
}
