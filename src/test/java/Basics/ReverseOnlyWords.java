package Basics;

//Input: Java Selenium TestNG Automation Framework
//Output:Framework Automation TestNG Selenium Java
public class ReverseOnlyWords {

    public static void main(String[] args) {
        String s ="Java Selenium TestNG Automation Framework";
        String [] str = s.split(" ");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            rev =rev+str[i]+" ";

        }
        System.out.println(s);
        System.out.println(rev.trim());
    }
    }

