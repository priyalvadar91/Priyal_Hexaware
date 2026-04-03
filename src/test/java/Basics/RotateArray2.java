package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray2 {

    public static void main(String[] args) {
        rotateArrayFromGIvenIndex(new int []{12,5,22,34,1,36,9,23,55,87},3);
    }
    private static void rotateArrayFromGIvenIndex(int[] a, int index) {

        int b [] = new int[a.length];
        int j=0;
        for (int i = 0; i <a.length ; i++) {
            if (i <a.length-index) {
                b[i]=a[index+i];
            }
            else {
                b[i]=a[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
