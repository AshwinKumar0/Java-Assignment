package mrkool.pakage;
    public class pascalsTriangle {

        static int factorial(int n) {
            int f;

            for(f = 1; n > 1; n--){
                f *= n;
            }
            return f;
        }
        static int ncr(int n,int r) {
            return factorial(n) / ( factorial(n-r) * factorial(r) );
        }

        /**
         * take number of rows to be printed (n)
         * make outer i for n time to pint the rows
         * make inner to print the j to (N - 1)
         * print blank to format
         * close inner
         * make 2nd inner J to I
         * print nCr of I and J
         * close second inner
         * print new line char
         * @param n number of rows to be printed
         */
        public static void printTriangle(int n){
            int j, i;
            for(i = 0; i <= n; i++) {
                for(j = 0; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(j = 0; j <= i; j++){
                    System.out.print(" "+ ncr(i, j));
                }
                System.out.println();
            }
        }


        public static void main(String[] args) {
            printTriangle(10);
        }


    }

