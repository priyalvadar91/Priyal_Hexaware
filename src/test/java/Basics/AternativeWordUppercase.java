package Basics;

public class AternativeWordUppercase {
    public static void main(String[] args) {

        String s = "priyal selenium java testng cucumber automation testing framework ";
        String[] words = s.split(" ");

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                result = result+words[i-1]+" " + words[i].toUpperCase() + " ";

            }
        }
        System.out.println(result);


    }}
