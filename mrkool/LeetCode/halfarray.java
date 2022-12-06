package mrkool.pakage;

import java.util.*;
public class halfarray
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,half,d=0,e;
        /** "n" will take the number pf elements you want to take in actual array
         "i" will be used for looping
         "half" will be used to calcualte the half of the lenght of array
         "d and e will be used as counter variables for 'array b' and 'array c'
         */
        System.out.println("enter the numbers of elements you want to enter (only even no.s)");
        n=sc.nextInt();
        half=n/2;
        if(n%2!=0)
            n=n+1;
        int a[]= new int[n]; //original array where we will take input and atlast give output
        int b[]= new int[n]; //this array will be used to store the first half value of the actual array
        int c[]= new int[n]; //this array will be used to store the Second half value of the actual array

        /** taking input of array elements*/
        System.out.println("Enter the elemnts of array :");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        /** storing first half to 'array b' and second half to 'array c'*/
        for(i=0;i<n;i++)
        {
            if(i<(n/2))
                b[i]=a[i];
            else
            { c[d]=a[i];
                d++; //here d will act as counter variable for storng the second half elements of actual array
            }
        }

        /** first half of array is displayed  */
        System.out.println("elemnts of first half array :");
        for(i=0;i<n/2;i++)
            System.out.println(b[i]);

        /** Second half of array is displayed */
        System.out.println("elemnts of second half array :");
        for(i=0;i<n/2;i++)
            System.out.println(c[i]);

        d=0;//making the value of d=0 so that we can use d as counter variable for "array b[]"
        e=0;//making the value of d=0 so that we can use d as counter variable for "array c[]"

        /** inserting the values of first half and second half alternately */
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                a[i]=b[d];
                d++;
            }
            else
            {
                a[i]=c[e];
                e++;
            }
        }
        /** displaying the final output of array after distribution */
        System.out.println("final output :");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
