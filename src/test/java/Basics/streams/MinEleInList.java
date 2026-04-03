package Basics.streams;

import java.util.List;

public class MinEleInList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("Min: " + min);
    }
}
