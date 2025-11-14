package DSA;

public class ReturnIndices_SumOfTwoNumbers {

    public static void main(String[] args) {
        int a[]={2,4,1,8,3,7,6};
        int target = 11;

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j <a.length ; j++) {

                int sum = a[i]+a[j];
                if (target == sum) {
                    System.out.println(i+" : "+j);
                }
            }

        }
    }

}
