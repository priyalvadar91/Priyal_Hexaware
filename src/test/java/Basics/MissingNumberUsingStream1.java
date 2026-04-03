package Basics;

import java.util.Arrays;

public class MissingNumberUsingStream1 {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9};
        int n=9;
        int expectedSum=n*(n+1)/2;

        int actualSum= Arrays.stream(a).sum();

        int missingNumber=expectedSum-actualSum;
        System.out.println("Missing number:"+missingNumber);
        System.out.println(Arrays.stream(a).max().getAsInt());
        System.out.println(Arrays.stream(a).min().getAsInt());




    }
}
