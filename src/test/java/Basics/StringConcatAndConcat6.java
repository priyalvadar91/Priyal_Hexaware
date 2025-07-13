package Basics;
//input  : I Love Dogs
//output :
//        IL , Io , Iv , Ie , ID , Io , Ig , Is ,
//        LI , Lo , Lv , Le , LD , Lo , Lg , Ls ,
//        oI , oL , ov , oe , oD , oo , og , os ,
//        vI , vL , vo , ve , vD , vo , vg , vs ,
//        eI , eL , eo , ev , eD , eo , eg , es ,
//        DI , DL , Do , Dv , De , Do , Dg , Ds ,
//        oI , oL , oo , ov , oe , oD , og , os ,
//        gI , gL , go , gv , ge , gD , go , gs ,
//        sI , sL , so , sv , se , sD , so , sg ,
public class StringConcatAndConcat6 {
    public static void main(String[] args) {
        String s= "I Love Dogs";
        String result="";

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if (i!=j && !(Character.isWhitespace(s.charAt(i))) && !(Character.isWhitespace(s.charAt(j)))) {

                    System.out.print(result+s.charAt(i) + s.charAt(j) + " , ");

                }
            }
            if (!Character.isWhitespace(s.charAt(i))) {
                System.out.println();
            }
        }
    }
}
