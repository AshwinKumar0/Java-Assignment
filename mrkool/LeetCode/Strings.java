package mrkool.pakage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder();
        //  char ch='a';
        /*
        String series= "";
        for(int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            series+=ch;
        }
        System.out.println(series);

         */


        //using stringbuilder
        /*
        for (int i=0;i<26;i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);

         */

//leetcode 1108 Defanging an IP Address
        /*
        String address = "1.1.1.1";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        System.out.println(sb);

         */

        //leetcode 1528 shuffling String
        /*
        int[] indices ={4,5,6,7,0,2,1,3};
        String s="codeleet";
       // System.out.println(s.charAt(0));
        char[] ans=new char[indices.length];
        for (int i=0;i< ans.length;i++){
            ans[indices[i]]=s.charAt(i);
        }
        String word=new String(ans);
        System.out.println(word);

         */
        //leetcode 1678. Goal Parser Interpretation
        /*
        String command="G()(al)";
        System.out.println(command.length());
        for(int i=0;i<command.length();i++){
            if (command.charAt(i)=='G'){
                sb.append("G");
            }
            else if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i++;
            }
            else {
                sb.append("al");
                i+=3;
            }

        }
        System.out.println(sb);

         */

        //leetcode 1773 count items Matching a rule
/*
        String[][] items = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"},
        };
        System.out.println("Enter the ruleKey");
        String ruleKey = sc.next();
        System.out.println("Enter the ruleValue");
        String ruleValue = sc.next();
        int count = Search(items, ruleKey, ruleValue);
        System.out.println(count);
    }

    static int Search(String[][] itmes, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("color")) {
            for (int i = 0; i < itmes.length; i++) {
                if (itmes[i][1].equals(ruleValue))
                    count++;
            }
        }
        if (ruleKey.equals("type")) {
            for (int i = 0; i < itmes.length; i++) {
                if (itmes[i][0].equals(ruleValue))
                    count++;
            }
        }
        if (ruleKey.equals("name")) {
            for (int i = 0; i < itmes.length; i++) {
                if (itmes[i][2].equals(ruleValue))
                    count++;
            }

        }
        return count;

         */
        //leetcode 1773 count items Matching a rule 2
        /*
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            items.add(new ArrayList<>());
        }
        for (int row = 0; row < items.size(); row++) {
            System.out.println("Input three values for each row");
            for (int col = 0; col < 3; col++) {
                items.get(row).add(col,sc.next());
            }
        }
        System.out.println(items);
        String ruleKey=sc.next();
        String ruleValue=sc.next();
        int ans=Search(items,ruleValue,ruleKey);
        System.out.println(ans);
    }
    static int Search(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue){
        int count=0;
       if (ruleKey.equals("type")){
           for (int i=0;i<items.size();i++){
               if (ruleValue.equals(items.get(i).get(0))){
                   count++;
               }
           }
       }
        if (ruleKey.equals("color")){
            for (int i=0;i<items.size();i++){
                if (ruleValue.equals(items.get(i).get(1))){
                    count++;
                }
            }
        }
        if (ruleKey.equals("name")){
            for (int i=0;i<items.size();i++){
                if (ruleValue.equals(items.get(i).get(2))){
                    count++;
                }
            }
        }
        return count;

         */
        // leetcode 1859. Sorting the Sentence
