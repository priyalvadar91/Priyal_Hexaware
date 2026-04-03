package Basics;

public class InterviewQ1 {
    static int a;
    static {
        a=4;
        System.out.println("a= "+a);
    }
    {
        a=15;
        System.out.println("a= "+a);
    }
    InterviewQ1(){
        a=10;
        System.out.println("a= "+a);
    }

    public static void m1(){
        a=a+1;
        System.out.println("a= "+a);
    }

    public static void main(String[] args) {
        m1();
        System.out.println("main method");
        InterviewQ1 i= new InterviewQ1();


    }
}
