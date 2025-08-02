package Basics;

public class SecondHighest {
    public static void main(String[] args) {

        int a[] = {5,2,7,1,4,9};
        int secondLargest=0;
        int largest=0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest=largest;
                largest=a[i];
            }else {

                if (a[i] > secondLargest && largest!=secondLargest) {

                    secondLargest =a[i];
                }
            }

        }

        System.out.println("Largest        :"+largest);
        System.out.println("Second largest :"+secondLargest);
    }
}
