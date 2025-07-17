package Basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int a =123456;
        int reminder=0;
        int result=0;
        while(a>0){
            reminder=a%10;
            result =result*10+reminder;
            a=a/10;

        }

        System.out.println(result);
    }
}
