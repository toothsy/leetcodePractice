public class revOnlyAlp {
    public static String revAlp(String s){
        char[]chars = s.toCharArray();
        int i =0;
        int j = chars.length-1;
        while(i<j){
            if(Character.isLetter(chars[i])&&Character.isLetter(chars[j])){
                char t = chars[i];
                chars[i] = chars[j];
                chars[j] = t;
                i++;j--;
            }
            else if(Character.isLetter(chars[i]))
                j--;

            else i++;
        }


        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        System.out.println(revAlp("abc-def"));

    }
}
