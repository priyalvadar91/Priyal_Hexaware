package Basics.string;

public class StringBufferAndStringBulider {
    public static void main(String[] args) {
                System.out.println("------------StringBuffer-----------------");
        String priyal = "Priyal";

        StringBuffer sb = new StringBuffer(priyal);
        sb.setCharAt(2,'*');
        System.out.println(sb);

        System.out.println("--------------StringBuilder---------------");
        String str = "Priyal";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(2,'*');
        System.out.println(stringBuilder);
    }
}
