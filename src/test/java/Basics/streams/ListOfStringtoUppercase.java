package Basics.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringtoUppercase {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Words: " + uppercaseWords);
    }
}
