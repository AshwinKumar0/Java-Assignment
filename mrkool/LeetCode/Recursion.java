package mrkool.pakage;

import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Head(3);
       // System.out.println(ans);
    }
    static void Head(int n){
        if (n>0) {
            Head(n - 1);
            System.out.print(n);
            Head(n - 1);
        }

         */
/*
        int n=1;
        print(n);
    }
    static void print(int n){

        print1(n+1);
        System.out.println(n);
    }
    static void print1(int n){

        print2(n+1);
        System.out.println(n);
    }
    static void print2(int n){
        System.out.println(n);

 */
/*
        int n=1;
        print(n);
    }
    static void print(int n){
        if (n>5){
            return;
        }
        System.out.println(n);
        print(n+1);


 */

        //fibonacci of a number

      /*  System.out.println("enter the the nth number");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println(ans);
    }
    static int fib(int n){
        if (n==1 ){
            return 1;
        }
        if (n==0)
            return 0;
           return fib(n-1)+fib(n-2);

       */

        //gfg Sum triangle from array
/*
        int[] arr = {1,2,3,4};
        int l = arr.length;
        int[] ans = new int[l];
        System.arraycopy(arr, 0, ans, 0, l);
        rec(arr,l);
        System.out.println(Arrays.toString(ans));

    }
    static void rec(int[] arr, int n) {
        if (n==1){
            return;
        }
        for (int i = 0; i<n-1; i++) {
            arr[i] = arr[i] + arr[i+1];
        }
        //System.out.println(Arrays.toString(arr));
        int[] ans = new int[n-1];
        for (int j=0; j< n-1; j++) {
            ans[j]=arr[j];
        }
        rec(arr,n-1);
        System.out.println(Arrays.toString(ans));


 */

        // GFG Recursive Programs to find Minimum and Maximum elements of array
/*
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int min =  minrec(arr,0);
        int max =  maxrec(arr,0);
        System.out.println("Minimum in array "+min);
        System.out.println("Maximum in array "+max);
    }
    static int minrec(int[] arr,int n) {
        if (n==arr.length-1) return arr[n];
        int min = arr[n];
       int ans= minrec(arr,n+1);
        if (ans<min){
            min=ans;
        }
        return min;
    }
    static int maxrec(int[] arr,int n) {
        if (n==arr.length-1) return arr[n];
        int max = arr[n];
        int ans= maxrec(arr,n+1);
        if (ans>max){
            max=ans;
        }
        return max;

 */
        // print sub-sequence of string
        /*
                String str = sc.next();
                printSS(str,"");

            }

            public static void printSS(String str, String ans) {
                if(str.length()==0) {
                    System.out.println(ans);
                    return;
                }

                char ch = str.charAt(0);
                str=str.substring(1);
                printSS(str,ans+ch);
                printSS(str,ans);


         */


        //BINARY SEARCH USING RECURSION
/*
                int[] nums = {-1, 0, 3, 5, 9, 12};
                int target = 9;

 */


        // First UpperCase letter in a String.
/*


        Scanner sc = new Scanner(System.in);
       String str = sc.next();
        if(str.length()==0) System.out.println("invalid input");
        char ch = FirstUpperCase(str);
        System.out.println(ch);
    }
    static char FirstUpperCase(String str) {
        if(str.length()==0) return '0';
        char ch = str.charAt(0);
        if(Character.isUpperCase(ch)) return ch;
        char ch1 = '0';
        if(Character.isLowerCase(ch)) {
            String str1 = str.substring(1);
            ch1 = FirstUpperCase(str1);
        }
        return ch1;

 */

        // Reverse String using recursion

/*

        char[] s ={'h','e','l','l','o'};
        ReverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void ReverseString(char[] s){

        reverse(s,0,s.length-1);
    }
    static void reverse(char[] s,int start,int end) {
        if(start==end) return;
        reverse(s,start+1,end-1);
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;


 */

        //special fibonacci series
/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = rec(a,b,n);
        System.out.println(ans);

    }
    static int rec(int a, int b, int n) {
        n=n%3;
        int ans = 0;
        if(n==0) ans = a;
        if(n==1)  ans = b;
        if(n==2) ans = a ^ b;
        return ans;

 */

        //pattern 1 using recursion

        /*

         *****
         ***
         **
         *

         */
/*
        System.out.println("Enter no. of row's");
        int row = sc.nextInt();
        rec(row,0);
    }
    static void rec(int row, int col) {
        if (row == 0) return;
        if (col < row) {
            System.out.print("*");
            rec(row, ++col);
        } else {
            System.out.println();
            rec(--row, 0);
        }

    }

 */

        // pattern 2 using recursion

        /*

         *
         **
         ***
         ****

         */
        /*
        System.out.print("Enter the no. of rows");
        int n = sc.nextInt();
        rec(0,0,n);
    }
    static void rec(int row, int col, int end) {
        if (row==end) return;
        if (col<=row) {
            System.out.print("*");
            rec(row,++col,end);
        }
        else {
            System.out.println();
            rec(++row,0,end);
        }

         */


        //bubble sort recursion
/*
        int[] arr = {4,3,2,1};
        int start_index=0;
        int end_index = arr.length-1;
        BubbleSort(arr,start_index,end_index);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr, int start_index, int end_index) {
        if (start_index==end_index) return;
        if (start_index<end_index){
            if (arr[start_index]>arr[start_index+1]) {
                int temp = arr[start_index];
                arr[start_index]=arr[start_index+1];
                arr[start_index+1]=temp;
            }
            BubbleSort(arr,start_index+1,end_index);
        }

        BubbleSort(arr,0,end_index-1);

 */


        //Selection Sort (Recursion)
        /*
        int[] arr = {4,3,2,1,0};
        int start = 0;
        int end = arr.length-1;
        SelectionSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr, int start, int end) {
        if (start == end)  return;
        if (start<end) {
            int min = arr[start];
            if (arr[start]>arr[start+1]){
                min
            }
        }

         */

        //Sum Of digit of a number using recursion
/*
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println(sum);
    }
    static int sumOfDigit(int num) {
        if(num==0) {
            return 0;
        }
            int rem = num % 10;
            int sum = sumOfDigit(num / 10);
            sum = sum + rem;

        return sum;

*/

        // Product of two numbers
/*
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        int product = Rec(Math.max(x,y),Math.min(x,y),1);
        System.out.println(product);
    }
    static int Rec(int a, int b, int count) {
        if (count==b) {
            return a;
        }
        return a+Rec(a,b,count+1);




 */


        //Check Prime (Recursion)

/*
        System.out.println("enter a number");
        int num = sc.nextInt();
        Boolean check = prime(num, 2);
        System.out.println(check);
    }

    static boolean prime(int num, int n) {
        if (num==2) return true;
        if (num==1 || num ==0) return false;
        if (n == num -1 && n%num!=0) {
            return true;
        }
        if (n == num -1 && n%num-1==0) {
            return false;
        }
        boolean ans = prime(num, n + 1);
        boolean ans1 = num % n != 0;
        return ans1 && ans;


 */

// Power of two
/*
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean ans = isPowerOfTwo(num);
        System.out.println(ans);
    }
    static boolean isPowerOfTwo(int num) {
        if (num==1) return true;
        if (num==0) return false;
        if (num%2!=0) {
            return false;
        }
        else {return isPowerOfTwo(num/2);}

 */

        // power of three
/*
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean ans = isPowerOfThree(num);
        System.out.println(ans);
    }

    static boolean isPowerOfThree(int num) {
        if (num == 1) return true;
        if (num == 0) return false;
        if (num % 3 != 0) {
            return false;
        } else {
            return isPowerOfThree(num / 3);
        }

 */

        // Selection sort (recursion)
/*
        int[] arr = {-64,25,12,22,11};
        Sort(arr,0,0,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr, int pos, int min, int start, int end) {
        if (start>end) return;
        if (start<end) {
            if (arr[start+1]<arr[min]){
                min=start+1;
            }
            Sort(arr,pos,min,start+1,end);
        }
        else {
            int temp = arr[pos];
            arr[pos] = arr[min];
            arr[min] = temp;
            Sort(arr,pos+1,pos+1,pos+1,end);
        }

 */

        //Insertion Sort (using loop)
        /*
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

         */

        // insertion Sort (recursion)
/*
        int[] arr = {12, 11, 13, 5, 6};
        int i=0;
        rec(arr,i,i+1);
        System.out.println(Arrays.toString(arr));
    }
    static void rec(int[] arr, int i, int j) {
        if (i>=arr.length-1 || j>= arr.length){
            return;
        }
        if (j==0){
            rec(arr,++i,i+1);
        }
        else if(arr[j-1]<arr[j]) {
            rec(arr,++i,i+1);
        }

        if(j>0) {
            if(arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                rec(arr, i, --j);
            }

        }


 */

        // Program to check if an array is sorted or not (Iterative and Recursive)
/*
        int[] arr = {20,20,78,98,99,97};
        boolean ans = rec(arr,0);
        System.out.println(ans);
    }
    static boolean rec(int[] arr, int index) {
        if (index==arr.length-2) {
            return arr[index] <= arr[index + 1];
        }
        boolean ans = rec(arr,index+1);
        if (arr[index]<=arr[index+1]){
            return ans;
        }
        else {
            ans = false;
        }
        return ans;

 */
        // leetcode 1342. Number of Steps to Reduce a Number to Zero

        /*
        int num = 14;
        int c = count(num,0);
        System.out.println(c);
    }
    static int count(int num, int countg) {
        if(num==0) return countg;
        if (num % 2 != 0) {
            num = num - 1;
            return count(num,++countg);
        }
        return count(num/2,++countg);


         */

        // valid Parenthesis
/*
        String S = "[()]{}{[()()]}";
        Boolean Check = Rec(0,1,S);
        System.out.println(Check);
    }
    static boolean Rec(int i, int next, String S) {



        char ch = S.charAt(i);
        int brac = BrNo(ch);
        boolean isOpening = checkNext(i+1,S);
        if (isOpening) {
            i=next;
            next=next+1;
            Rec(i,next,S);
        }
        else {

            char ch1 = S.charAt(next);
             brac = BrNo(ch1);
             if (ch==1 && ch1==4 || ch==2 && ch1==5 || ch==3 && ch1==6){

             }

        }
    }
    static boolean checkNext(int j, String S) {
        char ch = S.charAt(j);
        return ch == '(' || ch == '{' || ch == '[';
    }
    static int BrNo(char ch) {
        return switch (ch) {
            case ('(') -> 1;
            case ('{') -> 2;
            case ('[') -> 3;
            case (')') -> 4;
            case ('}') -> 5;
            case (']') -> 6;
            default -> -1;
        };
    }

 */

        //Valid String (parenthesis)
        /*

        String S = sc.next();
        char[] expr = S.toCharArray();
        int n = expr.length;
        if(check(expr,n)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
    static boolean check (char[] expr, int n) {
        //base case
        if (n == 0) {
            return true;
        }
        if(n==1) {
            return false;
        }
        if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']') {
            return  false;
        }
        //Search closing bracket for first opening brackets
        char closing = findClosing(expr[0]);
        //Count is used to handle cases  like "((()))", we basically need to Consider matching closing bracket.
        int i , count=0;
        for (i=1;i<n;i++) {
            if (expr[i] == expr[0]) {
                count++;
            }
            if (expr[i] == closing) {
                if (count == 0)
                    break;
                count--;


            }
        }
        // If closing Bracket was not
        if (i==n) {
            return false;
        }
        if (i==1) {
            return check(Arrays.copyOfRange(expr,i+1,n),n-2);
        }
        //If Closing Bracket was somewhere in middle
        //Check in the middle part and Check in the remaining part
        return  check(Arrays.copyOfRange(expr,1,i),i-1) &&  check(Arrays.copyOfRange(expr,(i+1),n),n-i-1);

    }
    static char findClosing(char ch) {
        if (ch == '(') return ')';
        if (ch == '{') return '}';
        if (ch == '[') return ']';
        return Character.MIN_VALUE;
     }

         */


        // Remove all Consecutive duplicates from the String. (Iterative Approach)
        /*

        String S = "aabccbannn";
        String ans = RemoveDuplicates(S);
        System.out.println(ans);
    }

    static String RemoveDuplicates(String S) {
        if (S.length() > 1) {
            StringBuilder str = new StringBuilder(new String());
            ArrayList<Character> Ans = new ArrayList<>();
            char ch = S.charAt(0);
            Ans.add(ch);
            for (int j = 1; j < S.length(); j++) {
                if (ch != S.charAt(j)) {
                    ch = S.charAt(j);
                    Ans.add(S.charAt(j));
                }
            }

            for (Character an : Ans) {
                str.append(an);
            }
            return str.toString();

        }
        return S;

        // Remove all Consecutive duplicates from the String. (Recursive Approach)


         */
        System.out.println("Enter a String");
        String S = sc.next();
        StringBuilder sb = new StringBuilder();
        String ans = Rec(S,0,sb);
        System.out.println(ans);
    }
    static String Rec(String S, int i, StringBuilder sb) {
        if (S.length()==1) return S;
        if (i == S.length()-1) {
            char ch = S.charAt(i);
            sb.append(ch);
            return sb.toString();
        }
        if (S.charAt(i) != S.charAt(i+1)) {
            sb.append(S.charAt(i));
            return Rec(S, ++i, sb);
        }
        return Rec(S,++i,sb);
    }

}