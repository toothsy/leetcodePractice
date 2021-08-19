public class stringRotations {
    public static String countAndSay(int n){
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1, count = 1; j <= s.length(); j++) {
                //count is to see how many times a number is repeated
                if (j == s.length() || s.charAt(j - 1) != s.charAt(j)) {
                    sb.append(count);
                    sb.append(s.charAt(j - 1));
                    count = 1;
                } else {
                    count++;
                }
            }
            s = sb.toString();
        }
        return s;
    }
    public static boolean areRotation(String s1, String s2){
        //here s1's rotation must be s2 else we return false
        // ABCD CDAB are rotations of one another but ABCD CDBA are not
        return s1.concat(s1).contains(s2);
    }
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        System.out.println(countAndSay(i));
    }
}
