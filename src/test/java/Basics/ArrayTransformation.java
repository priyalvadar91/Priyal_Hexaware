package Basics;

import java.util.Arrays;

//int[] inputArray = {12, 43, 28, 91, 87};
//int[] outputArray = {78,19,82,34,21};

public class ArrayTransformation {
    public static void main(String[] args) {

        int[] inputArray = {12, 43, 28, 91, 87};


        int[] outputArray = new int[inputArray.length];


        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = 90 - inputArray[i];
        }


        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(outputArray));

    }
}