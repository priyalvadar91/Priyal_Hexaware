package Basics;

public class RemoverCharAtIndexEx1 {

    public static void main(String[] args) {
        System.out.println(removeCharAt("automation", 1));
    }
    private static String removeCharAt(String s, int n) {
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (i!=n    ) {
                result = result + s.charAt(i);

            }
        }
        return result;
    }
}

