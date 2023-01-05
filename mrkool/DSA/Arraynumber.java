package mrkool;
import java.util.*;
import java.util.Arrays;
import java.util.List;
    class Arraynumber
    {
        public static void main(String [] args)throws Exception
        {
            Integer[] a ={1,2,3,4,5,6};
            Integer[] b ={7,8,9,1,2,10};
            Integer[] c ={10,11,12,3,4,5};



            List<Integer> c1 = List.of(a);
            List<Integer> c2 = List.of(b);
            List<Integer> c3 = List.of(c);



            List<List<Integer>> finalList = new ArrayList<>();



            finalList.add(c1);
            finalList.add(c2);
            finalList.add(c3);

            System.out.println(finalList);
            for(List<Integer> l: finalList) {

                System.out.println(l);
          }
        }
    }

