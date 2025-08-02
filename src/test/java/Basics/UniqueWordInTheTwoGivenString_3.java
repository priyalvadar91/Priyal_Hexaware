package Basics;

import java.util.HashSet;
import java.util.Set;

//input : String_1 :Have a nice day
//        String_2 :Have a good day
//output: Unique   :[good, nice]

public class UniqueWordInTheTwoGivenString_3 {

    public static void main(String[] args) {
        String s1 = "Have a nice day";
        String s2 = "Have a good day";

        String merge = s1+" "+s2;
        String [] str = merge.split(" ");

        Set<String> set = new HashSet<>();

        for (int i = 0; i <str.length; i++) {

            if (!set.add(str[i])) {
                set.remove(str[i]);
            }
        }

        System.out.println("String_1 :"+s1);
        System.out.println("String_2 :"+s2);
        System.out.println("Merged   :"+merge);
        System.out.println("Unique   :"+set);
    }
}
