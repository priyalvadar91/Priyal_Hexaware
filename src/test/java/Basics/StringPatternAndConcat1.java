package Basics;
//input : I Love Dogs
//output:
//        IL , Io , Iv , Ie , ID , Io , Ig , Is ,
//        Lo , Lv , Le , LD , Lo , Lg , Ls ,
//        ov , oe , oD , oo , og , os ,
//        ve , vD , vo , vg , vs ,
//        eD , eo , eg , es ,
//        Do , Dg , Ds ,
//        og , os ,
//        gs ,
public class StringPatternAndConcat1 {

    public static void main(String[] args) {

        String s="I Love Dogs";
        String result = "";

        String strTrim = s.replaceAll(" ", "");
        System.out.println(strTrim);
        for (int i = 0; i < strTrim.length(); i++) {

            for (int j = i+1; j < strTrim.length(); j++) {

                System.out.print(result+strTrim.charAt(i)+strTrim.charAt(j)+" , ");
               }
            System.out.println();
            }


        }




    }

