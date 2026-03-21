package Basics;

import java.util.Arrays;

public class ShiftAllZeroes3 {
    public static void main(String[] args) {

        int a [] ={9,0,23,12,0,34,56,76,0,78,0};

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] == 0) {
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }

        System.out.println(Arrays.toString(a));
    }

}
