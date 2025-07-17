package Basics;

//input : Java Selenium TestNG Automation Framework
//output: krowemarF noitamotuA GNtseT muineleS avaJ

public class ReverseString {
    public static void main(String[] args) {

            String s ="Java Selenium TestNG Automation Framework";
            String rev="";
            for(int i=s.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);

            }
            System.out.println("Input String         :" + s);
            System.out.println("After Reverse String :" + rev);
        }
    }

