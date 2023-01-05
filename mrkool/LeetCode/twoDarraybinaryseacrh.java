package mrkool.pakage;
import java.util.*;

public class twoDarraybinaryseacrh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sorted 2d matrix.
        /*
        int[][] arr={
                {10,20,30,40},
                {21,32,43,54},
                {33,44,55,66},
                {45,56,67,78}
        };
        System.out.println("Enter the target element");
        int target =sc.nextInt();
        int[] loc=search(arr, target);
        System.out.println(Arrays.toString(loc));
    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        int[] result={-1,-1};
        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {
                result[0] = row;
                result[1] = col;
                break;
            }
            else if (target>arr[row][col])
                row++;
            else {
                col--;
            }
        }
        return result;

         */

        //Strictly sorted 2d matrix.
        /*

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 1;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));
    }


    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        int[] result = {-1, -1};
        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }
        //run the loop till two rows are remaining.
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                result[0] = mid;
                result[1] = cMid;
                return result;
            } else if (arr[mid][cMid] > target)
                rEnd = mid;
            else if (arr[mid][cMid] < target)
                rStart = mid;
        }
        //now we have two rows.
        //check wheather the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            result[0] = rStart;
            result[1] = cMid;
            return result;
        }
        else if (arr[rStart + 1][cMid] == target) {
            result[0] = rStart + 1;
            result[1] = cMid;
        }
        //Search in 1st half
       else if (target <= arr[rStart][cMid - 1]) {
           return binarySearch(arr, 0, 0, cols - 1, target);
        }
        //Search in 2nd half
        else if (target >= arr[rStart][cMid + 1] && target < arr[rStart][cols - 1]) {
           return binarySearch(arr, 0, 0, cols - 1, target);
        }
        //Search in 3rd half
        else if (target <= arr[rStart + 1][cMid - 1]) {
           return binarySearch(arr, 0, 0, cols - 1, target);
        }
        //Search in 4th half
        else if (target >= arr[rStart + 1][cMid + 1] && target < arr[rStart + 1][cols - 1]) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }
        return result;
    }

    static int[] binarySearch(int[][] arr, int rows, int cStart, int cEnd, int target){
        int[] result={-1,-1};
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (target>arr[rows][mid])
                cStart=mid+1;
            else if (target<arr[rows][mid]) {
                cEnd=mid-1;
            }
            else{
                result[0]=rows;
                result[1]=mid;
            }
        }
        return result;

         */

//count NEGATIVE numbers in a Sorted matrix
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans=Search(grid);
        System.out.println(ans);
    }
    static int Search(int[][] grid){
        int row = 0;
        int col = grid[0].length-1;
        int ans = 0;
        while(row < grid.length && col>=0){
            if(grid[row][col] >= 0){
                row++;
            }
            else{
                col--;
                ans += grid.length - row;
            }
        }
        return ans;

    }
}
