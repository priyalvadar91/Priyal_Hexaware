package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Reverse and Swap the digits of each number in a list

public class ReverseAndSwap2 {
    public static void main(String[] args) {

        int [] a={12,43,82,69,41};
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            listA.add(a[i]);
        }
        System.out.println("Original List: " + listA);
        List<Integer> listB = new ArrayList<>();

        Collections.reverse(listA);
        System.out.println("Reversed List: " + listA);

        int result=0;
        int reminder=0;
        for (int i = 0; i < listA.size(); i++) {
            while (listA.get(i) > 0) {
                reminder = listA.get(i) % 10;
                result = result * 10 + reminder;
                listA.set(i, listA.get(i) / 10);
            }
            listB.add(result);
            result = 0;
            }

        System.out.println("Swapped List: " + listB);

        }
    }

