package Basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedWord {

    public static void main(String[] args) {

        String s="This is test. This test is only a test";
        String s1=s.replace(".","");
        String [] str =s1.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {

            if (hashMap.containsKey(str[i])) {
                hashMap.put(str[i],hashMap.get(str[i])+1);
            }
            else {

                hashMap.put(str[i],1);
            }
        }
        int max = Collections.max(hashMap.values());

        for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {

            if (entry.getValue()==max) {
                System.out.println(entry.getKey());
            }

        }

    }



}
