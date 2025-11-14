package String;

public class StringBufferDemo1 {

    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("vijayabhaskar");
        System.out.println(sb);//vijayabhaskar
        sb.delete(6,10);
        System.out.println(sb);//vijayakar
        sb.deleteCharAt(5);
        System.out.println(sb);//vijay
    }
}
