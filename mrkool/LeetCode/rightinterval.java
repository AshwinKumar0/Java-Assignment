package mrkool.pakage;

import java.util.Arrays;

public class rightinterval {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{0,1},{3,4}};
        int[] ans=findrightinterval(intervals);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findrightinterval(int [][] intervals){
        int[] arr=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int index=-1;
            int ENDi=intervals[i][1];
            int ans=Integer.MAX_VALUE;
            int n=0;
            for(int j=0;j< intervals.length;j++) {
                if (i != j) {
                    int STARTj = intervals[j][0];
                    if (STARTj >= ENDi) {
                        n = STARTj;
                        if (n <= ans) {
                            ans = n;
                            index = j;
                        }
                    }
                }
                arr[i]=index;
            }
            arr[i]=index;
        }
        return arr;
    }
}
