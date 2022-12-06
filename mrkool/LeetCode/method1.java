package mrkool.pakage;

import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("enter a number");
        int n = sc.nextInt();
        boolean ans=armstrong(n);
        System.out.println(ans);*/
        for(int n=1;n<1000;n++){
            boolean ans=armstrong(n);
            if(ans) {
                System.out.println(n);
            }
        }

    }

     static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        return original==sum;
    }

}
