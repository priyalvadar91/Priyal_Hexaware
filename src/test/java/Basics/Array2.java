package Basics;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int a[] = {12,32,78,11,56,98};
        int b[] = new int[a.length+1];

        for (int i = 0; i <a.length; i++) {

            b[i+1]=a[i];
        }

        System.out.println(Arrays.toString(b));

    }
}
