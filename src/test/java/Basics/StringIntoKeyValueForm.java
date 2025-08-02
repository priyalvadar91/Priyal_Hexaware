package Basics;

import java.util.HashMap;
import java.util.Map;

//Input String  :a2b4c1d7e3f9
//Output String :aabbbbcdddddddeeefffffffff

public class StringIntoKeyValueForm {
    public static void main(String[] args) {

        String s="a2b4c1d7e3f9";
        String result ="";
        Map<Character,Character> hashmap = new HashMap<>();

        for (int i = 0; i < s.length()-1; i=i+2) {
         hashmap.put(s.charAt(i), s.charAt(i+1));

        }
        for (Map.Entry<Character,Character> entry : hashmap.entrySet()) {

            int valueInt = Integer.parseInt(String.valueOf(entry.getValue()));
            for (int i = 0; i < valueInt; i++) {
                result=result+entry.getKey();
            }
        }
        System.out.println("Input String  :"+s);
        System.out.println("Output String :"+result);
        }

    }
