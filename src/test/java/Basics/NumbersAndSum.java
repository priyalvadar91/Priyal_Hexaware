package Basics;

public class NumbersAndSum {
    public static void main(String[] args) {
        int a[]={2,9,5,6,2,1};
        int target=11;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j]==target) {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