/*
        String s= "is2 sentence4 This1 a3";
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        int i=0;
        for (String elem : str){
           i= (elem.charAt(elem.length()-1)-'0');
           res[i-1]=elem.substring(0,elem.length()-1);
        }
        for (i=0;i< res.length-1;i++){
            sb.append(res[i]);
            sb.append(" ");
        }
        sb.append(res[res.length-1]);
        System.out.println(sb);

 */


        //leetcode 1662  Check If Two String Arrays are Equivalent
        /*
        String[] word1= {"ab","c"};
        String[] word2={"a","bc"};
        StringBuilder sb1=new StringBuilder();
        for (int i=0;i< word1.length;i++){
            sb.append(word1[i]);
        }
        for (int j=0;j< word2.length;j++){
            sb1.append(word2[j]);
        }
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb.toString().equals(sb1.toString()));


         */

        //leetcoed 709. to lower case
        /*
        String s="Hello";
        StringBuilder a=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=65 && s.charAt(i)<=90){
                a.append((char) (s.charAt(i)+32));
            }
            else {
                a.append(s.charAt(i));
            }
        }
        System.out.println(a);


         */
        //leetcode 1704.  Determine if String Halves Are Alike
        /*
         String s="textbook";
         int n=s.length()/2;
         StringBuilder a=new StringBuilder();
         StringBuilder b=new StringBuilder();
         for (int i=0;i<n;i++){
             a.append(s.charAt(i));
         }
        System.out.println(a);
         for (int j=n;j<s.length();j++){
             b.append(s.charAt(j));
         }
        System.out.println(b);
         int check1=count(a.toString());
        System.out.println(check1);
         int check2=count(b.toString());
        System.out.println(check2);
        System.out.println(check1==check2);

    }
    static int count(String a){
        int c=0;
        for (int i=0;i<a.length();i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'A' || a.charAt(i) == 'e' || a.charAt(i) == 'E' || a.charAt(i) == 'i' || a.charAt(i) == 'I' || a.charAt(i) == 'o' || a.charAt(i) == 'O' || a.charAt(i) == 'u' || a.charAt(i) == 'U')

            {
                c++;
            }
        }
        return c;

         */

        //1309. Decrypt String from Alphabet to Integer Mapping
        /*
        System.out.println("enter the string characters");
        String s=sc.next();
        String ans=freqAlphabets(s);
        System.out.println(ans);
    }
    static String freqAlphabets(String s){
        StringBuilder sb=new StringBuilder();//to build the answer string
        for(int i=s.length()-1;i>=0;i--){ //start traversing from right to left
            if (s.charAt(i)=='#'){ //if you found '#' then.
                int str=Integer.parseInt((s.substring(i-2,i))); // get that subString of two character before # and convert it to number.
                System.out.println(str);
                sb.append((char)(str+96)); //add that number with 96 because ascii value of a =97. since if we get str =1 then 96+1=97 that is 'a'.
                i-=2;
            }
            else{
                sb.append((char)(97+s.charAt(i)-'1'));// first we will subtract the ac
            }
        }
        return sb.reverse().toString();

         */


        //leetcode 1967. Number of Strings That Appear as Substrings in Word
/*
        String[] pattern = {"a","abc","bc","d"};
        String word="abc";
        int ans=numOfStrings(pattern,word);
        System.out.println(ans);
    }
    static int numOfStrings(String[] pattern,String word){
        int count=0;
        for (String st: pattern){
           if(word.contains(st)){
               count++;
           }
        }
        return count;

 */
        // leetcode 657. Robot Return to Origin
        /*
        System.out.println("enter moves in capital letters");
        String moves = sc.next();
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U')
                y++;
            if (ch == 'D')
                y--;
            if (ch == 'R')
                x++;
            if (ch == 'L')
                x--;
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;

         */

        //LEETCOE 557 Reverse Words in a String III.
/*
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String word = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            word += s.charAt(i);
        }
        String[] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i==0){
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();

 */
        //168. Excel Sheet Column Title

        int num=sc.nextInt();
        String res = "";
        while(num > 0) {
            num--;
           int rem=num%26;
            res = (char)('A' + rem) + res;
            num = num/26;
        }
        System.out.println(res);




        //171. Excel Sheet Column Number


        // leetcode 28. Implement strStr()
/*
        String haystack= "mississippi";
        String needle="issip";
        int ans=strStr(haystack,needle);
        System.out.println(ans);
    }
    static int strStr(String haystack,String needle){
        if(Objects.equals(needle, ""))
            return 0;
        if(needle.length() > haystack.length())
            return -1;

        for(int i=0 ; i<haystack.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j=0, k=i;
                while(k<haystack.length() && j<needle.length() && haystack.charAt(k) == needle.charAt(j)){
                    j++;
                    k++;
                }
                if(j == needle.length())
                    return i;

            }
        }
        return -1;

 */

        //leetcode 925. Long Pressed Name
        /*

        String name="saeed";
        String typed="ssaaedd";
        boolean ans=isLongpressedName(name,typed);
        System.out.println(ans);
    }
    static boolean isLongpressedName(String name,String typed){
       if (name.length()>typed.length())
           return false;
       int i=0,j=0;
       while (i<name.length() && j<typed.length()){
           if (name.charAt(i)==typed.charAt(j)){
               i++;
               j++;
           }
           else if (i>0 && name.charAt(i-1)==typed.charAt(j)){
               j++;
           }
           else {
               return false;
           }
       }
       while (j<typed.length()){
           if (typed.charAt(j)==name.charAt(i-1)){
               j++;
           }
           else {
               return false;
           }
       }
       return true;

         */

        // leetcode 125. Valid Palindrome
