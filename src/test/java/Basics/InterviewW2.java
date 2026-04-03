package Basics;

public class InterviewW2 {
    public static void main(String[] args) {
        String s="I works A for ABC because i love PABC";
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && s.charAt(i+1) =='B'&& s.charAt(i+2)=='C') {
                result=result+"wipro";
                i=i+2;
            }
            else {
                result=result+s.charAt(i);
            }

        }
        System.out.println(result);
    }
}
