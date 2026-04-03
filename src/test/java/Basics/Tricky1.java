package Basics;

import java.util.HashMap;
import java.util.Map;

//Input String  : aabbbccccddefff
//Output String : a2b3c4d2e1f3

public class Tricky1 {
    public static void main(String[] args) {

        String s= "aabbbccccddefff";
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
            else {
                hashMap.put(s.charAt(i),1);
            }
        }
        String result="";

        for (Map.Entry<Character,Integer> entry: hashMap.entrySet()) {
            result= result+entry.getKey()+entry.getValue();
        }

        System.out.println("Input String  :" +s);
        System.out.println("Output String :"+result);

        }
    }

