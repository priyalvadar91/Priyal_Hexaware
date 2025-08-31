package Basics;

import java.util.Arrays;

public class ReverseArrayByUsingForLoop {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9,10};
        //int j=0;

        System.out.println(Arrays.toString(a));
        int first=a[0];
        for (int i = a.length-1,j=0; i >=0 ; i--,j++) {
            a[j]=a[i];
        }
        a[a.length-1]=first;

        System.out.println(Arrays.toString(a));
    }
}
