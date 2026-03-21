package Basics.tryCatch;

public class Test1 {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(10/0);
        }finally {
            String s= null;;
            System.out.println(s.length());
        }
    }

}
