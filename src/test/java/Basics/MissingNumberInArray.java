package Basics;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9};
        int n=9;
        int expectedSum=n*(n+1)/2;
        int missingNumber=0;
        int actualSum=0;
        for (int i = 0; i < a.length; i++) {

            actualSum=actualSum+a[i];
        }

        missingNumber= expectedSum-actualSum;

        System.out.println("Missing Number in the array :"+missingNumber);
    }
}
