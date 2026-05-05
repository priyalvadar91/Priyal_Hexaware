import java.util.HashMap;
import java.util.Map;

public class WiproL1 {
    public static void main(String[] args) {
        String s= "  46    FGhjgvhjgjk  78*&  ";
        HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
            }
            else{
                hashmap.put(s.charAt(i),1);
            }

        }

        for(Map.Entry<Character,Integer> entry : hashmap.entrySet()){
            if(Character.isLetter(entry.getKey())){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
