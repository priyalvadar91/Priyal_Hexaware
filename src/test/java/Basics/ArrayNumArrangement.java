package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
//
//Input  :[0, 4, 78, 0, 6, 0, 65, 0, 0]
//Output :[0, 0, 0, 0, 0, 4, 78, 6, 65]

public class ArrayNumArrangement {
    public static void main(String[] args) {

        int [] a ={0,4,78,0,6,0,65,0,0};
        int [] result =  new int[a.length];
        int j=0;

        for (int i = 0; i <a.length; i++) {

            if (a[i] == 0) {
                result[j]=a[i];
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                result[j]=a[i];
                j++;
            }
        }


        System.out.println("Input  :"+Arrays.toString(a));
        System.out.println("Output :"+Arrays.toString(result));
    }
}
