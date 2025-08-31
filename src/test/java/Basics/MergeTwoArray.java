package Basics;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int [] a={1,2,3,4,5};
        int [] b={6,7,8,9,10};
        int [] merge = new int [a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            merge[i]=a[i];
        }

        for (int i = 0; i <b.length ; i++) {
            merge[i+a.length]=b[i];
        }

        System.out.println("Array a     :"+Arrays.toString(a));
        System.out.println("Array b     :"+Arrays.toString(b));
        System.out.println("Array Merge :"+Arrays.toString(merge));
    }
}
