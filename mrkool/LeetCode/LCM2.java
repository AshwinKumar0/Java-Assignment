package mrkool.pakage;
import java.util.*;

public class LCM2 {
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
    /*  static int n;

        static int LCM(int[] num)
        {
            int lcm=1;
            int d=2;
            while(true)
            {
                int c=0;
                boolean div= false;
                for(int i=0;i<n;i++)
                {
                    if(num[i]==0)
                        return 0;

                    else if(num[i]==1)
                        c=c+1;

                    if(num[i]%d==0)
                    {
                        num[i]=num[i]/d;
                        div=true;
                    }
                }
                if(div)
                    lcm=lcm*d;
                else
                    d++;

                if(c==n)
                    return lcm;
            }

        }
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int k;
            System.out.println("Enter the number of elements you want");
            n= sc.nextInt();
            int[] num = new int[n];
            System.out.println("Enter the numbers :");
            for(k=0;k<n;k++)
            {
                num[k]=sc.nextInt();
            }
            System.out.println("LCM of  numbers :"+LCM(num));

 */


        //

        //import java.util.Scanner;


        Scanner input = new Scanner(System.in);

                // get two numbers as input
                System.out.println("Enter two numbers:");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                // variable to store the lcm
                int lcm;

                // assign the maximum number to lcm
                lcm = Math.max(number1, number2);

                for (int i = lcm; i <= number1 * number2; ++i) {

                    if ((i % number1 == 0) && (i % number2 == 0)) {
                        System.out.println("LCM: " + i);
                        break;
                    }
                }
            }
        }



