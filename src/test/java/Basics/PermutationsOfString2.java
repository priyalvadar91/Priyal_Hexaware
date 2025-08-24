package Basics;

public class PermutationsOfString2 {

    public static void main(String[] args) {

        String s="abcd";
        String result1 ="";
        String result2 ="";

        for (int i = 0; i <s.length() ; i++) {

            result1 = result1+s.charAt(i);
            result2=result2+s.charAt(i);
            for (int j = 0; j <s.length() ; j++) {

                if (i != j) {
                    result1 = result1+s.charAt(j);
                }

            }

            System.out.println(result1);
            result1="";
            for (int j = s.length()-1; j >=0 ; j--) {
                if (i != j) {
                    result2 = result2+s.charAt(j);
                }
            }

            System.out.println(result2);
            result2="";
        }

    }
}
