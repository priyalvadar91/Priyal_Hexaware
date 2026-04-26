package Basics;

public class StringCharAndDigits {
    public static void main(String[] args) {
        //String s = "aababbcccdddaa";
        String s="EPPAAAMMMMEEE";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {

                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(result.toString());
    }
}
