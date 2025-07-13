package Basics;
//input  : I Love Dogs
//Output :
//        II , IL , Io , Iv , Ie , ID , Io , Ig , Is ,
//        LI , LL , Lo , Lv , Le , LD , Lo , Lg , Ls ,
//        oI , oL , oo , ov , oe , oD , oo , og , os ,
//        vI , vL , vo , vv , ve , vD , vo , vg , vs ,
//        eI , eL , eo , ev , ee , eD , eo , eg , es ,
//        DI , DL , Do , Dv , De , DD , Do , Dg , Ds ,
//        oI , oL , oo , ov , oe , oD , oo , og , os ,
//        gI , gL , go , gv , ge , gD , go , gg , gs ,
//        sI , sL , so , sv , se , sD , so , sg , ss ,
public class StringPatternAndConcat2  {

    public static void main(String[] args) {

        String s="I Love Dogs";
        String result = "";

        String strTrim = s.replaceAll(" ", "");
        System.out.println(strTrim);
        for (int i = 0; i < strTrim.length(); i++) {

            for (int j = 0; j < strTrim.length(); j++) {

                System.out.print(result+strTrim.charAt(i)+strTrim.charAt(j)+" , ");
            }
            System.out.println();
        }


    }

}
