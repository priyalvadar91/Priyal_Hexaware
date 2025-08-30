package Basics;

import java.util.Arrays;

public class RotateArray3 {
    public static void main(String[] args) {
        int [] a={12,5,22,34,1,6,9,23,5,8};
        int index =3;

        System.out.println("Before rotate :"+Arrays.toString(a));

        for (int i = 0; i <index ; i++) {
            int first=a[0];
            for (int j = 0; j <a.length-1 ; j++) {
                a[j]=a[j+1];
            }
            a[a.length-1]=first;
        }

        System.out.println("After rotate  :"+Arrays.toString(a));
    }
}
