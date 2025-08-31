package Basics;

import java.util.Arrays;
import java.util.HashMap;

public class ReturnIndices_SumOfTwoNumbers2 {
    public static void main(String[] args) {
        retrunIndices(new int[]{2, 4, 1, 8, 3, 7, 6}, 11);
    }


    private static void retrunIndices(int[] a, int target) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                 sum = a[i] + a[j];

                    if (target==sum) {

                        System.out.println(i+","+j);

                    }

                 }

        }

    }
}
