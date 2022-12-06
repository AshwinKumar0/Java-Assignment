package mrkool.pakage;

import javax.swing.*;
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pattern 1.
        /*

1.  *****
    *****
    *****
    *****
    *****

         */
        /*
        System.out.println("enter row length");
        int n= sc.nextInt();
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //pattern 2.

        /*

2.  *
    **
    ***
    ****
    *****
         */
/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        for (int row=0;row<=n;row++){
            for (int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
            }


 */


        //pattern 3.

        /*
        3.  *****
            ****
            ***
            **
            *

         */
/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

 */
        // pattern 4.

        /*
        4.  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

 */
        // pattern 5.

        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */

/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        int tcol=0;
        for (int row=1;row<=2*n;row++) {
            if (row >= n) {
                tcol= 2*n-row;
                for (int col = 1; col <= tcol; col++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                tcol=row;
                for (int col = 1; col <= tcol; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

 */

        // pattern 6

        /*
         *
         **
         ***
         ****
         *****

         */
/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        int s=n-1;
        for (int row=0;row<n;row++){
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            for (int j=0;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
            s--;
        }

 */


        // pattern 7.

        /*
         *****
         ****
         ***
         **
         *

         */
/*
        System.out.println("enter row length");
        int n= sc.nextInt();
        int s=0;
        for (int row=0;row<n;row++){
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            for (int j=row;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
            s++;
        }

 */

        //pattern 8.

        /*

         *
         ***
         *****
         *******
         *********

         */

        /*
        System.out.println("enter row length");
        int n=sc.nextInt();
        for (int row=0;row<n;row++){
            int s=(n-1)-row;
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            int tcol=row*2+1;
            for (int col=0;col<tcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        // pattern 9.

        /*
         *********
         *******
         *****
         ***
         *

         */
/*
        System.out.println(" enter the length of row ");
        int n=sc.nextInt();
        int s=0;
        int m=n-1;
        for (int row=0;row<n;row++){
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            int tcol=n+m;
            for (int col=0;col<tcol;col++){
                System.out.print("*");
            }
            System.out.println();
            s++;
            m-=2;
        }

 */
        // pattern 10

        /*
         *
         * *
         * * *
         * * * *
         * * * * *

         */
/*
        System.out.println("enter the row length");
        int n=sc.nextInt();
        int s=n-1;
        for (int row=1;row<=n;row++){
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            for (int col=0;col<row;col++){
                System.out.print("*" + " ");
            }
            System.out.println();
            s--;
        }

 */

        // pattern 11.

        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         */

        /*
        System.out.println("enter the length");
        int n=sc.nextInt();
        int s=0;
        for (int row=0;row<n;row++){
            for (int i=0;i<s;i++){
                System.out.print(" ");
            }
            for (int col=row;col<n;col++){
                System.out.print("*" + " ");
            }
            System.out.println();
            s++;
        }

         */

        // pattern 12.

        /*

         * * * * *
         * * * *
         * * *
         * *
         *
         *
         * *
         * * *
         * * * *
         * * * * *

         */
/*
        System.out.println("enter the length of the row");
        int n=sc.nextInt();
        int s=0;
        for (int row=0;row<2*n;row++) {
            if (row < n) {
                for (int i = 0; i < row; i++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < n-row; col++) {
                    System.out.print("*" + " ");
                }
            }

            else {
                for (int i = row-n; i < n-1; i++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < row-n+1; col++) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();

        }

 */


        // pattern 13.

        /*

         *
         * *
         *   *
         *     *
         *********


         */
/*
        System.out.println("enter the row length");
        int n=sc.nextInt();
        for (int row=1;row<=n;row++) {
            for (int col = row; col<n; col++) {
                System.out.print(" ");
            }
            for (int col1=1;col1<2*row;col1++){
                if (row==n || col1==1 || col1==2*row-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }



 */
        // pattern 14.


        /*


14.  *********
      *     *
       *   *
        * *
         *


         */

/*
        System.out.println("enter the row length");
        int n=sc.nextInt();
        for (int row=n;row>=1;row--) {
            for (int col = n; col>row; col--) {
                System.out.print(" ");
            }
            for (int col1=1;col1<2*n;col1++){
                if (row==n || col1==1 || col1==2*row-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

 */



        // pattern 15.

        /*

         *
         * *
         *   *
         *     *
         *       *
         *     *
         *   *
         * *
         *

         */
/*
        System.out.println("enter the length of row");
        int n=sc.nextInt();
        for (int row=1;row<n;row++){
                for (int col=row;col<n;col++){
                    System.out.print(" ");
                }
                for (int col1=1;col1<2*n;col1++){
                    if (col1==1 || col1==2*row-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
        for (int row=n;row>=1;row--){
            for (int col=n;col>row;col--){
                System.out.print(" ");
            }
            for (int col1=1;col1<2*n;col1++){
                if (col1==1 || col1==2*row-1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

 */

        // pattern 16.

        /*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


         */

        /*

        System.out.println(" enter the no. of rows ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(nCr(row, col) + " ");
            }
            System.out.println();
        }
    }

    static int nCr(int row, int col) {
        return factorial(row) / (factorial(col) * factorial(row - col));
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = n; i >1; i--) {
            f *= i;
        }
        return f;


         */

        // pattern 17.

        /*

         1
        212
       32123
      4321234
       32123
        212
         1


         */

         /*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        for (int row=1;row<2*n;row++){
            int space = row>n ? row-n :n-row;
            for (int i=1;i<=space;i++){
                System.out.print(" ");
            }
            int col=row>n?2*n-row:row;
                for (int j = col; j >=1;j--) {
                    System.out.print(j);
                }
                for (int k=2;k<=col;k++){
                    System.out.print(k);
                }


            System.out.println();


        }

          */

        // pattern 18.

        /*

         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********


         */
/*
        System.out.println("enter the total no. row");
        int n=sc.nextInt();
        int l=n+1;
        int q=1;
        for (int row=1;row<=2*n;row++){
            for (int col=1;col<=2*n;col++) {
                int k=row<=n?l-row:row-n;
                int t=row<=n?n+row:(row+n)-q;
                if (col<=k || col>=t){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if (row>n){
                q+=2;
            }
            System.out.println();
        }

 */



        // pattern 19.

        /*

         *        *
         **      **
         ***    ***
         ****  ****
         **********
         ****  ****
         ***    ***
         **      **
         *        *

         */

/*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        int r=2;
        int l=0;
        for (int row=1;row<2*n;row++){
            int k= row<=n?row:row-r;
            int m= row<=n?2*n-l:row+1;
            for (int col=1;col<=2*n;col++){
                if (col<=k || col>=m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if (row>n){
                r+=2;
            }
            if (row<=n){
                l++;
            }
            System.out.println();
        }

 */


        // pattern 20.

        /*

         1234
         1  4
         1  4
         1  4
         1234

         */

        /*
        System.out.println("enter the no. rows");
        int n=sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=1;col<n;col++){
                if (row==1 || row==n || col==1 || col==n-1){
                    System.out.print(col);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


         */

        // pattern 21.

        /*

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

         */
/*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        int num=1;
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }

 */

        // pattern 22

        /*

        1
        0 1
        0 1 0
        1 0 1 0
        1 0 1 0 1

         */
        /*

        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        int[] v={0,1};
        int u=v[1];
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(u + " ");
                if (u==v[0]){
                    u=v[1];
                }
                else {
                    u=v[0];
                }
            }
            System.out.println();
        }

         */

        // Pattern 23

        /*

          *       *
         * *     * *
        *   *   *   *
       *     * *     *
      *       *       *

         */
/*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        int f=0;
        for (int row=1;row<=n;row++){
            for (int s=row;s<n;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=n*n;col++){
                 if (col==1 || col==2*row-1 || col==2*n-1|| col==2*row-1+8){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/

        //pattern 24.

        /*

         *        *
         **      **
         * *    * *
         *  *  *  *
         *   **   *
         *   **   *
         *  *  *  *
         * *    * *
         **      **
         *        *

         */
/*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        int i=0;
        for (int row=1;row<=2*n;row++){
            for (int col=1;col<=2*n;col++){
                if (col==1 || col==2*n || col==row || col==2*n-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
             System.out.println();
                i++;
            }



 */

        //pattern 25.

        /*

         */
/*
        System.out.println("enter the no. of rows");
        int n=sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=n;col++){
                if (col==1 || col==n|| row ==1 || row==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

 */
        ///
        /*

        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l=1; l<=n;l++){
                System.out.print(" ");
            }
            for (int c=1;c<=i;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int s=1;s<=n;s++){
                System.out.print(" ");
            }
            for (int s=1;s<=n;s++){
                System.out.print("*");
            }
            for (int s=1;s<=n;s++){
                System.out.print(" ");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++) {
        for (int s=1;s<i;s++){
            System.out.print(" ");
        }
        for (int k=n;k>=i;k--){
            System.out.print("*");
        }
            for (int l=1; l<=n;l++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print("*");
            }
            for (int s=1;s<i;s++){
                System.out.print(" ");
            }

        System.out.println();
        }

         */


    }
}

