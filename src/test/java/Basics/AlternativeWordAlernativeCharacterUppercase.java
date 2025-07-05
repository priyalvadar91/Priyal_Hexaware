package Basics;

public class AlternativeWordAlernativeCharacterUppercase {

    public static void main(String[] args) {

        String s = "priyal selenium automation testing framework";
        String [] str = s.split(" ");

        String result = "";

        for (int i = 0; i < str.length; i++) {
            if (i%2==1) {
                String word = str[i]+" ";
                result = result+ str[i-1]+" ";

                for (int j = 0; j < word.length(); j++) {
                   if (j%2==1) {
                            result =result+ word.charAt(j);
                        } else {
                            result = result+Character.toUpperCase(word.charAt(j));
                        }
                }
            }
        }

        System.out.println(result.trim());
    }
}
