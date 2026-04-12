package Basics;

import java.util.*;

public class LastRepeatingChar {
    public static void main(String[] args) {
        String s = "abdcbad";
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {

            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);

        for (int i = s.length()-1; i >=0; i--) {
            if (list.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }

        }

        for (int i = 0; i<s.length(); i++) {
            if (list.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }

        }
    }}