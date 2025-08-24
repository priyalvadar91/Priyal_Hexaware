package Basics;

public class UpppercaseAndLowercase {
    public static void main(String[] args) {

        String s= "aABbCcDeEFf";
        String lower="";
        String upper="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                lower=lower+s.charAt(i);
            }
            else {
                upper=upper+s.charAt(i);
            }
        }
        System.out.println(lower);
        System.out.println(upper);
    }
}
