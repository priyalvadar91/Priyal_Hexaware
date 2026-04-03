package Basics.streams;

import java.util.List;

public class SecondSmallestElementList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int secondSmallest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}
