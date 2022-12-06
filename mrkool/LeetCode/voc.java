package mrkool.pakage;

import java.util.Scanner;

public class voc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of base in cm");
        int r=sc.nextInt();
        System.out.println("input height of of cone in cm");
        int h=sc.nextInt();
        float pie = 3.14f;
        float voc = pie*r*r*h/3;
        System.out.println("volume of cone is "+voc);

    }
}
