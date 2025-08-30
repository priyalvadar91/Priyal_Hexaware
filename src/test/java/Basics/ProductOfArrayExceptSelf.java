package Basics;

import java.util.Arrays;
// Return an array where each element is the product of all the elements except itself
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int [] result = new int[a.length];
        int product=1;

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (i != j) {
                    product=product*a[j];
                }
            }
            result[i]=product;
            product=1;
        }

        System.out.println("Input Array :"+Arrays.toString(a));
        System.out.println("Output Array:"+Arrays.toString(result));
    }
}
