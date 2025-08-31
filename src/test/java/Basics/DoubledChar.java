package Basics;

public class DoubledChar {
    public static void main(String[] args) {
        String s="Priyal";
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            result=result+s.charAt(i)+s.charAt(i);
        }

        System.out.println(result);

        StringBuffer sb= new StringBuffer();
        for (int i = 0; i <s.length() ; i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
