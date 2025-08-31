package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfFourLargestNumbersFromArray {
    public static void main(String[] args) {

        int a[]={12,3,54,67,13,34,19,8,11};
        List<Integer> list = new ArrayList<>();
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
            if (i== a.length-1) {
                Collections.sort(list);
                for (int j = list.size()-4; j <list.size(); j++) {
                    sum=sum+list.get(j);
                }

            }

        }

        System.out.println("Input Array  :"+Arrays.toString(a));
        System.out.println("Sorted Array :"+list);
        System.out.println("Sum of four largest Numbers:"+sum);
    }
}
