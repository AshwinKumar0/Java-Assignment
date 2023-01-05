package mrkool.pakage;
import java.util.*;
public class arraylist {

    public static void main(String[] args) {
    /*

        Scanner in =new Scanner(System.in);

        ArrayList<Integer> AL=new ArrayList<Integer>();
          AL.add(0,55);
          AL.add(3,54);
          AL.add(66);
          AL.add(78);
        System.out.println(AL);
        for (int i=0;i<5;i++){
            AL.add(in.nextInt());
        }
       // System.out.println(AL);
        for (int j=0;j<5;j++){
            System.out.print(AL.get(j)+ " ");
        }



        //
        ArrayList<Boolean> bl=new ArrayList<Boolean>();
        bl.add(0,true);


     }

     */


    //

    /*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {
            ArrayList<String> b1 = new ArrayList<>();
            b1.add("");
            return b1;
        }
        else if(n<0) {
            return new ArrayList<>();
        }

        ArrayList<String> l1 = getStairPaths(n-1);
        ArrayList<String> l2 = getStairPaths(n-2);
        ArrayList<String> l3 = getStairPaths(n-3);
        ArrayList<String> res = new ArrayList<>();
        for(String st : l1) {
            res.add("1"+st);
        }
        for(String st1 : l2) {
            res.add("2"+st1);
        }
        for(String st2 : l3) {
            res.add("3"+st2);
        }
        return res;

     */

    //


    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    ArrayList< String> paths = getMazePaths(1, 1, n, m);

    System.out.println(paths);
}

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
        }
        else if (sr > dr || sc > dc)
        {
            return new ArrayList< >();
        }

        ArrayList< String> paths = new ArrayList< >();
        for (int hms = 1; hms <= dc - sc; hms++)
        {
            ArrayList< String> hpaths = getMazePaths(sr, sc + hms, dr, dc);

            for (String hpath : hpaths)
            {
                paths.add("h" + hms + hpath);
            }
        }

        for (int vms = 1; vms <= dr - sr; vms++)
        {
            ArrayList< String> vpaths = getMazePaths(sr + vms, sc, dr, dc);

            for (String vpath : vpaths) {
                paths.add("v" + vms + vpath);
            }
        }

        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
        {
            ArrayList< String> dpaths = getMazePaths(sr + dms, sc + dms, dr, dc);

            for (String dpath : dpaths)    {
                paths.add("d" + dms + dpath);
            }
        }
        return paths;

    }
}
