package mrkool.pakage;

import java.util.*;

class binomial
{
    public static void main(String args[])
    {
        int row,col, space;
        int coef, n;
        coef = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();
        System.out.println("modified for b1a");

        for(row=0; row<n; row++)
        {
            for(space=1; space <= n-row; space++)
                System.out.print(" ") ;

            for(col=0; col <= row; col++)
            {
                if (col==0 || row==0)
                    coef = 1;
                else
                    coef = coef*(row-col+1)/col;

                System.out.print(coef + " ");
            }
            System.out.println();
        }
    }

}
