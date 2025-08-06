package Basics;

import java.util.Arrays;

public class ShiftAllZeroes {
    public static void main(String[] args) {


        shiftAllZeroesToLeft(new int[]{12, 0, 0, 88, 23, 0, 2, 0, 34, 0, 56, 0, 78, 90, 0});
        shiftAllZeroesToRight(new int[]{12, 0, 0, 88, 23, 0, 2, 0, 34, 0, 56, 0, 78, 90, 0});
    }

    private static void shiftAllZeroesToRight(int[] a) {
        int [] b= new int[a.length];
        int j=0;

        for (int i = 0; i <a.length ; i++) {

            if (a[i]!=0) {
                b[j++]=a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[j++]=a[i];
            }
        }
        System.out.println("Input Array : "+ Arrays.toString(a));
        System.out.println("Output Array: "+ Arrays.toString(b));
        System.out.println("========================================================================================");
    }

    private static void shiftAllZeroesToLeft(int[] a) {
        int [] b= new int[a.length];
        int j=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[j++]=a[i];
            }
        }

        for (int i = 0; i <a.length ; i++) {

            if (a[i]!=0) {
                b[j++]=a[i];
            }
        }
        System.out.println("Input Array : "+ Arrays.toString(a));
        System.out.println("Output Array: "+ Arrays.toString(b));
        System.out.println("========================================================================================");
    }


}






