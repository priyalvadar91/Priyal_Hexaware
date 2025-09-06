package Basics;

public class TwoMaxNumbers {
    public static void main(String[] args) {
        int [] a={123,12,34,1,5,890,32,90,77,55,101};
        int maxOne=0;
        int maxTwo=0;

        for (int n: a) {
            if (n >  maxOne) {
                maxTwo=maxOne;
                maxOne=n;
            } else {
                if (n>maxTwo && maxOne!=maxTwo) {
                    maxTwo=n;
                }
            }
        }

        System.out.println("MaxOne: "+maxOne);
        System.out.println("MaxTwo: "+maxTwo);
    }
}
