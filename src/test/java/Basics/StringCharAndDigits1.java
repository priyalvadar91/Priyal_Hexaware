package Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringCharAndDigits1 {
    public static void main(String[] args) {

        String s = "aababbcccdddaa";
        List<String> list = new LinkedList<>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            str =str+s.charAt(i);

            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                list.add(str);
                str = "";
            }
        }
        System.out.println(list);
        String result = "";
        for (int i = 0; i < list.size(); i++) {

            int count = list.get(i).length();
            result = result + list.get(i).charAt(0) + count;
        }
        System.out.println(result);
    }
}
