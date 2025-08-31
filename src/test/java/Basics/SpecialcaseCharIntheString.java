package Basics;

public class SpecialcaseCharIntheString {
    public static void main(String[] args) {
        String s= "hello@34%Wo$rld";
        for (int i = 0; i <s.length() ; i++) {

            if (!Character.isLetterOrDigit(s.charAt(i)) ) {

                System.out.print(s.charAt(i));
            }
        }
    }
}
