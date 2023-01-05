package mrkool.pakage;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //**********methods to print the max and min no. three numbers entered by the user.************1
/*
        System.out.println("ENTER THREE NUMBERS");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        System.out.println(a+" "+b+" "+c);
        int max=maximum(a,b,c);
        int min=minimum(a,b,c);
        System.out.println(max+" "+min);
    }

     static int minimum(int a, int b, int c) {
        int min =a;
        if(b<min){
            min=b;
        }
        if (c<min){
            min=c;
        }

        return min;
    }

    static int maximum(int a, int b, int c) {
        int max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        return max;

 */

        //*************create a method to find no. is even or odd****************2
        /*
        System.out.println("ENTER A NUMBER");
        int num=in.nextInt();
        String ans=check(num);
        System.out.println(ans);
    }

    static String check(int num){
        if (num%2==0){
            return "even";
        }
        return "odd";

         */

        //**********create a method to check vote eligibility***********3
  /*
        System.out.println("ENTER YOUR AGE");
        int age= in.nextInt();
        String ans=check(age);
        System.out.println(ans);
    }
    static String check(int age){
        if (age>=18){
            return "your are eligible to vote";
        }
        return "you are not eligible to vote";

   */
        //*******sum method*********4

        /*
        System.out.println("enter first number");
        int a= in.nextInt();
        System.out.println("enter second number");
        int b=in.nextInt();
        int sum=add(a,b);
        System.out.println(" Sum of numbers is "+sum);
    }
    static int add(int a,int b){
        return a+b;

         */

        //************** product of two numbers************5
/*
        System.out.println("enter first number");
        int a= in.nextInt();
        System.out.println("enter second number");
        int b=in.nextInt();
        int sum=add(a,b);
        System.out.println(" Sum of numbers is "+sum);
    }
    static int add(int a,int b){
        return a*b;

 */

        //create a method to find circumference and area of circle by taking radius from user***********6
 /*
        System.out.println("ENTER THE RADIUS OF CIRCLE");
        int r=in.nextInt();
        double a=area(r);
        double c=circumference(r);
        System.out.println("Area of circle is "+a+" and Circumference of circle is "+c);
    }
    static double area(int r){
        return 3.14*r*r;
    }
    static double circumference(int r){
        return 2*3.14*r;

  */
        //***********create a method to check prime no.***********7
        /*
        System.out.println("ENTER THE NUMBER");
        int n= in.nextInt();
        boolean ans=prime(n);
        if (ans){
            System.out.println(" prime ");
        }
        else {
            System.out.println("not prime ");
        }

    }
    static boolean prime(int n){
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;

         */

        //************Assign Grades According to marks***************8
 /*
        System.out.println("ENTER YOUR MARKS");
        int num= in.nextInt();
         String ans =Marks(num);
        System.out.println(ans);
    }
    static String Marks(int num){
        if (91<=num && num<=100){
            return "AA";
        }
        else if(num>=81 && num<=90){
            return "AB";
        }
        else if (num>=71 && num<=80){
            return "BB";
        }
        else if (num>=61 && num<=70){
            return "BC";
        }
        else if (num>=51 && num<60){
            return "CD";
        }
        else if (num>=41 && num<=50){
            return "DC";
        }
        else if (num<=40) {
            return "FAIL";
        }
        else {
            return "INVALID INPUT";
        }

  */

        //************factorial of a number**********9
            /*
        System.out.println("ENTER THE NUMBER TO KNOW IT'S FACTORIAL");
        int num= in.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
    }
    static int factorial(int num){
        int fac =1;
        for (int i=1;i<=num;i++){
            fac*=i;
        }
        return fac;

             */

        //***********Pythagorean triplet********10
/*
        System.out.println("input first number");
        int a=in.nextInt();
        System.out.println("input second number");
        int b=in.nextInt();
        System.out.println("input third number");
        int c=in.nextInt();
         boolean ans=pythagorean(a,b,c);
        System.out.println(ans);
    }
    static boolean pythagorean(int a, int b,int c){
        int a2=a*a;
        int b2=b*b;
        int c2=c*c;
        int sum=a2+b2;
        return sum == c2;

 */
        //*******find prime no.'s between two numbers**********11
        /*
        System.out.println("enter first number");
        int a= in.nextInt();
        System.out.println("enter second number");
        int b=in.nextInt();
         if(a>b){
             for (int i=b;i<=a;i++){
                 boolean ans=prime(i);
                 if (ans){
                     System.out.println(i);
                 }
             }
         }
         else {
             for (int i=a;i<=b;i++){
                 boolean ans=prime(i);
                 if (ans){
                     System.out.println(i);
                 }
             }
         }
    }
    static boolean prime(int n){
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;

         */

        //********** sum of first n natural numbers*********12

        int sum = 0;
        while (true) {
            System.out.println("enter non-zero number to continue");
            int num = in.nextInt();
            if (num > 0) {
                int total = add(num);
                sum=total+sum;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
    static int add(int num){
            int sum=0;
        return sum+num;
    }

    }

