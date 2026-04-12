package Basics;

public class WiproL1 {
    public static void main(String[] args) {
        String s="7.1 years experience in software testing & qA professional with around in testing web based Applications and rEST aPI testing . good understanding of software development life cycle (SDLC), software testing life cycle (STLC)";
        String [] str=s.split(" ");
        String result="";
        for(int i=0;i<str.length;i++){
            String word=str[i]+" ";
            for(int j=0;j<word.length();j++){
                if(j==0){
                    result=result+Character.toUpperCase(word.charAt(j));
                }
                else{
                    result=result+word.charAt(j);
                }
            }

        }
        System.out.println("Input :"+s);
        System.out.println("Output: "+result);
    }
}
