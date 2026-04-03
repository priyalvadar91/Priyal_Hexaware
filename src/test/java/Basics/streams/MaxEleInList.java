package Basics.streams;

import java.util.List;

public class MaxEleInList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Max: " + max);
    }
}
