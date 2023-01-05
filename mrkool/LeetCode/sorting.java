package mrkool.pakage;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args){

        int[]arr={5,4,3,2,1};
      //  bubble(arr);
        //selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1])
                    swapping(arr,j,j-1);
                else {
                    break;
                }
            }
        }
    }

  /*  static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
d        }

    }*/

        //selection sort


        static void selection(int[] arr){
            for (int i=0;i<arr.length;i++) {
                int last = arr.length - i - 1;
                int maxIndex=search(arr,last);
                swapping(arr,maxIndex,last);
            }
        }
        static int search(int[] arr,int last){
            int max=0;
            for (int j=1;j<=last;j++){
                if (arr[j]>arr[max])
                    max=j;
            }
            return max;
        }
        static void swapping(int[] arr,int maxIndex,int last){
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
        }

}

