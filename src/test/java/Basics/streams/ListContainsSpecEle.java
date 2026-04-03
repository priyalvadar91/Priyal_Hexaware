package Basics.streams;

import java.util.List;

public class ListContainsSpecEle {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean contains = numbers.stream().anyMatch(n -> n == 3);
        System.out.println("Contains 3: " + contains);
    }
}
