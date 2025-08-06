package Basics;
import java.util.Arrays;
//Input array  :[12, 89, 23, 61, 88, 22, 63, 37, 91, 2, 7, 99]
// rotate array from index = 3
// Output array :[61, 88, 22, 63, 37, 91, 2, 7, 99, 12, 89, 23]
public class RotateArray {

    public static void main(String[] args) {
        rotateArrayFromIndex(new int []{12,89,23,61,88,22,63,37,91,2,7,99},3);
        }
        private static void rotateArrayFromIndex(int [] a,int index) {

        int b[] = new int[a.length];
        int j=0;

        for (int i = 0; i < a.length; i++) {

            if (i<a.length-index) {
                b[i] = a[index + i];

            }
            else {
                b[i]=a[j];
                j++;
            }
        }

        System.out.println("Input array  :"+Arrays.toString(a));
        System.out.println("Output array :"+Arrays.toString(b));

    }


}

