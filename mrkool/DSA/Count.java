package mrkool;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,8,4,2};
        int[] answer_arr = new int[arr.length];
        right(arr, answer_arr);
        left(arr, answer_arr);
        System.out.println(Arrays.toString (answer_arr));

    }
    public static void right(int[] arr, int[] answer_arr) {
        for(int i=0; i<arr.length; i++) {
            int count=0;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]>=arr[i]) {
                    count++;
                }
            }
            answer_arr[i] = count;
        }
    }
    public static void left(int[] arr, int[] answer_arr) {
        int count=0;
        for(int i=arr.length-1; i>0; i--) {
            for(int j=arr.length-2; j>=0; j--) {
                if(arr[j]>=arr[j]) {
                    count++;
                }
            }
            answer_arr[i] += (count+1);
        }
    }
}
