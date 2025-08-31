package Basics;

import java.util.Arrays;
//Input  :[12, 32, 31, 14, 51, 16]
//Output :[16, 12, 32, 31, 14, 51]

public class ShiftNumToNextIndex {

    public static void main(String[] args) {
        int a[] ={12,32,31,14,51,16};
        int b[] = new int[a.length];

        for (int i = a.length-1; i >=0 ; i--) {

            if (i >0) {
                b[i]=a[i-1];
            }
            else {
                b[i]=a[a.length-1];
            }

        }
        System.out.println("Input  :"+ Arrays.toString(a));
        System.out.println("Output :"+ Arrays.toString(b));
    }
}
