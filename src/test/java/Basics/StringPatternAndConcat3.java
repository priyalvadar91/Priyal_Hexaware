package Basics;

//Input: I Love Dogs
//Output:
//        IL , Io , Iv , Ie , ID , Io , Ig , Is ,
//        LI , Lo , Lv , Le , LD , Lo , Lg , Ls ,
//        oI , oL , ov , oe , oD , oo , og , os ,
//        vI , vL , vo , ve , vD , vo , vg , vs ,
//        eI , eL , eo , ev , eD , eo , eg , es ,
//        DI , DL , Do , Dv , De , Do , Dg , Ds ,
//        oI , oL , oo , ov , oe , oD , og , os ,
//        gI , gL , go , gv , ge , gD , go , gs ,
//        sI , sL , so , sv , se , sD , so , sg ,
public class StringPatternAndConcat3 {
    public static void main(String[] args) {

        String s = "I Love Dogs";
        String result = "";

        String strTrim = s.replaceAll(" ", "");
        System.out.println(strTrim);
        for (int i = 0; i < strTrim.length(); i++) {

            for (int j = 0; j < strTrim.length(); j++) {
                if (i != j) {
                    System.out.print(result + strTrim.charAt(i) + strTrim.charAt(j) + " , ");
                }
            }
            System.out.println();

        }


    }
}
