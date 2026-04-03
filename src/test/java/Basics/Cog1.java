package Basics;

public class Cog1 {
    public static void main(String[] args) {
        String s="12345654321";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length()-1; i++) {
            if(i>2 && i<s.length()-3){
               sb.setCharAt(i,'*');
            }
        }
        System.out.println(sb);
    }
}
