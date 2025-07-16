package Basics;

public class StringConcat2 {

// Input : abcd1234
// Output: a1b2c3d4
    public static void main(String[] args) {
        String s="abcd1234";
        String result="";
        for(int i=0;i<s.length()/2;i++){

            result=result+s.charAt(i)+s.charAt((s.length()/2)+i);

        }
        System.out.println(result);
    }
}
