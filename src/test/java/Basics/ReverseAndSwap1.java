package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//input : [12, 43, 28, 91, 87]
//output : [78, 19, 82, 34, 21]
public class ReverseAndSwap1 {
    public static void main(String[] args) {
        int [] a = {12,43,28,91,87};

        List<Integer> list = Arrays.asList(12, 43, 28, 91, 87);

        Collections.reverse(list);

        System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("Reversed Array: " + list);

        int [] b= new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            b[i]= list.get(i);
        }

        System.out.println("Reversed Array using for loop: " + Arrays.toString(b));


        int [] c = new int[b.length];
        int reminder= 0;
        int result= 0;

        for (int i = 0; i < b.length; i++) {

            while (b[i] > 0) {
                reminder=b[i]%10;
                result = result * 10 + reminder;
                b[i]=b[i]/10;

            }
            c[i] = result;
            result = 0;


        }
        System.out.println("Swap nos in the array:"+Arrays.toString(c));


    }

}
