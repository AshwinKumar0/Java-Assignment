package mrkool.stackQuestions;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter size of Window");
        int k = sc.nextInt();
        ArrayList<Integer> Ans = findMaxElements(Arr,k);
        Iterator<Integer> itr = Ans.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    static ArrayList<Integer> findMaxElements(int[] Arr , int k) {
        ArrayList<Integer> Al = new ArrayList<>();
        int start = 0;
        int end = (start+k) - 1;

        while (end != Arr.length) {
            int Max = Arr[start];
            for (int i = start+1; i <= end; i++) {
               if (Arr[i] > Max){
                   Max = Arr[i];
               }
            }
            Al.add(Max);
            start = start + 1;
            end = (start + k) - 1;
        }
        return Al;
    }
}
