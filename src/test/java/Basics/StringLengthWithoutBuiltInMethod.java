package Basics;

public class StringLengthWithoutBuiltInMethod {

    public static void main(String[] args) {
        String s= "priyal";
        int i=0;
       try{
           while (true){
               s.charAt(i);
               i++;
           }
       }catch (StringIndexOutOfBoundsException e){

       }


        System.out.println(i);
    }
}
