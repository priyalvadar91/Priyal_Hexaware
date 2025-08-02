package Basics;

public class StringIntoKeyValue2 {
    public static void main(String[] args) {
        String s="a2b4c1d7e3f9";
        String result ="";

        for (int i = 0; i <s.length() ; i++) {

            if (Character.isAlphabetic(s.charAt(i))) {
                result= result+s.charAt(i);
            }
            else {

                int n = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j <n ; j++) {
                    result = result+s.charAt(i-1);
                }
            }
        }
        System.out.println("Input String  : "+s);
        System.out.println("Output String : "+result);
    }
}
