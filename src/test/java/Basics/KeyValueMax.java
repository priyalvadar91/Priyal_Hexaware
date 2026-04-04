package Basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeyValueMax {
    public static void main(String[] args) {
        String [] s={"X:-1","Y:2","X:-4","B:3","X:5"};
        HashMap<String,Integer> hashmap= new HashMap<String,Integer>();
        for(String str:s){
            String [] keyValue=str.split(":");
            String key=keyValue[0];
            int value=Integer.parseInt(keyValue[1]);
            if(!hashmap.containsKey(key) || value>hashmap.get(key)){
                hashmap.put(key,value);
            }

        }
        int max= Collections.max(hashmap.values());
        StringBuffer sb= new StringBuffer();
        for(Map.Entry<String,Integer> entry:hashmap.entrySet()){
            if(max==entry.getValue()){
                sb.append(entry.getKey()).append(":").append(entry.getValue());
            }
        }
        System.out.println(sb);

    }



}
