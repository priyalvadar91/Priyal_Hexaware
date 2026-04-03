package Basics;

public class MissingCharacterEx2 {
    public static void main(String[] args) {
        System.out.println(MissingChar("abcd",1));
    }

    private static String MissingChar(String s, int n) {

        return s.substring(0,n)+s.substring(n+1);
    }
}
