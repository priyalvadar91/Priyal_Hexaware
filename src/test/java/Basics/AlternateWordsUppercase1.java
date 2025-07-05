package Basics;

public class AlternateWordsUppercase1 {

    public static void main(String[] args) {

        String s = "priyal selenium java automation testing framework";
        String[] str = s.split(" ");

        StringBuffer sb =new StringBuffer();

        for (int i = 0; i < str.length; i++) {

            if (i % 2 == 1) {
              sb = sb.append(str[i]);
            }
            else{
                sb= sb.append(" "+str[i].toUpperCase()+" ");

            }
        }

        System.out.println(sb.toString().trim());
    }
}
