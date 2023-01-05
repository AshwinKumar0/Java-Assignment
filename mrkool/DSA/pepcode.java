package mrkool;
import java.util.Scanner;

public class pepcode {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long num = 0;
        //reverse n and store it in num.
        while(n>0) {
            long rem = n%10;
            num = (num*10)+rem;
            n = n/10;
        }
        //print every remainder on num
        while(num>0) {
            long rem = num%10;
            System.out.println(rem);
            num = num/10;
        }
    }
}
