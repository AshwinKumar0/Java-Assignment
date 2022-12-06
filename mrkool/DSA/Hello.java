package mrkool;
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        int[] arr = {-1,12,25,22,54};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr){
        int l = arr.length;
        for (int i=0; i<l-1; i++) {
            int min = i;
            for (int j=i+1; j<l; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
