package Basics;

public class AlternateWordsUppercase {

    public static void main(String[] args) {
        String s= "priyal selenium java automation";
        String[] str = s.split(" ");

        String str1="";
        for (int i = 0; i <str.length; i++) {

            if(i%2==1){

                str1   =str1+str[i-1]+" "+str[i].toUpperCase()+" ";
            }
        }

        System.out.println(str1);
    }
}



