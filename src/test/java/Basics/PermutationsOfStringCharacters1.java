package Basics;

public class PermutationsOfStringCharacters1 {
    public static void main(String[] args) {
        String s= "abcd";
        permute(s,"");
    }

    private static void permute(String s, String prefix) {
        if (s.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i <s.length() ; i++) {
            String rem= s.substring(0,i)+s.substring(i+1);
            permute(rem,prefix+s.charAt(i));
        }
    }
}
