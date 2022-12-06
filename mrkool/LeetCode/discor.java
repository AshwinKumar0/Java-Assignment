package mrkool.pakage;

public class discor {
    public static void main(String[] args) {
        int n = 3;
        for (int i=1;i<=n;i++){
            int count =0;
            for (int j=1;j<=(int)Math.pow(j,i);j++){
                count++;
                System.out.print("*");
            }
            System.out.println(count);

        }
    }
}
