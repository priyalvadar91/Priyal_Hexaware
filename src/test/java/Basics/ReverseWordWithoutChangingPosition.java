package Basics;

//input : Java Selenium TestNG Automation Framework
//output: avaJ muineleS GNtseT noitamotuA krowemarF

public class ReverseWordWithoutChangingPosition {
    public static void main(String[] args) {
        String s ="Java Selenium TestNG Automation Framework";
        String [] str = s.split(" ");

        String rev="";
        for(int i=0;i<str.length;i++){
            String word = str[i]+" ";

            for(int j=word.length()-1;j>=0;j--){
                rev=rev+word.charAt(j);
            }
        }
        System.out.println("Input String : "+s);
        System.out.println("After Reverse: "+rev.trim());
    }
}
