package mrkool.pakage;
import java.util.*;
import static mrkool.pakage.matr.rotation;

public class PRACTICE2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //**********array from permutation*********1
        /*
        Scanner in=new Scanner(System.in);
        int[] num ={1,2,3,4,0};//zero-based permutation
       // System.out.println("enter the length of an array");
        int n=num.length;
        System.out.println(n);
        int[] arr = new int[n];
        for (int i=0;i< n;i++){
            arr[i]= num[num[i]];
        }
        System.out.println(Arrays.toString(arr));


         */


        //**********concatenation of arrays***********2

/*
        int[] nums={1,2,3};
        int n= nums.length;
        int[] ans=new int[2*n];
        for (int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));

 */

        //*******sum of 1-d array*********3
     /*
          int[] arr={1,2,3,4};
          int n=arr.length;
          int[] sum=new int[n];
          int uv=sum[0];
          for (int i=0;i<n;i++){
              sum[i]=arr[i]+uv;
              uv=sum[i];
          }
        System.out.println(Arrays.toString(sum));

      */

        //*******richest customer wealth**********3
          /*
        int[][] Rich={{1,2,3},{3,2,1}};
        int[] R= new int[Rich.length];
        int max=R[0];
         for (int i=0;i<Rich.length;i++){
             for (int j=0;j<Rich[i].length;j++) {
                 R[i]+= Rich[i][j];
             }
             }
        for (int j : R) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

           */

        //**********shuffle the Array***************4
        /*
        int[]arr={1,2,3,4,5,6};
        int n=arr.length/2;
        int j=0;//counter variable.
        int[] result=new int[arr.length];//length of new array =old array.
        for (int i = 0;i<arr.length;i+=2){//increase by two because we are filling two indexes at once.
            result[i]=arr[i-j];//i-j gives next index of first half.
            result[i+1]=arr[j+n];//j+n gives next index of second half.
            j++;

        }
        System.out.println(Arrays.toString(result));

         */


        //************Number of Good Pairs**********5
        /*
        int[] nums={1,2,3,1,1,3};
          int ans=pairs(nums);
        System.out.println(ans);
         }

    private
    static int pairs(int[] nums) {
        int count=0;
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length;i++){
                if(i<j){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
            }
        }
        return count;

         */

        //***********How Many Numbers Are Smaller Than the Current Number*********6
        /*
        int [] nums={8,1,2,2,3};
        int[] ans=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;

         */

        //*************Create Target Array in the Given Order*********7
/*
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] ans=target(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] target(int[] nums, int[] index) {
        int[]target=new int[index.length];//create an array of length equal to index array
        ArrayList<Integer> arr=new ArrayList<>();//create an arraylist to store all the elements of nums array into the particular index
        for(int i=0;i< nums.length;i++){
            arr.add(index[i],nums[i]);//store at ith index
        }
        for (int j=0;j<arr.size();j++){
            target[j]=arr.get(j);//copy all the elements from arraylist to target array
        }
        return target;//return target array

*/



        //
/*
       // String alpha = "thequickbrownfoxjumpsoverthelazydog";
        String alpha="leetcode";
        boolean str = senctence(alpha);
        if (str) {
            System.out.println(" this is pangram sentence");
        } else {
            System.out.println("this is not pangram sentence");
        }
    }

    private static boolean senctence(String alpha) {
        boolean[] arr = new boolean[26];
        int n = 0;
        for (int i = 0; i < alpha.length(); i++) {
            if (alpha.charAt(i) >= 'a' && alpha.charAt(i) <= 'z') {
                n = alpha.charAt(i) - 'a';
                arr[n] = true;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==false) {
                return false;
            }
        }
        return true;

 */
        //

        //
/*
        ArrayList<ArrayList<Integer>> arl=new ArrayList<>();
        for (int i=0;i<2;i++){
            arl.add(new ArrayList<>());
        }
        for (int row=0;row<2;row++){
            System.out.println("Input three values for row "+row);
            for (int col=0;col<3;col++){
                arl.get(row).add(in.nextInt());
            }
        }
        System.out.println(arl);
        int rulekey = arl.get(0).get(1);
        int rulevalue=3;
        //check whether any of the particular index contain specific  value or not.
        //create a function for checking this.
        //pass the whole arraylist in a function and the index value,element in the index.
        int n=check(arl,rulekey,rulevalue);
        System.out.println(n);

    }
    static int check(ArrayList<ArrayList<Integer>> arl, int rulekey, int rulevalue){
        int c=0;
        for (int row=0;row<arl.size();row++){
            for (int col=0;col<arl.get(row).size();col++){
            if (rulekey==arl.get(row).get(col)){
                if (rulevalue.equals(arl)){
            }
        }
            for(int i=0;i< arl.size();i++){
            int k=arl.get(i).size();
            for (int j=0;j<k;j++){
                int n=arl.get(i).get(j);
                if (n==rulevalue){
                    c++;
                }
            }
        }


        return c;

 */



        //
