public class printAllSubSeq {
    public static void pss(String str){
        String ans;
        for( int i =0 ; i< str.length();i++) {
            ans = "";
            ans = ans + str.charAt(i);
            System.out.println(ans);
            for (int j = i + 1; j < str.length(); j++) {

                ans = ans + str.charAt(j);
                System.out.println(ans);
            }
        }
    }
    public static void main(String[] args) {
        pss("abcdef");
    }
}
