package Basics;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubSequence {
    public static void main(String[] args) {

        String s="greeks";
        String result ="";

        List<String> list= new ArrayList<>();


        for (int i = 0; i <s.length() ; i++) {
            list.add(String.valueOf(s.charAt(i)));
            for (int j = 0; j <s.length() ; j++) {

                if (i != j) {
                    list.add(result+s.charAt(i)+s.charAt(j));
                }

            }
        }
        System.out.println(list);

        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j <=i; j++) {

                if (i!=j) {
                    System.out.print(s.substring(j, i+1)+"  ");
                }


            }
            System.out.println();

        }

    }
}
