package String;

public class StringInternDemo {
    public static void main(String[] args) {

        String s1=new String("bhaskar");
        String s2=s1.intern();
        String s3="bhaskar";
        System.out.println(s2==s3);//true
    }
}
