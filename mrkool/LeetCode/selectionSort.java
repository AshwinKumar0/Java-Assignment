package mrkool.pakage;

public class selectionSort {
    public static void main(String[] args) {
    }
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
