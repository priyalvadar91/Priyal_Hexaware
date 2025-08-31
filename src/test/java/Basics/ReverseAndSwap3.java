package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAndSwap3 {

    public static void main(String[] args) {

        System.out.println("Return List :"+reverseAndSwapNumber(new int[]{23,87,65,982,98}));
    }
    private static List<Integer> reverseAndSwapNumber(int[] a) {

        List<Integer> listA= new ArrayList<>();
        List<Integer> listB= new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            listA.add(a[i]);
        }
       System.out.println("Original List:" + listA);

        Collections.reverse(listA);


        int reminder =0;
        int result = 0;

        for (int i = 0; i <listA.size() ; i++) {
            while (listA.get(i)>0){
                reminder = listA.get(i) % 10;
                result = result * 10 + reminder;
                listA.set(i, listA.get(i) / 10);
            }
            listB.add(result);
            result = 0;
        }
        return listB;
    }
}
