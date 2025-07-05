package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {

        String s = "priyal is a bad boy but not a bad person";
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){

            if (hashMap.containsKey(s.charAt(i))) {

                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);

            }
            else {

                hashMap.put(s.charAt(i), 1);

            }

        }

        List<Character> list = new ArrayList<>();

        for (Map.Entry<Character,Integer> entry:hashMap.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey()+":"+ entry.getValue());
                list.add(entry.getKey());
            }

        }

        System.out.println("___________________________________________________________");
        System.out.println(list.size());
        System.out.println(list.get(1));


    }
    }