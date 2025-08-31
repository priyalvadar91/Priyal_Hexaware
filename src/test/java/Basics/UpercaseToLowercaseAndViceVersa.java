package Basics;

public class UpercaseToLowercaseAndViceVersa {
    public static void main(String[] args) {

        String s="HexAwarE";
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result =result+Character.toLowerCase(s.charAt(i));
            }
            else {
                result =result+Character.toUpperCase(s.charAt(i));
            }
        }

        System.out.println(s);
        System.out.println(result);
    }
}
