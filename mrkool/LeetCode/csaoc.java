package mrkool.pakage;

import java.util.Scanner;
// curved surface area of cylinder = 2*pie*r*h
public class csaoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of surface and top in cm");
        int r = sc.nextInt();
        System.out.println("input height of cylinder in cm");
        int h = sc.nextInt();
        float pie = 3.14f;
        float csaoc = 2*pie*r*h;
        System.out.println("curved surface area of cylinder is "+csaoc+ "cm2");
    }
}
