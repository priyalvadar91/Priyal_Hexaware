package Basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//INPUT: EPPAAAMMMM
//OUTPUT: E1P2A3M4
public class EPAM_Q4 {

    public static void main(String[] args) {
        String name="EPPAAAMMMM";
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            if(hashMap.containsKey(name.charAt(i))){
                    hashMap.put(name.charAt(i),hashMap.get(name.charAt(i))+1);
                }else {
                    hashMap.put(name.charAt(i),1);
                }
        }
        String result="";
        for (Map.Entry<Character,Integer> entry:hashMap.entrySet()) {

            result=result+entry.getKey()+entry.getValue();

        }
        System.out.println(result);
    }
}
