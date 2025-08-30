package Basics;

import java.util.Arrays;

public class ArrayReverseByUsingWhileLoop {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9,10};
        int start=0;
        int end=a.length-1;

        System.out.println(Arrays.toString(a));

        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(a));
    }
}
