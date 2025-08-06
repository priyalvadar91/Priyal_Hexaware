package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers2 {
    public static void main(String[] args) {
        int n = 6892;
        int result = 0;
        int step = 1;
        int num = n;
        while (result != 6174) {
            step++;
            int a = 0;
            int b = 0;

            String s= Integer.toString(num);
            Integer [] digits= new Integer[s.length()];
            for (int i = 0; i < digits.length; i++) {
                digits[i]= Character.getNumericValue(s.charAt(i));
            }
            Arrays.sort(digits);
            for (int digit : digits) {
                a = a * 10 + digit;
            }


            int start = 0;
            int end = digits.length - 1;

            while (start < end) {
                int temp = digits[start];
                digits[start] = digits[end];
                digits[end] = temp;

                start++;
                end--;
            }

            for (int digit : digits) {
                b = b * 10 + digit;
            }
            result = b - a;
            num = result;
        }
        System.out.println(step);
    }

}