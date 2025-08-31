package Basics;
//Input :  String s1= "India";
//         String s2 = "Australia";
//Output: IAnudsitaralia
public class ConcatCharFromTwoString1 {

    public static void main(String[] args) {
        String s1= "India";
        String s2 = "Australia";
        String result="";

       int max = Math.max(s1.length(),s2.length());
       int min = Math.min(s1.length(),s2.length());

        for (int i = 0; i <max ; i++) {

            if (s1.length()<s2.length() && i<min) {
                result =result+ s1.charAt(i)+s2.charAt(i);
            }
            else if (s1.length()<s2.length()&& i < max) {
                result=result+s2.charAt(i);
            }
            else if (s1.length()>s2.length() && i<min) {
                result =result+ s1.charAt(i)+s2.charAt(i);

            }
            else if (s1.length()>s2.length()&& i < max) {
                result=result+s1.charAt(i);
            }
        }
        System.out.println(result);
    }
}
