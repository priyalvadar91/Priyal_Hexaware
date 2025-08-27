package Basics;

public class ReturnIndices_SumOfTwoNumbers1 {

    public static void main(String[] args) {
        int a[]={2,4,1,8,3,7,6};
        int target = 11;
        int sum=0;

        for (int i = 0; i <a.length ; i++) {

            for (int j = i+1; j <a.length ; j++) {
                sum=a[i]+a[j];
                if (target == sum) {
                    System.out.println(i +","+j);
                }

            }

        }
    }
}
