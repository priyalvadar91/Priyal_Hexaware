package Basics;

public class MissingNum {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,7,8,9,10};
        int n=10;
        int missing=0;
        int total =(n+1)*n/2;
        int sum=0;

        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }
        missing=total-sum;

        System.out.println("Missing number is: "+missing);
    }
}
