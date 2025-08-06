package Basics;

import java.util.Arrays;

public class ShiftAllZeroeszToRight1 {


    public static int[] shiftAllZerosRight(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int[] newArray = new int[a.length];

        int count = 0;
        for (int number : a) {
            if (number != 0) {
                newArray[count] = number;
                count++;

            }
        }
        return newArray;

    }

    public static void main(String[] args) {

        int[] inputArray = { 12,0, 0, 34, 0, 56, 0, 78, 90, 0 };

        System.out.println(Arrays.toString(shiftAllZerosRight(inputArray)));

    }


}
