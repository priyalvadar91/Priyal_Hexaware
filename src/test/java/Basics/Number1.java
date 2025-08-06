package Basics;

import java.util.*;
import java.util.stream.Collectors;

public class Number1 {
    public static void main(String[] args) {
        int n = 6892;
        int result=0;
        int step=1;
        int num=n;
      while (result!=6174){
          step++;
          int a=0;
          int b=0;

         int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();


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
            b= b * 10 + digit;
        }
        result = b-a;
        num=result;
     }
        System.out.println(step);
    }

    }

