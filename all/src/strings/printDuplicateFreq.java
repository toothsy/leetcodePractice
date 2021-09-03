import java.util.Collections;
import java.util.HashMap;

public class printDuplicateFreq {
    public static void printDuplicates(String s){
        char[] c = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char value : c) {
            hm.merge(value, 1, Integer::sum);
        }
        for(Character el :hm.keySet()){
            if(hm.get(el)>1)
                System.out.println(el +" count is "+hm.get(el));

        }
    }
    public static void main(String[] args) {
        String s = "aabbccaddasvxxx";
        System.out.println(s);
        printDuplicates(s);
        System.out.println(s);
    }
}
