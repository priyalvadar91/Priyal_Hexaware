package Basics;

public class SwapPairInString {
    public static void main(String[] args) {
        String s="PriyalVadar";
        char temp;
        char [] ch = s.toCharArray();
        System.out.println("Before Swap Pair :"+s);
        for(int i=0;i<ch.length-1;i=i+2){

            temp = ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }

        String str= new String(ch);
        System.out.println("After Swap Pair :"+str);


    }
}
