package mrkool.pakage;
import java.util.*;
public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


         //leetcode Happy number.
        /*
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean ans = isHappy(n);
        System.out.println(ans);

    }

    private static boolean isHappy(int n) {
        if (n < 10) {
            if (n != 1 && n != 7) return false;
        }
        int num = Sum(n);
        if (num == 1) return true;
        return isHappy(num);
    }

    static int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;

         */

        //leetcode ROMAN TO INTEGER
/*
        String  s = "MCMXCIV";
        int ans=findInteger(s);
        System.out.println(ans);
    }
    static int findInteger(String s){
        int sum=0;
        for (int i=0;i<s.length();i++){
                int a=getvalue(s.charAt(i));
                if (i<s.length()-1 && a<getvalue(s.charAt(i+1))){
                    sum-=a;
                }
                else {
                    sum += a;
                }

        }
        return sum;
    }
    static int getvalue(char ch){
        int ans=0;
        switch (ch) {
            case 'I' -> ans = 1;
            case 'V' -> ans = 5;
            case 'X' -> ans = 10;
            case 'L' -> ans = 50;
            case 'C' -> ans = 100;
            case 'D' -> ans = 500;
            case 'M' -> ans = 1000;
            default -> {
            }
        }
        return ans;

 */

        //leetcode 62 Unique paths
        /*
        int m=4;
        int n=4;
        int ans=uniquePaths(m,n);
        System.out.println(ans);

        }

    private static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return paths(0,0,m,n,arr);
    }

    static int paths(int s1, int s2, int m, int n, int[][] arr) {
        //base cases:-

        if(s1==m-1 && s2==n-2 || s1==m-2 && s2==n-1) return 1;
        if(s1==m && s2>=0 || s1>=0 && s2==n) return 0;
        if(arr[s1][s2]!=0) return arr[s1][s2];
        arr[s1][s2]= paths(s1+1,s2,m,n,arr)+paths(s1,s2+1,m,n,arr);
        return arr[s1][s2];


         */

        //leetcode 89 gray code
/*
        int n=3;
        ArrayList<String> ans =graycode(n);
        System.out.println(ans);
        ArrayList<Integer> al = new ArrayList<>();
        for(String st : ans) {
            al.add(Integer.parseInt(st,2));
        }
        System.out.println(al);
    }
    static ArrayList<String> graycode(int n) {
        if (n == 1) {
            ArrayList<String> str = new ArrayList<>();
            str.add("0");
            str.add("1");
            return str;
        }
        ArrayList<String> str =graycode(n - 1);
        ArrayList<String> finalstr = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            finalstr.add("0" + str.get(i));
        }
        for (int i = str.size() - 1; i >= 0; i--) {
            finalstr.add("1" + str.get(i));
        }
        return finalstr;

 */

        //leetcode perfect square
/*
        int n=12;
        int[] arr = new int[n+1];
        int ans = rec(n,arr);
        System.out.println(ans);
    }
    static int rec(int n, int[] arr) {
        if(n<0) return Integer.MAX_VALUE;
        if(n==0) return 0;
        if(arr[n]!=0) return arr[n];
        int min=n;
        for(int i=1; i*i<=n; i++) {
            min=Math.min(rec(n-(i*i),arr),min);
        }
        arr[n]=min+1;
        return arr[n];

 */
    }
}


