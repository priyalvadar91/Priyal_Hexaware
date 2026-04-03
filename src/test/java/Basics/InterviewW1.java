package Basics;

public class InterviewW1 {
    public static void main(String[] args) {
        String s="I works for ABC because i love PABC";
        String [] str=s.split(" ");
        String result="";
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("ABC")  ) {
                result=result+"Wipro"+" ";
            }
            else if (str[i].contains("ABC")) {
                for (int j = 0; j < str[i].length(); j++) {
                    if (!(str[i].charAt(j)=='A')  && !(str[i].charAt(j)=='B') && !(str[i].charAt(j)=='C')) {
                        result=result+str[i].charAt(j)+"Wipro"+" ";
                    }

                }
            }
            else {
                result=result+str[i]+" ";
            }

        }
        System.out.println(result);
    }
}
