public class longestCommonPrefix {
    public static String lCP(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
            System.out.println("\n\n");
        }
        return prefix;
    }
    public static String lcpBF(String[] strs){
        if(strs.length==1)
            return strs[0];
        String subs = "";
        int minJ=201;
        for(int i =1;i<strs.length;i++){
            int j=0;
            while(j<=Math.min(strs[i].length()-1,strs[i-1].length()-1)&&strs[i].charAt(j)==strs[i-1].charAt(j))
                j++;
            if(j==0){
                subs="";
                break;
            }
            if(minJ>j) minJ = j;
            subs = strs[i].substring(0,minJ);

        }
        return subs;
    }

    public static void main(String[] args) {
        System.out.println(lCP(new String[]{"hellokjbkjgkjg","hell","he"}));
    }
}
