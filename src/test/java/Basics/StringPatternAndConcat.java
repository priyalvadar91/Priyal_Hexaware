package Basics;

import java.util.HashSet;
import java.util.Set;

public class StringPatternAndConcat {

    public static void main(String[] args) {

        String s="I Love Dogs";
        String result = "";

        String strTrim = s.replaceAll(" ", "");
        System.out.println(strTrim);

        Set<String> set= new HashSet<>();
        for (int i = 0; i < strTrim.length(); i++) {

            for (int j = 0; j < strTrim.length(); j++) {
                if (i != j  ) {
                    System.out.print(result+strTrim.charAt(i)+strTrim.charAt(j)+" , ");
                }
            }
            System.out.println();

        }
}

}
