package mrkool.pakage;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX=Integer.MIN_VALUE;
        int count = 0;
        while (true) { //make while condition true always
            System.out.println("input integer");
            int num = sc.nextInt();
            if (num!=0) { //run this if input is non-zero
                if(num>MAX){
                    MAX=num;
                }
                else if(num<MAX){
                    MAX=count+MAX;

                }
            }
            else {
                break;// if number is zero exit the loop
            }
        }
       System.out.println("Highest number is "+MAX); // print the MAX value
    }
}
