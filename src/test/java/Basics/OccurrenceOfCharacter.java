package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//Input : "priyal is a bad boy but not a bad person";
//Output:
//        :9
//        a:5
//        b:4
//        d:2
//        e:1
//        i:2
//        l:1
//        n:2
//        o:3
//        p:2
//        r:2
//        s:2
//        t:2
//        u:1
//        y:2

public class OccurrenceOfCharacter {
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

        for (Map.Entry<Character,Integer> entry:hashMap.entrySet()) {

                System.out.println(entry.getKey()+":"+ entry.getValue());

            }

        }
    }

