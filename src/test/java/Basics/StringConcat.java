package Basics;

//Input String      :DALI1234
//Output String    :D4A3L2I1

public class StringConcat {
    public static void main(String[] args) {

        String s= "DALI1234";
        String charStr ="";
        String numStr="";
        String result = "";


        for (int i = 0; i <s.length() ; i++) {
            if (Character.isLetter(s.charAt(i))) {
                charStr = charStr + s.charAt(i);
            }
            else if (Character.isDigit(s.charAt(i))) {
                numStr = numStr + s.charAt(i);
            }
        }


        for (int i = 0,k=numStr.length()-1; i < charStr.length(); i++,k--) {
            result = result+ charStr.charAt(i)+numStr.charAt((k));

        }

        System.out.println("Input String      :" +s);
        System.out.println("Output String     :"+result);
    }
}
