package Basics.LetsTry;

public class Test1 {
    public static void main(String[] args) {

        String s= "abcd1234";
        String result1 ="";
        String result2 ="";

        for (int i = 0; i < s.length()/2; i++) {

            System.out.print(result1+s.charAt(i)+s.charAt((s.length()/2+i)));
        }

        System.out.println();
        System.out.println("=========================================================");

        for (int i = 0; i < s.length()/2; i++) {

            System.out.print(result2+s.charAt(i)+s.charAt((s.length()-1-i)));
        }

    }
}
