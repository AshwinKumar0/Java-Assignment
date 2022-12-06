package mrkool.pakage;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int a=5;
        int b=7;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(~a);
        //left shift by 2
        System.out.println(a<<2);
        //right shift by 2
        System.out.println(b>>2);
        System.out.println("hello");
        System.out.println("******");



         */

        // LEETCODE 338. Counting Bits.
/*
        System.out.println(" Enter a number n ");
        int n=sc.nextInt();
        int[] ans=countBits(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] countBits(int n){
        int[] arr=new int[n+1];
        for (int i=0;i<=n;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    static int count(int i){
        int c=0;
        while (i>0){
            int lsb=i&1;
            if (lsb==1){
                c++;
            }
            i=i>>1;
        }
        return c;

 */

        // leetcode 401 binary watch

        /*
        System.out.println("Enter the value of n");
        // n is the no. of led's you want to switch
        int n= sc.nextInt();
        ArrayList<String> ans=ReadBinaryWatch(n);
        System.out.println(ans);
    }
    static ArrayList<String> ReadBinaryWatch(int n){
        ArrayList<String> al=new ArrayList<>();
        String str;
        for (int i=0;i<12;i++){
            for (int j=0;j<60;j++){
                if (Integer.bitCount(i)+Integer.bitCount(j)==n){
                    str=i+":"+((j<=9)?"0":"")+j;
                    al.add(str);

                }
            }
        }
        return al;


         */

        //leetcode 461. Hamming Distance
/*
        System.out.println("enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=hammingDistance(x,y);
        System.out.println(ans);
    }
    static int hammingDistance(int x,int y){
        int z=x^y;
        int count=0;
        for(int i=0;i<4;i++){
            int lsb=z&1;
            if (lsb==1){
                count++;
            }
            z=z>>1;
        }
        return count;

 */
        // leetcode 476. Number Complement
/*
        System.out.println("Enter an Integer");
        int num=sc.nextInt();
        int ans=findComplement(num);
        System.out.println(ans);
    }
    static int findComplement(int num){
        int index=0;
        int largestnum=0;
        while(largestnum<num){
            largestnum+=Math.pow(2,index);
            index++;
        }
        return largestnum^num;

 */

        //leetcode 645. Set Mismatch
        /*

       int[] arr ={2,2};
       int[] ans=new int[2];
       int[] freq=new int[arr.length];
       int xor=0;
       for (int i=0;i<arr.length;i++) {
           freq[arr[i] - 1]++;
           xor ^= (arr[i] ^ (i + 1));
           if (freq[arr[i] - 1] > 1) ans[0] = arr[i];
       }
       ans[1]=xor^ans[0];
        System.out.println(Arrays.toString(ans));

         */

        //leetcode 693. Binary Number with Alternating Bits

/*

        int n=10;
        boolean ans=hasAlternatingBits(n);
        System.out.println(ans);
    //method 1.
        /*
       static boolean hasAlternatingBits(int n){
        String bits=Integer.toBinaryString(n);
        for (int i=0;i<bits.length()-1;i++){
            if(bits.charAt(i)==bits.charAt(i+1)){
                return false;
            }
        }
        return true;

         */

        //method 2.bit manipulation



/*
    private static boolean hasAlternatingBits(int n) {
        int status=0;
        if (n>0){
            int c=n&1;
            if (c==0) {
            status=1;
            }
        }
        while(n>0){
            int ans=n&1;
            if (ans==status){
                return false;
            }
            else {
                status=ans;
            }
            n=n>>1;
        }
        return true;

 */

        //leetcode 762. Prime Number of Set Bits in Binary Representation
        /*

        int left = 6, right = 10;
        int num = primeNumberSetbit(left, right);
        System.out.println(num);
    }

    static int primeNumberSetbit(int left, int right) {
        int primes = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            int k=i;
            while (k > 0) {
                int ans = k & 1;
                if (ans == 1) {
                    count++;
                }
                k = k >> 1;
            }
            boolean check = isPrime(count);
            if (check) {
                primes++;
            }
        }
        return primes;

    }

    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

         */

        //leetcode 868. Binary Gap
        /*

        System.out.println("enter the no.");
        int n=sc.nextInt();
        System.out.println(binaryGap(n));
                                                         }
    static int binaryGap(int n){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<32;i++){
            int k=(n>>i)&1;
            if (k!=0){
                al.add(i);
            }
        }
        int ans=0;
        for (int j=0;j<al.size()-1;j++){
            ans=Math.max(ans,al.get(j+1)- al.get(j));

        }
        return ans;

         */

        //leetcode 1356. Sort Integers by The Number of 1 Bits
/*
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = SortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] SortByBits(int[] arr) {
        for ( int i =0 ;i< arr.length ;i++){
            arr[i] += Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);
        for ( int i =0 ;i< arr.length ;i++){
            arr[i] = arr[i] %10001;
        }
        return arr;

 */

        //leetcode 1684. Count the Number of Consistent Strings
        /*

        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        int count= countConsistentStrings(allowed,words);
        System.out.println(count);



    }
     static int countConsistentStrings(String allowed, String[] words) {
        int result=0;
        boolean[] alphabets = new boolean[26];
        for (char ch:allowed.toCharArray()){
            alphabets[ch-'a']=true;
    }
         for(String word:words){
             int lock=0;
             for (char ch:word.toCharArray()){
                 if (!alphabets[ch - 'a']){
                     lock=1;
                     break;
                 }
             }
             if (lock==0) result++;
         }
        return result;


         */

        // leetcode 1720. Decode XORed Array
        /*

        int[] encoded={1,2,3};
        int first=1;
        int[] ans=decode(encoded,first);
        System.out.println(Arrays.toString(ans));
}
static int[] decode(int[] encoded,int first){
        int l= encoded.length;
        int[] result=new int[l+1];
        result[0]=first;
        for (int i=0;i<l;i++){
            result[i+1]=result[i]^encoded[i];
        }
        return result;

         */

        //subsets of set
        /*

        int[] nums={1,2,3};
        ArrayList<ArrayList<Integer>> ans= subSets(nums);
        System.out.println(ans);
}

    private static ArrayList<ArrayList<Integer>> subSets(int[] nums) {

        ArrayList<ArrayList<Integer>> all=new ArrayList<>();
        int size = nums.length;
        int SubSets = (1<<size);
        for (int i=0;i<SubSets;i++){
            ArrayList<Integer> al=new ArrayList<>();
            for (int j=0;j<size;j++){
                int k=(1<<j);
                if ((k&i)!=0){
                    al.add(nums[j]);
                }
            }
            all.add(al);
        }
        return all;

         */
        //1763. Longest Nice Substring
        /*

        String s= "YazaAay";
        String ans=longestNiceSubstring(s);
        System.out.println(ans);

    }

    private static String longestNiceSubstring(String s) {
        StringBuilder sb;
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                if(CheckIt(sb.toString().toCharArray())){
                    if(sb.length()>max){
                        max=sb.length();
                        ans=sb.toString();
                    }
                }
            }
        }
        return ans;
    }
    static boolean CheckIt(char[] arr){
        int[] count = new int[128];
        for (char c : arr) {
            count[c]++;
        }
        for(int j=65;j<=90;j++){
            if(count[j]==0 && count[j+32]!=0) return false;
            if(count[j]!=0 && count[j+32]==0) return false;
        }
        return true;

         */

        //
    }

}



