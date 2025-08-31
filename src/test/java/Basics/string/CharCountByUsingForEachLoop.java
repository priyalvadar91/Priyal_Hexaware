package Basics.string;

import java.util.HashMap;

public class CharCountByUsingForEachLoop {
    public static void main(String[] args) {

        String s="selenium java automation testing";
        char [] ch =s.toCharArray();
        HashMap<Character,Integer> hashMap= new HashMap<>();

        for (char c:ch) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c,hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);
            }
        }

        System.out.println(hashMap);

    }
}
