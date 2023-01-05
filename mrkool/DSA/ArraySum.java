package mrkool;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums;
        nums = new int[arr.length][arr[0].length];
        int c = 0;
        //rotate till match or break after 4 rotation.
        while (c<3){
             arr = rotate(arr);
            // boolean match = check(arr,nums);
            // if (match) break;
             //else {
                 c++;
            // }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    static int[][] rotate(int[][] arr) {
        int[][] nums = new int[arr.length][arr[0].length];
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                nums[j][arr.length-i-1] = arr[i][j];
            }
        }
        return nums;
    }
    static boolean check(int[][] arr, int[][] nums) {
        for (int i =0; i< arr.length; i++) {
            for (int j = 0; j< arr.length; j++) {
                if (arr[i][j] != nums[i][j]) return false;
            }
        }
        return true;
    }
}
