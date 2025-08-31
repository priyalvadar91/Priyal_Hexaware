package Basics;

import java.util.Arrays;

public class RotateArray4 {
    public static void main(String[] args) {
        rotateArrayFromGivenIndex(new int[]{1,2,3,4,5,6,7,8,9,10},4);
    }

    private static void rotateArrayFromGivenIndex(int[] a, int index) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <index ; i++) {
            int first =a[0];

            for (int j = 0; j <a.length-1 ; j++) {
                a[j]=a[j+1];
            }

            a[a.length-1]=first;
        }

        System.out.println(Arrays.toString(a));


    }
}
