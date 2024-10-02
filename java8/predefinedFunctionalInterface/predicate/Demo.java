package java8.predefinedFunctionalInterface.predicate;

import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {


        Predicate<Integer> p = I -> I%2==0 ;
        System.out.println(p.test(10));

        Predicate<String> ps = S -> S.length()>5 ;
        System.out.println(ps.test("khanAbdullah"));

        String[] arr = {"khan","Abdullah","Ubaid","Ahmed"};
        Predicate<String> parr = S -> S.length()%2==0 ;

        for (String s:
             arr) {
            if(ps.test(s)){
                System.out.println(s);
            }
        }

        for (String s:
                arr) {
            if(parr.test(s)){
                System.out.println(s);
            }
        }


        /**
         * Predicates Joining
         */


        int[] ar = {5,10,11,12,13,15,16};

        Predicate<Integer> p1 = I -> I%2==0 ;
        Predicate<Integer> p2 = I -> I>11 ;

        for (Integer i:
             ar) {

            if (p1.and(p2).test(i)){
                System.out.print(i +" ");
            }

            System.out.println();
            if (p1.or(p2).test(i)){
                System.out.print(i+" ");
            }
            System.out.println();
            if (p1.negate().test(i)){
                System.out.print(i +" ");
            }



        }

    }

}
