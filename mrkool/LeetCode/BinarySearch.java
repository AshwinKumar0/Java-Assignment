package mrkool.pakage;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        int[] arr = {1, 2, 3, 5, 7, 8, 9};
        int target=in.nextInt();
        int ans = Search(arr ,target);
        System.out.println(ans);
    }
    static int Search(int[] arr ,int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;

 */


        //******check array is sorted in ascending or descending order and find the target no. position**********2
        //OrderAgnosticBinarySearch
        /*
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {//descending order
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
        }
        if (arr[start] < arr[end]) {//ascending order
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;

         */
        /*
        int[] arr={1,2,3,4,5,7,8,99,876};
        System.out.println("enter target");
        int target=in.nextInt();
        int ans=0;
        System.out.println("what do want to know floor value or cell value");
        String an=in.nextLine();
        if(Objects.equals(an, "floor")){
         ans=search1(arr,target);
    }
        else if (Objects.equals(an, "cell")){
             ans=search(arr,target);
        }
        else {
            System.out.println("invalid input");
        }

    static int search(int[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        int celling =start;

        //celling value of the target.
        return celling;


    static int search1(char[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        int floor =end;

        //floor value of the target.
        return floor;

         */

        //next alphabet
/*
        char[] letters={'c','f','j'};
        //System.out.println("enter target");
        char target='f';
        char ans=search(letters,target);
        System.out.println(ans);
    }
    public static char search(char[] letters, char target){
        int start=0;
        int end= letters.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];

 */

        //mountain array
/*
        int[] arr = {18,29,38,59,98,100,99,98,90};
        int ans=peak(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid>0 && mid < arr.length-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return arr[mid];
                }
                else if(arr[mid]>arr[mid-1]){
                    start=mid+1;
                }
                else if(arr[mid]>arr[mid+1]){
                    end=mid;
                }
            }
            else if (mid==0){
                if(arr[mid]>arr[mid+1]){
                    return arr[mid];
                }
            }

        }
        return arr[arr.length-1];

 */


        // minimum element in sorted rotated array

        System.out.println("enter the length of the array");
        int l= in.nextInt();
        System.out.println("enter "+l+" elements");
        int[]nums=new int[l];
        for (int i=0;i<l;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(" elements of array are ");
       // System.out.println(Arrays.toString(nums));
        int pivot =minimunelement(nums);
        System.out.println("minimum element of array is ");
        System.out.println(pivot);
    }
    static int minimunelement(int[] nums){
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<nums[hi]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return nums[hi];



        // search in Rotated array.
        /*
        int[] nums={4,5,6,7,0,1,2};
        int target=2;
        int pivot=smallestelement(nums);
        int region1=firsthalf(pivot,nums,target);
        if (region1!=-1){
            System.out.println(region1);
        }
        else {
            int region2=secondhalf(pivot,nums,target);
            if (region2!=-1){
                System.out.println(region2);
            }
            else {
                System.out.println(-1);
            }
        }
    }

    private static int secondhalf(int pivot, int[] nums, int target) {
        int lo=pivot;
        int hi=nums.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target>nums[mid]){
                lo=mid+1;
            } else if (target<nums[mid]) {
                hi=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    private static int firsthalf(int pivot, int[] nums, int target) {
        int lo=0;
        int hi=pivot-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target>nums[mid]){
                lo=mid+1;
            } else if (target<nums[mid]) {
                hi=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    private static int smallestelement(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<nums[hi]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return hi;

         */

        // search in nearly sorted array
        /*
        int[] nums={2,6,3,12,56,8};
        int target=3;
        int ans=Search(nums,target);
        System.out.println(ans);
    }
    static int Search(int[] nums,int target){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid>0 && mid< nums.length-1){
                if (target==nums[mid])
                    return mid;
               else if (target==nums[mid-1])
                    return mid-1;
                else if (target==nums[mid+1])
                    return mid+1;
                    else {
                        if (target>nums[mid])
                            start=mid+2;
                            else if (target<nums[mid])
                                end=mid-2;
                    }
                }
            else if (mid==0) {
                if (target==nums[mid])
                    return mid;
                else if (target==nums[mid+1])
                    return mid+1;

            }
            else if (mid== nums.length-1){
                if (target==nums[nums.length-1])
                    return nums.length-1;
                else if (target==nums[nums.length-2]) {
                    return nums.length-2;

                }
            }
        }
        return -1;

         */
        //floor value of the number.
        /*
        int[] nums={2,4,6,7,9,76,77};
        System.out.println("enter a number");
        int number=in.nextInt();
        int floor=search(nums,number);//floor of number means the greatest number smaller than that number.
        System.out.println(floor);


    }
    static int search(int[] nums,int number){
        int result=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==number){
                result=nums[mid];
                break;
            }
           else if (number>nums[mid]){
               if (nums[mid]>result){
               result=nums[mid];
               }
                start=mid+1;
            } else if (number<nums[mid]) {
                end=mid-1;
            }
        }
        return result;

         */

        //ceil value of the given number.
/*
        int[] nums={2,4,6,7,9,76,77};
        System.out.println("enter a number");
        int number=in.nextInt();
        int ceil=search(nums,number);//floor of number means the greatest number smaller than that number.
        System.out.println(ceil);


    }
    static int search(int[] nums,int number){
        int result=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==number){
                return nums[mid];
            }
            else if (number>nums[mid]){
                start=mid+1;
            } else if (number<nums[mid]) {
                if (nums[mid]<result) {
                    result = nums[mid];
                }
                end=mid-1;
            }
        }
        return result;

 */

        //find next alphabet with wrap around.
        /*
        char[] letters={'c','f','j'};
        char target='k';
        char ans=nextcharacter(letters,target);
        System.out.println(ans);
    }
    static char nextcharacter(char[] letters,char target){
        char result=letters[0];
        int start =0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]>target){
                result=letters[mid];
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return result;

         */

        //Search in infinite sorted array.
        /*

        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        int target=1;
        int ans = Search(arr, target);//this function will give me the location of the target element
        System.out.println(ans);
    }
    static int Search(int[] arr,int target){
       int start=0;
       int end=1;
       //start=0 and end=1 will be the first search space to find the target.
        //here we will check that the target element is smaller than search space end index element,
        // if yes then continue
        // if not then update the start and end index.
        // remember you need  to increase the length of search space exponentially
       while(target>arr[end]){
           int temp=end;
           end=end*2;
           start=temp;
       }
        return Search1(arr,target,start,end);//here we have modified search space to get the target in finite array.
        }
        static int Search1(int[] arr,int target,int start,int end){
        int lo=start;
        int hi=end;
        int result=-1;//if target is not found then return -1.
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (target>arr[mid])
                lo=mid+1;
            if (target<arr[mid])
                hi=mid-1;
            else {
                if (target==arr[mid]){//if target found.
                    result=mid;//store the current location of the target and then check is target also appeared before this location.
                    hi=mid-1;//now we have to go towards left side of the array
                    //by updating only end pointer of the array because we are finding the first appearence of the target
                }
            }
        }
        return result;//return the updated result.



         */

        //arranging coins leet code 441
        /*
        int n=8;
        int ans=stairs(n);
        System.out.println(ans);
        }
        static int stairs(int n){
            int start=0;
            int end=n/2;
            int mid=0;
            while(start<=end){
                 mid=start+(end-start)/2;
                int s=mid*(mid+1)/2;
                if(n>s)
                    start=mid+1;
                else if(s>n) {
                    end=mid-1;
                }
                else {
                    return mid;
                }
            }
            return -1;

         */

        // Search insert position
        /*
        int[] nums={1,2,4,5,6};
        int target=3;
        int ans=Search(nums,target);
        System.out.println(ans);
        }
        static int Search(int[] nums,int target) {
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target>nums[mid])
                    start=mid+1;
                else if(target<nums[mid])
                    end=mid-1;
                else{
                    if(target==nums[mid])
                        return mid;
                }
            }
            int next=end+1;

            return next;

         */
      //special array with x elements greater than or equal x.
        /*
        int[] nums={3,5};
        int ans=search(nums);
        System.out.println(ans);
    }
    static int search(int[] nums){

        for (int i=1;i<=nums.length;i++){
            int count =0;
            for (int num:nums){
                if(num>=i)
                    count++;
            }
            if (i==count)
                return i;
        }
        return -1;

         */
    }
}