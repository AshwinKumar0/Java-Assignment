package mrkool;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
       int num = sc.nextInt();
        System.out.println("Enter the value of k");
       int k = sc.nextInt();
       int ans = fun(num,k);

        System.out.println(ans);
    }
    static int fun(int num, int k) {
        int i = 1;
        int count = 0;
        while (true) {
            if(i % num != 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
            i++;
        }
    }


}



