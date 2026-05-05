package Basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharInTheString {
    public static void main(String[] args) {
        String s= "swiss";
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
        }     else {
                hashMap.put(s.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> entry: hashMap.entrySet()) {
            if (entry.getValue()==1){
                System.out.println("First Non Repeating Character in the String is : "+entry.getKey());
                break;
            }
        }
    }
}
