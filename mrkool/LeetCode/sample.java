package mrkool.pakage;
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        int k=34;
        int n=0;
        for (int i=0;i< num.length;i++){
            n=n*10+num[i];
        }
        n=n+k;
        System.out.println(n);
    }
}
