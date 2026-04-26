package Basics;

public class RemoveCharAtIndexEx2 {
    public static void main(String[] args) {
        System.out.println(RemoveCharAtIndex("automation", 1));
    }

    private static String RemoveCharAtIndex(String s, int n) {
        return s.substring(0,n)+s.substring(n+1);
    }
}
