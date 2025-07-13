package Basics;
//input:  I Love Dogs
//Output:
//        IL, Io, Iv, Ie, ID, Io, Ig, Is,
//        LI, Lo, Lv, Le, LD, Lo, Lg, Ls,
//        DI, DL, Do, Dv, De, Do, Dg, Ds,


public class StringPatternAndConcat4 {

    public static void main(String[] args) {
        String s = "I Love Dogs";
        String str = s.replaceAll(" ", "");
        String result = "";

        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && Character.isUpperCase(str.charAt(i))) {
                    System.out.print(result + str.charAt(i) + str.charAt(j) + ", ");
                }


            }
            if (Character.isUpperCase(str.charAt(i))) {

                System.out.println();
            }


        }
    }
}
