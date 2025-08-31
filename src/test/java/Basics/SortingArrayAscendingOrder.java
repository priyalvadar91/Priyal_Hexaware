package Basics;

import java.util.Arrays;

public class SortingArrayAscendingOrder {

    public static void main(String[] args) {
        int [] a={13,2,99,76,18,122,91};
        int temp=0;

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {

                if (a[i] >a[j]){

                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }


            }

        }

        System.out.println("Sorting Array in Ascending Order :"+ Arrays.toString(a));
        System.out.println("Largest no:"+ a[a.length-1]);
        System.out.println("Second Largest no:"+ a[a.length-2]);
    }
}

