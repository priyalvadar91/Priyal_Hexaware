package Basics;

import javax.print.DocFlavor;
//input : I Love Dogs
//output:
//        IL , Io , Iv , Ie , ID , Io , Ig , Is , IA , In , Id , IC , Ia , It , Is ,
//        LI , Lo , Lv , Le , LD , Lo , Lg , Ls , LA , Ln , Ld , LC , La , Lt , Ls ,
//        DI , DL , Do , Dv , De , Do , Dg , Ds , DA , Dn , Dd , DC , Da , Dt , Ds ,
//        AI , AL , Ao , Av , Ae , AD , Ao , Ag , As , An , Ad , AC , Aa , At , As ,
//        CI , CL , Co , Cv , Ce , CD , Co , Cg , Cs , CA , Cn , Cd , Ca , Ct , Cs ,

public class StringConcatAndConcat7 {
    public static void main(String[] args) {
        String s="I Love Dogs And Cats";
        String result="";
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if (i!=j && Character.isUpperCase(s.charAt(i))  && !Character.isWhitespace(s.charAt(i)) && !Character.isWhitespace(s.charAt(j))) {

                    System.out.print(result+s.charAt(i) + s.charAt(j) + " , ");
                }

            }

            if(Character.isUpperCase(s.charAt(i))) {
                System.out.println();
            }

        }
    }
}
