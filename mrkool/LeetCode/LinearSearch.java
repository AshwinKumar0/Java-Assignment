package mrkool.pakage;

import java.util.Arrays;
import java.util.Scanner;


public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //*********search no. where it is located in array*************1

        /*
        int [] arr=new int[5];
        System.out.println("input five elements of integer array");
        for (int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the target value");
        int target= in.nextInt();
        LinearS(arr,target);
        int ans=LinearS(arr,target);
        System.out.println("the target value is located in index value "+ans+ " of array");
    }
    static int LinearS(int[] arr, int target){
        //if the array is empty then
        if(arr.length==0){
            return -1;
        }
        //for loop to check each and every index of the array
        for (int index =0;index<arr.length;index++){
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        // if element is not found in the array then
        return -1;

        */

        //*****search a character position  in string**********2
/*
        String name ="RITESH";
        char ch='I';
       // LinearSearch2(name,ch);
       // System.out.println(LinearSearch2(name,ch));
        Search2(name,ch);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search2(name,ch));


    }
    static boolean Search2(String str ,char ch){
        if(str.length()==0){
            return false;
        }
        for (char c:str.toCharArray()){
            if(c==ch){
                return true;
            }

        }
        return false;
    }

       static int LinearSearch2(String name, char ch) {
        if (name.length()==0){
            return -1;
        }
        for (int i=0;i<name.length();i++){
            if (ch==name.charAt(i)){
                return i;
            }
        }
        return -1;

 */
        //**********Search in range**********3
          /*
          int[] arr=new int[5];
        System.out.println("ENTER THE NUMBERS");
          for (int i=0;i< arr.length;i++){
              arr[i]= in.nextInt();
          }
        System.out.println("enter the target number");
          int target= in.nextInt();
        System.out.println("CHOOSE START POINT AND END POINT BETWEEN 0 TO 4");
        System.out.println("start from index no.");
          int start= in.nextInt();
        System.out.println("end at index no.");
         int end= in.nextInt();
         int ans=search(arr,target,start,end);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start ,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index=start;index<=end;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;

           */

        // **********search max or min no. in array***********4

        /*
         int[] arr =new int[5];
        System.out.println("enter five numbers");
         for (int i=0;i<arr.length;i++){
             arr[i]= in.nextInt();
         }
        // highest(arr);
         int max=big(arr);
        System.out.println("greatest no. is "+max);


    }
    static  int big(int[] arr){
        int max=arr[0];
        for (int j=0;j< arr.length;j++){
            if (max<arr[j]){
                max=arr[j];
            }

        }
        return max;

         */

        //********search for the number in 2d-array*********5
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}
        };
        System.out.println("enter target no.");
        int target = in.nextInt();
       int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
        static int[] search ( int[][] arr, int target){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        return new int[] {i,j};
                    }
                }
            }
            return new int[] {-1,-1};



 */

        //***********search max in 2d-array****************6
/*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}
        };
       // System.out.println("enter target no.");
       // int target = in.nextInt();
        int max = search(arr);
        System.out.println(max);
        }

    static int search(int[][] arr) {
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                   max=arr[i][j];
                }
            }
        }
        return max;


 */

        //************check how many elements have even digits in an array****************7
/*
        int[] arr=new int[5];
        System.out.println(" Enter five integer elements of array");
        for (int i=0;i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Elements of array are");
        System.out.println(Arrays.toString(arr));
        int n=evel(arr);
        System.out.println(n);
    }
     static int evel(int[] arr){
         int count=0;
         for (int num : arr) {
             digc(num);
            // System.out.println(digc(num));
             if (digc(num)) {
                 count++;
             }
         }
         return count;
     }
     static boolean digc(int num) {
        int count =0;
        //if the number is negative
       if(num<0){
            num=num*-1;
       }
        while (num>0){
            count++;
            num=num/10;
        }

         return count % 2 == 0;

 */

        //******calculate sum of each element in every row in 2D-array and find the max************
/*
        int[][] Accounts={
                {3,2,1},
                {1,2,3}
        };
        int max=0;
        for (int[] ints : Accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);

 */

        //
     }
}





