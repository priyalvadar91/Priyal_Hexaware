package Basics;

//Input String      :abcd1234
//        Output String     :a4b3c2d1

public class StringConcat1 {
    public static void main(String[] args) {
        String s = "abcd1234";
        String result = "";

        for (int i = 0; i<s.length()/2 ; i++) {

            result= result + s.charAt(i) + s.charAt(s.length()-1-i);

        }
        System.out.println("Input String      :" + s);
        System.out.println("Output String     :"+result);

    }
}
