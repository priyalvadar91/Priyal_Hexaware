package Basics;

public class SecondLargest {

    public static void main(String[] args) {

        int [] arr = {111,12, 35, 108, 10, 34, 122, 37, 35,99,1002,1002};
        int firstLargest=0;
        int secondLargest=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];

            }
            else {
                if (arr[i] > secondLargest && arr[i] != firstLargest) {
                    secondLargest = arr[i];
                }
            }

        }

        System.out.println("First largest number : "+firstLargest);
        System.out.println("Second largest number : "+secondLargest);

    }
}
