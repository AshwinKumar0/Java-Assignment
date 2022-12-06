package mrkool.pakage;
import java.util.*;

//******factorial of a number*******#1

class PRACTICE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("enter the number");
        int num= in.nextInt();
        int fact=1;
        for (int i=num;i>1;i-- ){
            fact=fact*i;
        }
        System.out.println(fact);
    }*/

        //****ELECTRICITY BILL*******#2

        /* int month=30;//1 month = 30 days
        int day=24;//1 day = 24hours
        int price=5;
        System.out.println("enter no. of units ");
        int unit = in.nextInt();
        int ta=unit*5;
        System.out.println("total amount of money for "+unit+ " units = "+ta+"rupees");*/


        //********AVERAGE OF N NUMBERS*********#3

       /* int sum=0;
        int count=0;
        int average=0;
        while (true){
            System.out.println("enter a non-zero number to continue or zero to exit");
            int n = in.nextInt();
            if (n!=0) {
                sum = sum + n;
                count++;
            }
            else {
                break;
            }

        }
        average=sum/count;
        System.out.println("Average of the numbers is "+average);*/


        //**********DISCOUNT CALCULATOR************#4

       /* System.out.println("ENTER THE ORIGINAL AMOUNT");
        int OA= in.nextInt();
        System.out.println("ENTER DISCOUNT PERCENTAGE");
        int DP=in.nextInt();
        int DA=OA/100*DP;
        int FP= OA-DA;
        System.out.println("FINAL AMOUNT AFTER APPLYING DISCOUNT "+FP);*/


        //********CALCULATE DISTANCE B/T TWO POINTS***********5
           /*
        System.out.println("enter point x1");
        int x1= in.nextInt();
        System.out.println("enter point x2");
        int x2= in.nextInt();
        System.out.println("enter point y1");
        int y1= in.nextInt();
        System.out.println("enter point y2");
        int y2= in.nextInt();
        double dst= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between two points is "+dst);
                */

        //*********CALCULATE COMMISSION PERCENTAGE**************6
            /*
        System.out.println("ENTER THE PAYMENT AMOUNT");
        int PA= in.nextInt();
        System.out.println("ENTER COMMISSION PERCENTAGE");
        int CP=in.nextInt();
        int CA=PA/100*CP;
      //  int FP= OA-DA;
        System.out.println("COMMISSION AMOUNT "+CA);*/

        //******* POWER IN JAVA*********7
/*
        System.out.println("ENTER BASE NUMBER");
        int A= in.nextInt();
        System.out.println("ENTER POWER NUMBER");
        int B= in.nextInt();
        double c=Math.pow(A,B);
        System.out.println(A+" power "+B+" is "+c);

 */
        //********** batting average************7
        /*
        System.out.println("enter player name");
        String name = in.next();
        System.out.println("Total runs scored by "+name);
        int runs = in.nextInt();
        System.out.println("how many times "+name+" caught out ");
        int out = in.nextInt();
        int BA=runs/out;
        System.out.println("batting average of "+name+" is "+BA);

         */

        //******CALCULATE CGPA*********8
/*
        System.out.println("enter grade of maths");
        int maths= in.nextInt();
        System.out.println("enter grade of english");
        int eng= in.nextInt();
        System.out.println("enter grade of science");
        int science= in.nextInt();
        System.out.println("enter grade of social science");
        int sst= in.nextInt();
        System.out.println("enter grade of hindi");
        int hindi= in.nextInt();
        int cgpa=(maths+eng+science+sst+hindi)/5;
        System.out.println("YOUR CGPA IS "+cgpa);

 */

        //****COMPOUND INTEREST*********9
/*
        System.out.println("principal amount ");
        long amt= in.nextLong();
        System.out.println("rate of interest");
        float r= in.nextFloat();
        System.out.println("time in years");
        int t= in.nextInt();
        System.out.println("number of times interest is compounded per year");
        int n= in.nextInt();
        double amount=(Math.pow((1+(r/n)),n*t)*amt)-amt;
        System.out.println(amount);

 */
        //****sum of n numbers******10
/*
        int count=0;
        int sum=0;
        while (true){
            System.out.println("input non-zero to continue");
            int n= in.nextInt();
            if(n!=0){
                sum=sum+n;
                count++;
            }
            else {
                break;
            }

        }
        int avg=sum/count;
        System.out.println("sum"+sum);
        System.out.println("average"+avg);

 */

        //******ARMSTRONG NUMBER*****11
/*
        System.out.println("Enter three digit number");
        int n= in.nextInt();
        int original=n;
          int arm=0;
        for (int i =0;i<3;i++){
            int rem=n%10;
             arm=arm+rem*rem*rem;
            n=n/10;
        }
        if (original==arm){
            System.out.println("yes it is armstrong number");
        }
        else {
            System.out.println("it is not armstrong");
        }


 */

        //******Reverse of string********12
