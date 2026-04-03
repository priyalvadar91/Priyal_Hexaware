package Basics;


import java.util.Set;
import java.util.TreeSet;

public class EPAM_Q3 {
    public static void main(String[] args) {
        Set<Character> set= new TreeSet<>();
        set.add('A');
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        set.add('F');

        set.remove('C');
        set.remove('F');
        System.out.println(set);


    }
}
