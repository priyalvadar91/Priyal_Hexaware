package Basics;

import java.util.Collections;
import java.util.HashMap;

public class MaxValueFromStringKeyValueFormat {

    public static void main(String[] args) {
        String [] s = {"X:-1","Y:1","X:-4","B:3","X:5"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str:s) {
            String [] keyValue=str.split(":");
            String key=keyValue[0];
            int value= Integer.parseInt(keyValue[1]);
            if (!hashMap.containsKey(key) || value> hashMap.get(key)) {

                hashMap.put(key,value);
            }
        }
        // finding maximum value
        int maxValue = Collections.max(hashMap.values());

        // finding key which is associated with maximum value
        StringBuffer result= new StringBuffer();
        for (String key: hashMap.keySet()) {
            if (hashMap.get(key) == maxValue) {
                result.append(key).append(":").append(maxValue);
            }
        }
        System.out.println(result);
    }
}