/*
        System.out.println("ENTER A WORD");
        String str= in.next();
        System.out.println(rev(str));

}
 static String rev(String str){
     String nstr = "";
     char ch ;
     int i = str.length() - 1;
     while (i >= 0) {
         ch=str.charAt(i);
         nstr=ch+nstr;
         i--;
     }
     return nstr;

 */

        //*********check number or a word is palindrome or not******************13
                   /*
        System.out.println("enter a number or word");
        int num= in.nextInt();
       // System.out.println(num);
        int p=palindrome(num);
        if(p==num){
            System.out.println(p);
            System.out.println("its is palindrome number");
        }

 }

     static int palindrome(int num) {
         int rev=0;
         //int n=num;
         while(num>0){
           int rem=num%10;
           rev=rev*10+rem;
           num=num/10;

         }
         return rev;

                    */

        //***********Future value**********14

        /*
        System.out.println("FOR SIMPLE INTEREST PRESS 'S' AND FOR COMPOUND INTEREST PRESS 'C' ");
        char ch = in.next().charAt(0);
        if (ch == 'S') {
            System.out.println("ENTER PRINCIPAL AMOUNT");
            int p = in.nextInt();
            System.out.println("ENTER RATE OF INTEREST");
            float r = in.nextFloat();
            System.out.println("ENTER THE PERIOD OF TIME");
            double t = in.nextDouble();
            double FV = p + (p * r * t);
            System.out.println(FV);

        } else if (ch == 'C') {
            System.out.println("ENTER PRINCIPAL AMOUNT");
            int p = in.nextInt();
            System.out.println("ENTER RATE OF INTEREST");
            float r = in.nextFloat();
            System.out.println("ENTER THE PERIOD OF TIME");
            double t = in.nextDouble();
            System.out.println("NUMBER OF TIMES COMPOUNDING PER YEAR");
            int n = in.nextInt();
            double FV = p * (1 + (r / n)) * (t / n);
            System.out.println(FV);
        }

         */

        //***********HCF OF TWO NUMBERS*********15
/*
        System.out.println("ENTER FIRST NUMBER");
        int a = in.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = in.nextInt();
        int cf = 0;
        int max = 0;
        //factors of a
        if (a > b) {
            for (int i = 1; i <= a; i++) {

                if (a % i == 0 && b % i == 0) {
                    cf = i;
                    if (cf > max) {
                        max = cf;
                    }
                }

            }
            System.out.println(max);
        }
        if (a < b) {
            for (int i = 1; i <= b; i++) {

                if (a % i == 0 && b % i == 0) {
                    cf = i;
                   if (cf > max) {
                    max = cf;
                   }
                }

            }
            System.out.println(max);
        }

 */
        //*********LCM OF two numbers**********16
/*
        System.out.println("enter first number");
        int a= in.nextInt();
        System.out.println("enter second number");
        int b= in.nextInt();
        int l=lcm(a,b);
        System.out.println("lcm of "+a+" "+b+" is "+l);
        */

        //**********Check the character is Vowel or Consonant**********17
        /*
        System.out.println("Enter Any one Alphabet character");
        char ch=in.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("it is Vowel");
        }
        else {
            System.out.println("it is Consonant");
        }

         */

        //**********perfect number**********
        //sum of factors of that number==number
    /*
        System.out.println("Enter two numbers");
        int num= in.nextInt();
        int sum=0;
       // int orig=num;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (num==sum){
            System.out.println("perfect no.");
        }
        else{
            System.out.println("Not perfect no.");
        }

     */

        //********check leap year or not**********18
        /*
        System.out.println("enter year");
        int year= in.nextInt();
        System.out.println("Is it a Century year then press 'Y' or press 'N' ");
        char ch=in.next().charAt(0);
        String ans=leap(year,ch);
        System.out.println(ans);

        }

     static String leap(int year, char ch) {
        if (ch=='Y' || ch=='y'){
            if (year%400==0){
               return "Leap Year";
            }
        }
        if (ch=='N' || ch=='n'){
            if (year%4==0){
                return "Leap Year";
            }
        }
        return "Not Leap year";

         */
        //********Find how many even dates in August month *************19
        /*
        System.out.println("AUGUST MONTH HAVE 31 DAYS");
        int days=0;
        int count=0;
        for (int i=0;i<31;i++){
            if (i%2==0){
                count++;
                days+=count;
            }
        }
        System.out.println("Kunal can go outside for "+count+" days in August");

         */

        //*********sum of -ve num , sum of +ve even , sum of +ve odd num****************20
/*
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        while (true) {
            System.out.println("ENTER NUMBERS AND ENTER 0 TO EXIT");
            int num = in.nextInt();
            if (num < 0) {
                sum1 += num;
            }
            if (num > 0 && num % 2 == 0) {
                sum2 += num;
            }
            if (num > 0 && num % 2 != 0) {
                sum3 += num;
            }
                if (num==0){
                    break;
                }
            }

        System.out.println("sum of negative "+sum1);
        System.out.println("sum of even positive "+sum2);
        System.out.println("sum of odd positive "+sum3);

 */
    }
}



