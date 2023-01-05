package mrkool.pakage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arrays of primitives
       /* int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(Arrays.toString(arr));
        for (int i=0;i < arr.length;i++){
            //System.out.println("input numbers");
            arr[i]=sc.nextInt();
        }
       //for (int i=0;i< arr.length;i++){
          // System.out.print(arr[i]+" ");
        for (int num:arr) System.out.print(num+ " ");
        //arrays of objects
       /* String[] name=new String[6];
        for (int i=0;i < name.length;i++) {
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));*/
      /*  int[][] arr=new int[3][3];
        for (int row =0;row< arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                arr[row][col]= sc.nextInt();
            }
        }
       /* for (int row=0;row< arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/
       /* for (int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
       /* for(int[] num:arr){
            System.out.println(Arrays.toString(num));

        }*/

//

        /*
        int[][] arry = {
                {1, 2, 23},
                {4, 5,5},
                {7, 8, 9}
        };
        }

        for (int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                System.out.print(arry[row][col] + " ");
            }
            System.out.println();
        }

         */

        //
/*
        int[][] squarematrix={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int total = 0;
        int sum1 = 0;
        int sum2 = 0;
        int j = 0;
        int c=0;
        int s=0;
        int k = squarematrix.length - 1;
        for (int[] ints : squarematrix) {
            sum1 += ints[j];
            j++;
            sum2 += ints[k];
            k--;

        }
        if (squarematrix.length % 2 != 0) {
            if (squarematrix.length == 1) {
                total = squarematrix[0][0];
                System.out.println(total);
            } else {
                int middleelement = (squarematrix.length-1)/2;
                int m=squarematrix[middleelement][middleelement];
                total = sum1 + sum2 - m;
                System.out.println(total);
            }
        }

        else {
            total=sum1+sum2;
            System.out.println(total);
        }

 */

        //*******transpose matrix***********
/*
        int[][] matrix={{1,2},{4,5},{7,8}};
        int l=matrix.length;
        int l2=matrix[0].length;
            int[][] newmatrix=new int[l2][l];
            for (int i=0;i<l2;i++){
                for (int j=0;j<l;j++){
                    newmatrix[i][j]=matrix[j][i];
                }
            }
            System.out.println(Arrays.deepToString(newmatrix));

 */
        //
/*
            int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int [][] arr=new int[image.length][image.length];
        int l= image.length-1;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                arr[i][j]=image[i][l-j];
            }
        }
        for(int k=0;k<arr.length;k++){
            for(int m=0;m<arr.length;m++){
                if(arr[k][m]==0){
                    arr[k][m]=1;
                }
                else{
                    arr[k][m]=0;
                }
            }

 */

        //
        /*

        int[] arr = {2,7,4};
        int k = 181;
        int m=0;
        ArrayList<Integer> al = new ArrayList<>();
        int i = arr.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                 k=arr[i]+k;
                al.add(k%10);
                k=k/10;
                i--;
            }
            else if (k>0){
                al.add(k%10);
                k=k/10;
            }
        }
        System.out.println(al);

         */

        ///*
/*
        int[][] logs ={{1950,1961},{1960,1971},{1970,1981}};
        int[] year=new int[101];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                year[j-1950]++;
            }
        }
       // System.out.println(Arrays.toString(year));
        int max=0;
        int maxyear=1950;
        for(int i=0;i<year.length;i++){
            if(year[i]>max){
                max=year[i];
                maxyear=i+1950;
            }
        }
        System.out.println(maxyear);




 */
        //
        /*
        int[] nums={2,5,1,3,4,7};
        int n=nums.length/2;
        int[] ans=shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums,int n){
        int[] arr=new int[nums.length];
        int j=0;
        for (int i=0;i<n*2;i+=2) {
            arr[i] = nums[i-j];
            arr[i + 1] = nums[n+j];
            j++;
        }
        return arr;

         */

        //leetcode 209
        /*
        int[] arr = {1, 2, 3, 4, 5};
        int target = 11;
        int ans = minSizeSubArraySum(target, arr);
        System.out.println(ans);
    }

        static int minSizeSubArraySum(int target, int[] arr){
            int i = 0; int j = 0;

            int sumOfSubArray = 0;
            int minSizeSubArray = Integer.MAX_VALUE;

            while(j < arr.length){
                sumOfSubArray = sumOfSubArray + arr[j];

                //cond1: when sum of subarray is less than given target
                if(sumOfSubArray < target){
                    //then move ahead to get sum of subarray equal to target
                    j++;
                }
                //cond2: when sum of subarray is greater than or equal to given target
                else if(sumOfSubArray >= target){
                    //then update your answer
                    minSizeSubArray = Math.min(minSizeSubArray, j - i + 1);

                    //if sum of subarray is greater than given target, then reduce size of window by reducing left most element of window
                    while(sumOfSubArray > target){
                        sumOfSubArray = sumOfSubArray - arr[i];
                        i ++;

                        //also updating size of window, in case here sum would be equal to given target
                        minSizeSubArray = Math.min(minSizeSubArray, j - i + 1);
                    }

                    //here increase window size by increasing j to get target again
                    if (j<arr.length-1){
                        j++;
                    }
                }else{
                    break;
                }
            }
            //return min size of subarray
            if(minSizeSubArray == Integer.MAX_VALUE){
                return 0;
            }
            return minSizeSubArray;

         */

        //leetcode 66
/*
        int[] arr={9,8,7,6,5,4,3,2,1,0};
        int[] ans=plusone(arr);
        System.out.println(Arrays.toString(ans));
        }
        static int[] plusone(int[] arr) {
            int n = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 0) n = n * 10;
                n = n * 10 + arr[i];
            }
            long n1 = n + 1;
            System.out.println(n1);
            int number = (int) Math.log10(n1) + 1;
            int[] num = new int[number];
            for (int j = number - 1; j >= 0; j--) {
                num[j] = (int) (n1 % 10);
                n1 = n1 / 10;
            }
            return num;
        }
*/


        //approach2
/*

        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int numbers = digits.length;
        int temp = numbers - 1;
        double array_num = 0;
        int count = 0;
        while (count < digits.length) {
            array_num += digits[count] * Math.pow(10, temp);
            count++;
            temp--;
        }
        array_num += 1;
        numbers = (int) Math.log10(array_num) + 1;
        int[] ans = new int[numbers];
        for (int i = numbers - 1; i >= 0; i--) {
            ans[i] = (int)(array_num %10);
            array_num /= 10;
        }
        System.out.println(Arrays.toString(ans));


 */



    }
    }