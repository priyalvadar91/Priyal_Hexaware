package Basics;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int a=1234;
       // String s = String.valueOf(a);
        String s=Integer.toString(a);
        String rev="";

        for (int i = s.length()-1; i >=0; i--) {

            rev=rev+s.charAt(i);
        }

        System.out.println(rev);

        int result = Integer.parseInt(rev);
        System.out.println(result);

        System.out.println();





    }
}
