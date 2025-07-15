package Basics;
//Input  : Java Selenium TestNG Automation Framework Testing
//output : avaJ Selenium GNtseT Automation krowemarF Testing

public class ReverseAlternativeWord1 {
    public static void main(String[] args) {
        String s ="Java Selenium TestNG Automation Framework Testing";
        String [] str = s.split(" ");

        String rev="";
        for(int i=0;i<str.length;i++){

            if(i%2==0 ){
                String word = str[i];
                for(int j=word.length()-1;j>=0;j--){

                    rev=rev+word.charAt(j);
                }
            }
            else if(i%2==1){
                rev=rev+str[i];
            }

            rev=rev+" ";

        }
        System.out.println(s);
        System.out.println(rev.trim());
    }
}
