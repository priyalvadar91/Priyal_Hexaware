package Basics.tryCatch;

import java.util.*;

public class StringCharAndDigits {
    public static void main(String[] args) {
        String s="A1n2ki2a0aa1";
      //  String s="3A2Xyx1c2M0T3qPR";
        String digits=s.replaceAll("[^0-9]"," ").trim();
        String words=s.replaceAll("[^a-zA-Z]"," ").trim();
        String onlyDigits[]=digits.split("\\s+");
        String onlyWords[]=words.split("\\s+");

        System.out.println(Arrays.stream(onlyDigits).toList());
        System.out.println(Arrays.stream(onlyWords).toList());


        List<String> listOfDigits= Arrays.asList(onlyDigits);
        System.out.println(listOfDigits);
        Set<String> set = new HashSet<>(listOfDigits);
        System.out.println(set);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < onlyWords.length; i++) {
           int value= Integer.parseInt(onlyDigits[i]);
            for (int j = 0; j <value ; j++) {
                result=result.append(onlyWords[i]);
            }
        }

        System.out.println("Input String  :" +s);
        System.out.println("Output String :"+result);
    }
}
