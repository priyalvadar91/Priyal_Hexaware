package Basics;

import java.util.Map;
import java.util.TreeMap;

public class DXC1 {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("c", "C");
        map.put("b", "B");
        map.put("a", "A");
        for (String key : map.keySet()) {
            System.out.print(key + " ");

        }
    }
}