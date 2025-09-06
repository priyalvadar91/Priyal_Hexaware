package Basics;

import java.util.ArrayList;
import java.util.List;

public class SubStirngPresentInTheArrayOfGivenString {
    public static void main(String[] args) {

        String s="abcde";
        String [] word={"bcd","abcde","acd","ab"};
        int count=0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i <=s.length() ; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                list.add(s.substring(i,j));
            }
        }
        System.out.println(list);

        for (int i = 0; i < word.length ; i++) {
            int j=0;
            if (word[i].contains(list.get(j++))) {
                count++;
                System.out.println(word[i]);
            }
        }
        System.out.println("How many substring present in the array of given String :"+count);

    }
}
