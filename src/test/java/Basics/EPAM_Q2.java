package Basics;

public class EPAM_Q2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            System.out.println(10/0);
            System.out.println("try block");
        }catch (ArithmeticException e){
            System.exit(0);
            System.out.println("B");
        }
        finally {
                System.out.println("C");
            }
    }


}
