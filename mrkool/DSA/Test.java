package mrkool.DSA;

public class Test {
    public static void main(String[] args) {
     boolean status = false;
     int sum = 0;
     int i = 1;
     while(!status){
         sum = (i*(i+1))/2;
         int count = checkFactorsCount(sum);
         System.out.println();
         if (count >= 500) {
             status =true;
         }
         i++;
     }

        System.out.println("\n The Triangle is " +sum+" which have over five Divisors");
    }
    static int checkFactorsCount(int num) {
        int count = 0;

        System.out.print(num+" : ");
        for(int i = 1 ; i <= num; i++){

            if (num % i == 0) {
                count++;
                System.out.print(i+" ");
            }

        }
        return count;
    }
}