/*
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] newimage = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(newimage));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] newimage = new int[n][n];
        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = 0; j <n; j++) {
                newimage[i][n - c] = image[i][j];
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if(newimage[i][j]==0){
                    newimage[i][j]+=1;
                }
                else {
                    newimage[i][j]-=1;
                }
            }
        }
        return newimage;

 */


        //******leetcode 1252******
        /*

        int[][] indices = {{0, 1}, {1, 1}};
        int m = 2;
        int n = 3;
        int cells = oddcells(m, n, indices);
        System.out.println(cells);


    }


    static int oddcells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int c=0;
        for (int k=0;k<m;k++){
            matrix[indices[k][0]][k]++;
        }
        for (int i=0;i<n;i++){
            matrix[i][indices[0][i]]++;
        }

        for (int j=0;j< matrix.length;j++){
            for (int i=0;i<matrix[j].length;i++){
                if (matrix[j][i]%2!=0){
                    c++;
                }
            }
        }
        return c;

         */
//
        /*
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int a = 0,b=0;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==j){
                    continue;
                }
                else {
                    if (arr[i]+arr[j]==target){
                        a=i;
                        b=j;
                    }
                }
            }
        }
        System.out.println(a+" "+b);

         */
//
        /*
        int n=5;
        int[] arr = new int[n];
        if(n%2!=0){
            for(int i = 0; i<n-1; i+=2){
                arr[i+1] = i+1;
                arr[i] = -(i+1);
            }
            arr[n-1] = 0;
        } else {
            for(int i = 0; i<n-1; i+=2){
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
        }
        System.out.println(Arrays.toString(arr));


         */
//           lucky number in matrix
        /*
        int[][] matrix = {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};
        ArrayList<Integer> minrow = new ArrayList<>();
        ArrayList<Integer> maxcol = new ArrayList<>();
        ArrayList<Integer> luckynumbers=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minrow.add(min);
        }
        System.out.println(minrow);
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maxcol.add(max);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==maxcol.get(j) && matrix[i][j]== minrow.get(i)){
                   int lucky=matrix[i][j];
                    luckynumbers.add(lucky);
                }
            }
        }
        System.out.println(maxcol);
        System.out.println(luckynumbers);

         */

        //
        /*

        int [] nums={1,1,2};
        int[] temp=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                temp[j]=nums[i];
                j++;
                k++;
            }
        }
        temp[j]=nums[nums.length-1];
       // k++;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums));
        System.out.println(k+1);


         */


        //
        /*
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> al=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int right=n-1;
        int left=0;
        int down=m-1;
        while(top<=down && left<=right) {
            for (int i = top; i <=right; i++) {
                al.add(matrix[top][i]);
            }
            top++;
            for (int j = top; j <=down; j++) {
                al.add(matrix[j][right]);
            }
            right--;
            if(top<=down) {
                for (int k = right; k >= left; k--) {
                    al.add(matrix[down][k]);
                }
                down--;
            }
            if (left<=right) {
                for (int l = down; l >= top; l--) {
                    al.add(matrix[l][left]);
                }
                left++;
            }
        }

        System.out.println(al);

         */

        //spiral matrix 2
        /*
        int n = 3;
        int[][] mat = new int[n][n];
        int top = 0;
        int right = mat[0].length - 1;
        int down = mat.length-1;
        int left = 0;
        int number = 1;
        while (number<=n*n) {

            for (int i = top; i <= right; i++) {
                mat[top][i] = number;
                number++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                mat[i][right] = number;
                number++;
            }
            right--;
            if (down >= top) {
                for (int i = right; i >= left; i--) {
                    mat[down][i] = number;
                    number++;
                }
            }
            down--;
            if (right >= left) {
                for (int i = down; i >= top; i--) {
                    mat[i][left] = number;
                    number++;
                }
            }
            left++;

        }
        System.out.println(Arrays.deepToString(mat));

         */

        // maximum subarray with O(n2)
        /*
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentsum = 0;
            for (int j = i; j < nums.length; j++) {
                currentsum += nums[j];
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println(maxsum);

         */

        //maximum subarray with O(n).
