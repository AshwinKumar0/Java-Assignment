package mrkool.pakage;

import java.util.Scanner;

public class pp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    while (true) {
      System.out.println("press X if you want to stop");
      char ch = sc.next().charAt(0);
      if (ch == 'x' || ch == 'X') {
        break;
      } else {
        System.out.println("enter number");
        int n = sc.nextInt();
        sum = sum + n;
      }
    }
    System.out.println(sum);

  }
}
