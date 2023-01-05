package mrkool.pakage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicsort {
    public static void main(String[] args) {
        /*
   int[] arr ={3,5,2,1,4};
   sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

         */
        //find missing number in range {0toN}
        /*
        int[] nums={3,0,1};
        sort(nums);
        int missing=find(nums);
        System.out.println(missing);

    }
    static int find(int[] nums){
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i){
                return i;
            }

        }
        return nums.length;
    }
    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
        static void swap(int[] nums,int first,int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
        }
*/
        //find all the numbers missing in the array range (1toN).
        /*
        int[] nums={1,1};
        sort(nums);
        List<Integer> numbers=missing(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(numbers);
    }
    static void sort(int[] nums){
        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    static List<Integer> missing(int[] nums){
        ArrayList<Integer> al=new ArrayList<>();
        int m=0;
        for (int j=0;j< nums.length;j++){
            if (j!=nums[j]-1){
                al.add(m,j+1);
                m++;
            }
        }
        return al;

         */
        //find duplicate number
        /*
        int[] nums = {3,1,3,4, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int find=sort(nums);
        System.out.println(find);

    }

    static int sort(int[] nums) {
        int i = 0;
        int missing=-1;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                missing=nums[i];
                i++;
            }
        }
        return missing;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    */

        //find duplicate numbers
        /*
        int[] nums = {4,3,2,7,7,2,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> numbers=find(nums);
        System.out.println(numbers);

    }

    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static List<Integer> find(int[] nums){
        ArrayList<Integer> al=new ArrayList<>();
        int j=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]!=i+1){
                al.add(nums[i]);
            }
        }
        return al;

         */
        //set Mismatch(find the number occured twice and the no. which is missing)
        /*
        int[] arr={1,2,2,4};
        sort(arr);
        int[] nums=find(arr);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int[] find(int[] arr){
        int[] ans=new int[2];
       for (int j=0;j<arr.length;j++){
           if (j!=arr[j]-1){
               ans[0]=arr[j];
               ans[1]=j+1;
           }
       }
       return ans;

         */

        //find the first missing positive no.
        int[] nums={1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int n=find(nums);
        System.out.println(n);
    }
    static void sort(int[] nums){
        int i=0;
        while(i< nums.length){
            int correct=nums[i]-1;
            if (nums[i]>0 && nums[i]<= nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    static int find(int[] nums){
        for (int j=0;j< nums.length;j++){
            if (j!=nums[j]-1){
                return j+1;
            }
        }
        return -1;
    }
}


