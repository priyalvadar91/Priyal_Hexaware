package Basics;

public class StringConcat1 {
    public static void main(String[] args) {
        String s = "DALI1234";
        String result = "";

        for (int i = 0; i<s.length()/2 ; i++) {

            result= result + s.charAt(i) + s.charAt(s.length()-1-i);

        }
        System.out.println(result.trim());

    }
}
