package Basics;

public class DXC4 {
    public static void main(String[] args) {
        String s="selenium java automation testing testng framework";
        String[] str = s.split(" ");
        String result = "";
        for (int i = 0; i < str.length; i++) {
            String word = str[i]+" ";
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    result = result + Character.toUpperCase(word.charAt(j));
                } else {
                    result = result + word.charAt(j);
                }

            }

        }
        System.out.println(result);
    }
}
