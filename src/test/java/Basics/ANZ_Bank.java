package Basics;

public class ANZ_Bank {
    public static void main(String[] args) {
        String s = "java";
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-1){
                result=result+s.charAt(i);
            }
            else {
                result=result+s.charAt(i)+",";
            }
        }
        System.out.println(s);
        System.out.println(result);
    }
}
