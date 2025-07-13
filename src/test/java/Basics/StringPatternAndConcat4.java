package Basics;
//input:  I Love Dogs
//Output:
//        IL,Io,Iv,Ie,ID,Io,Ig,Is,IA,In,Id,IC,Ia,It,Is,
//        LI,Lo,Lv,Le,LD,Lo,Lg,Ls,LA,Ln,Ld,LC,La,Lt,Ls,
//        DI,DL,Do,Dv,De,Do,Dg,Ds,DA,Dn,Dd,DC,Da,Dt,Ds,
//        AI,AL,Ao,Av,Ae,AD,Ao,Ag,As,An,Ad,AC,Aa,At,As,
//        CI,CL,Co,Cv,Ce,CD,Co,Cg,Cs,CA,Cn,Cd,Ca,Ct,Cs,

public class StringPatternAndConcat4 {

    public static void main(String[] args) {
        String s="I Love Dogs";
        String str = s.replaceAll(" ","");
        String result="";

        System.out.println(str);
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i!=j && Character.isUpperCase(str.charAt(i))){
                    System.out.print(result+str.charAt(i)+str.charAt(j)+", ");
                }


            }
            if(Character.isUpperCase(str.charAt(i))){

                System.out.println();
            }



        }
}}