/*
        String s = "A man, a plan, a canal: Panama";
        String s1 = s.toLowerCase();
        final String s2 = s1.replaceAll("[^a-zA-Z0-9]", "");
        int m = s2.length() / 2;
        System.out.println(m);
        int left = 0;
        int right = s2.length() - 1;
        while (right >= m) {
            if (s2.charAt(left) == s2.charAt(right)) {
                left++;
                right--;
            } else {
                System.out.println(false);
            }
        }
        System.out.println(true);

 */


        // leetcode 680. Valid Palindrome II
/*
        String s = "abc";
        boolean ans=validpalindrome(s);
        System.out.println(ans);
    }
    static boolean validpalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return check(s,left+1,right) || check(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    static boolean check(String s,int left,int right){
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
           }
        return true;

 */

        // leetcode 14. Longest Common Prefix
        /*
        String[] strs= {"a","ac"};
        String ans=longestCommmonprefix(strs);
        System.out.println(ans);
    }
    static String longestCommmonprefix(String[] strs){
        //take first string to check
        String first=strs[0];
        //take default length of prefix as length of first string.
        int prefixlen=first.length();
        //iterate all string
        for (int i=1;i<strs.length;i++){
            //if the length of the string is smaller then default length then change the length to the smaller one.
            if (prefixlen> strs[i].length())
                prefixlen=strs[i].length();
            //examine the each character of that string and cut the length of the prefix length till the matched character.
            for (int j=0;j<prefixlen;j++) {
                if (first.charAt(j) != strs[i].charAt(j)) {
                    prefixlen = j;
                    break;
                }
            }
            if (prefixlen==0){
                return "";
            }
        }
        return first.substring(0,prefixlen);

         */

        //leetcode 1668. Maximum Repeating Substring
        /*
        String sequence="ababc";
        String word="ab";
        int ans =maxRepeating(sequence,word);
        System.out.println(ans);
    }
    static int maxRepeating(String sequence,String word){

        int count=0;
        int idx=0;
        int max=0;

        for(int i=0;i<=sequence.length()-word.length();i++){
            count=0; idx=0;
            for(int j=i;j<sequence.length();j++){

                if(sequence.charAt(j)==word.charAt(idx)){
                    idx++;

                }
                else break;
                if(idx==word.length()){
                    idx=0;
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;

         */
        //1784. Check if Binary String Has at Most One Segment of Ones
        /*
        String s ="00011";
        boolean ans=checkOnesSegment(s);
        System.out.println(ans);
    }
    static boolean checkOnesSegment(String s){

        if (s.length()==1){
            return true;
        }
        else {
            for (int i=0;i<s.length()-1;i++){
                if (s.charAt(i)=='0' && s.charAt(i+1)=='1') {
                    return false;
                }
            }
        }
        return true;

         */

        //1768. Merge Strings Alternately
        /*
        System.out.println("enter first word");
        String word1 = sc.next();
        System.out.println("enter second word");
        String word2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            System.out.println(sb.toString());
        }

         */

        //2000. Reverse Prefix of Word.
/*
        String word="xyxzxe";
        char[] word1=word.toCharArray();
        char ch ='z';

        for (int i=0;i<word1.length;i++){
            if (word1[i]==ch){
                int j=0;
                while(i>j) {
                    swap1(word1, i, j);
                    j++;
                    i--;
                }
                break;
            }
        }
        StringBuilder sb= new StringBuilder();
        for (char c : word1) {
            sb.append(c);
        }
        System.out.println(sb.toString());


    }
    static void swap1(char[] word1,int a,int b){
        char temp=word1[a];
        word1[a]=word1[b];
        word1[b]=temp;

 */

        //58. Length of Last Word
        /*
        String s= "   fly me   to   the moon  ";
     //   String[] result=s.split(" ");
        //System.out.println(Arrays.toString(result));
        int ans=lengthOfLastWord(s);
        System.out.println(ans);
    }
    static int lengthOfLastWord(String s){
        int len = 0;
        for( int i= s.length() -1; i>= 0; i--) {
            if(s.charAt(i) == ' ') {
                if(len!= 0)
                    return len;
            } else {
                len++;
            }
        }
        return len;

         */
    }
}


