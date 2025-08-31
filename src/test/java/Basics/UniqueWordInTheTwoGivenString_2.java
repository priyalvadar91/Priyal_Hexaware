package Basics;

import java.util.*;

public class UniqueWordInTheTwoGivenString_2 {
    public static void main(String[] args) {

        String s1 = "Have a nice day";
        String s2 = "Have a good day";
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        String[] merge = new String[str1.length + str2.length];

        for (int i = 0; i < str1.length; i++) {

            merge[i] = str1[i];
        }

        for (int i = 0; i < str2.length; i++) {

            merge[i + str1.length] = str2[i];
        }
        System.out.println("String 1        :"+s1);
        System.out.println("String 2        :"+s2);
        System.out.println("Merged String   :"+Arrays.toString(merge));

        Set<String> set = new HashSet<>();

        for (int i = 0; i < merge.length; i++) {
            if (!set.add(merge[i])) {
                set.remove(merge[i]);

            }
        }
        List<String> list = new ArrayList<>();
        list.addAll(set);
        Collections.reverse(list);
        System.out.println("Unique          : "+list);

    }
}
