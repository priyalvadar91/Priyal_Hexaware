package Basics;

public class EPAM_Q1 {
    private static int x=10;
    static {
        x++;
    }

    public static void main(String[] args) {
        EPAM_Q1 e= new EPAM_Q1();
        System.out.println(e.x);
        System.out.println(x);
    }
}
