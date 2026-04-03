package Basics;

public class MissingCharacterEx1 {
    public static void main(String[] args) {
        System.out.println(MissingChar("abcd",1));
    }

    private static String MissingChar(String s, int n) {
        String result="";
        for (int j = 0; j < s.length(); j++) {
            if (j!=n) {
                result=result+s.charAt(j);
            }
        }
        return result;
    }
}
