package Basics;

public class RemoveCharAtIndexEx3 {
    public static void main(String[] args) {
        System.out.println(RemoveCharAtIndex("automation", 1));
    }

    private static String RemoveCharAtIndex(String s, int n) {
        StringBuffer sb= new StringBuffer(s);
        return sb.deleteCharAt(n).toString();
    }
}