/*
        int[] nums = {1,1,-2};

                if (sum > maxsum) {
                    maxsum = sum;
                }
            }


        return maxsum;

 */

        //set matrix zeroes
        /*

        int[][] matrix={{1},{0}};//{{0,1,2,0},{3,4,5,2},{1,3,1,5}};//{{1,1,1},{1,0,1},{1,1,1}};
        ArrayList<Integer> rl=new ArrayList<>();
        ArrayList<Integer> cl=new ArrayList<>();
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    cl.add(j);
                    rl.add(i);
                }
            }
        }
        System.out.println(cl+ " "+rl);
        for (int i=0;i< rl.size();i++){
            int r=rl.get(i);
            for (int j=0;j<matrix[0].length;j++){
                matrix[r][j]=0;
            }
        }
        for (int i=0;i< cl.size();i++){
            int c=cl.get(i);
            for (int j=0;j<matrix.length;j++){
                matrix[j][c]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));


         */

        //product of all elements of array expect self.
/*
        int[] arr={1,2,3,4};
        int[] ans= new int[arr.length];
        for (int count=0;count< arr.length;count++ ) {
            int product=1;
            for (int i = 0; i < arr.length; i++) {
                if (i != count) {
                    product *= arr[i];
                    ans[count] = product;
                }
            }
        }
        System.out.printf(Arrays.toString(ans));

 */
        //find the first and the last position of element in sorted array.
        /*

        int[] nums = {5, 7, 8, 8, 8, 10,11};
        int target = 8;
        int[] ans = {-1,-1};
        int first=0;
        int last=1;
        ans[0] = Search1(nums, target,first);
        if (ans[0]!=-1){
            ans[1]=Search1(nums,target,last);
        }

        System.out.println(Arrays.toString(ans));


    }

    static int Search1(int[] arr, int target ,int check) {
       // int chec=check;
        int ans=-1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if (check==0){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }

        }
        return ans;

         */
//jump game
        /*
        int[] nums = {1};
        boolean ans = check(nums);
        System.out.println(ans);
    }

    static boolean check(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0 || nums[0]==1) {
                return true;
            }
            else {
                return false;
            }
        } else {
            int l = nums.length - 1;
            for (int i = 0; i < l; i++) {
                int n = l - i;
                if (nums[i] == n) {
                    return true;
                }
            }
        }
        return false;
        //wrong answer code incomplete
         */

        //rotation of array


         //shivam's code.
        /*
        System.out.println("Enter the number of elements you want in the array :");
        int numbers = sc.nextInt();
        System.out.println();
        System.out.println();
        int i,x,y,counter,shift,left;
        counter=0;
        int a[] = new int[numbers];
        System.out.println("Enter the elements in array :");
        for(i=0;i<numbers ;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements shift you want:");
        shift = sc.nextInt();
        int b[] = new int[shift];
        if(shift>numbers)
            shift =shift%numbers ;

        for(i=0;i<shift ;i++)
        {
            b[i]=a[i];
        }
        left = numbers-shift;
        for(i=0;i<numbers;i++)
        {
            if(i>=left)
            {
                a[i]=b[counter];
                counter++;
            }
            else
                a[i]=a[i+shift];
        }
        System.out.println("AFTER cyclicing :");
        for(i=0;i<numbers;i++)
            System.out.println(a[i]);

         */



        //my code.
        /*

        int[] nums={-1};
        int k=2;
        rotation(nums,k);

    }
    static void rotation(int[] nums,int k){
        int l= nums.length;
            int n = 0;
            if (k > nums.length) {
                n = k % l;
            } else {
                    n = k;
                }
                int[] firsthalf = new int[n];
                int n1 = nums.length - n;
                int[] secondhalf = new int[n1];
                int c = 0;
                for (int i = n1; i < nums.length; i++) {
                    firsthalf[c] = nums[i];
                    c++;
                }

                for (int j = 0; j < n1; j++) {
                    secondhalf[j] = nums[j];
                }
                for (int i = 0; i < n; i++) {
                    nums[i] = firsthalf[i];
                }
                int d = 0;
                for (int j = n; j < nums.length; j++) {
                    nums[j] = secondhalf[d];
                    d++;
                }
                System.out.println(Arrays.toString(nums));
            }

         */


        //house robber
/*
        int[] nums={2,7,9,3,1};
        int amount=robbbery(nums);
        System.out.println(amount);
    }


         static int robbbery(int[] nums) {
             int l= nums.length;
             int sum1=0;
             int sum2=0;
             if (l<=1){
                 return nums[0];
             }
             if (l==2){
                 if(nums[0]>nums[1]){
                     return nums[0];
                 }
                 else {
                     return nums[1];
                 }
             }
             else {
                 for (int i=0; i<l ;i++)
                 if (i%2==0)
                 sum1 += nums[i];
                  else
                 sum2 += nums[i];
             }
             return  Math.max(sum1,sum2);
             */
    }
}