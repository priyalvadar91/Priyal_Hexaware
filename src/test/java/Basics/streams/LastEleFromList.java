package Basics.streams;

import java.util.List;

public class LastEleFromList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int last = numbers.stream().reduce((a, b) -> b).orElse(0);
        System.out.println("Last Element: " + last);
    }
}
