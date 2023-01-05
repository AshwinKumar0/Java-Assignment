package mrkool.pakage;

import java.util.Arrays;

public class setMistmatch {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findErrorNums(int[] arr) {
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
        return find(arr);
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
    }

}
