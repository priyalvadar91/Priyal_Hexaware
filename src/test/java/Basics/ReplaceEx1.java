package Basics;

public class ReplaceEx1 {
    public static void main(String[] args) {
        String s="xXHelloxXPriyalXxXAutomationXXXxXTestX";
        String str=s.replaceAll("[xX]","");
        System.out.println(str);
    }
}
