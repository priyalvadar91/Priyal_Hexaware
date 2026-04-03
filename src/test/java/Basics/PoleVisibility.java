package Basics;

public class PoleVisibility {
    public static void main(String[] args) {
        int [] a= {6,8,4,10,12,19,4,5,11,22};
        int count=1;
        int high=a[0];
        for (int i = 1; i < a.length; i++) {
                if (high<a[i]){
                    count++;
                    high=a[i];
                }

        }
        System.out.println(count);
    }
}
