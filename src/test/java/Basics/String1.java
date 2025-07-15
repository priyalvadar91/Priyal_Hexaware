package Basics;

public class String1 {
    public static void main(String[] args) {
        String s="Selenium Automation TesNG Testing Framework";
        StringBuffer sb = new StringBuffer();
        String [] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {

            if (i == 0 || i == str.length - 1) {

            sb=sb.append(str[i]+" ");

            } else  {
                char[] ch;
                String temp="";
                for (int j = 0; j < str[i].length(); j++) {

                    ch = str[i].toCharArray();
                    ch[j] = '*';
                     temp = temp+ch[j];
                }
                sb = sb.append(temp + " ");

            }
        }

        System.out.println(sb.toString());

    }
}
