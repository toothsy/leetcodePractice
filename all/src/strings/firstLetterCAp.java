import java.util.Arrays;

public class firstLetterCAp {

    public static String flc(String s){

        char[] words = s.toCharArray();
        boolean space = true;
        for(int i = 0;i<words.length;i++){
            if(Character.isLetter(words[i])) {
                if (space) {
                    words[i] = Character.toUpperCase(words[i]);
                    space = false;
                }
            }
            else space = true;
        }
        return new String(words);
    }
    public static void main(String[] args) {
        System.out.println(flc("hello there this is fine"));
    }
}
