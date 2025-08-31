package Basics;

import java.util.Arrays;

public class ShiftAllZerosTRight {
    public static void main(String[] args) {

        int [] a= {12,0, 0, 34, 0, 56, 0, 78, 90, 0};
        int b[] = new int[a.length];
        int j=0;

        for (int i = 0; i <a.length ; i++) {

            if (a[i] !=0 ){
                b[j]=a[i];
                j++;
            }
        }

        for (int i = 0; i <a.length ; i++) {
            if (a[i] ==0 ){
                b[j]=a[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
