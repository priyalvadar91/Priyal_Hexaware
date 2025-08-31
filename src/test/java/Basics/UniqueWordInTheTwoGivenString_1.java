package Basics;

import java.util.*;

public class UniqueWordInTheTwoGivenString_1 {
    public static void main(String[] args) {
         String s1="Have a nice day";
         String s2 ="Have a good day";
         String [] str1 = s1.split(" ");
         String [] str2 = s2.split(" ");
         List<String> list = new ArrayList<String>();

        for (int i = 1; i < str1.length; i++) {
            list.add(str1[i]);
            list.add(str2[i]);
        }
        System.out.println(list);
        Map<String, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {

            if (hashmap.containsKey(list.get(i))) {
                hashmap.put(list.get(i),hashmap.get(list.get(i))+1);

            }
            else {
                hashmap.put(list.get(i),1);
            }
        }
        System.out.println("===============================================================");
        for (Map.Entry<String,Integer> entry : hashmap.entrySet()){

            if (entry.getValue() == 1) {
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
