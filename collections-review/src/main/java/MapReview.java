import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergiu");
        map.put(2,"Moses");
        System.out.println(map.get(2));

      // find first non-repeating char in a string
        System.out.println(firstNonRepeatingChar("deo java developer"));
        
    }
    
    public static Character firstNonRepeatingChar(String str){
        Map<Character,Integer>   map = new HashMap<>();
        int count;
        char result;
        for (Character ch : str.toCharArray()) {
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch, 1);
            }
        }
        for(Character ch : str.toCharArray()){
            if(map.get(ch) ==1 )
                return ch;
        }
        return Character.MIN_VALUE;

    }
}
