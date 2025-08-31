package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers3 {
    public static void main(String[] args) {
        int n=5929;
        int result=0;
        int num=n;
        int steps=1;
        while (result!=6174){
            steps++;
            int a=0;
            int b=0;
            String s= Integer.toString(num);
            Integer [] digits = new Integer[s.length()];
            for (int i = 0; i < digits.length; i++) {
                digits[i]=Character.getNumericValue(s.charAt(i));
            }
            Arrays.sort(digits);
            for (int digit :digits) {
                a=a*10+digit;
            }
            List<Integer> list = Arrays.asList(digits);
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++) {
                digits[i]= list.get(i);
            }

            for (int digit :digits) {
                b=b*10+digit;
            }

            result = b - a;
            num=result;

        }
        System.out.println(steps);
    }

}
