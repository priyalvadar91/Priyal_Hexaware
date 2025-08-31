package Basics;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        int a[] = {12,45,90,77,53,22};
        int b[] = new int[a.length*2];

        System.out.println(Arrays.toString(b));
        System.out.println(b.length);

        for (int i = 0; i<a.length ; i++) {

            b[i+a.length]=a[i];

        }
        System.out.println(Arrays.toString(b));

    }
}
