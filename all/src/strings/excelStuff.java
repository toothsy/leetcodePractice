public class excelStuff {
    public static String convertToTitle(int c) {
        StringBuilder sb = new StringBuilder();
        while(c!=0){
            c--;
            sb.append((char)('A'+ c%26));
            c /=26;

        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String t = convertToTitle(702);
        System.out.println(t);
        System.out.println(titleToNumber(t));
    }

    public static int titleToNumber(String ct) {
        char[] alps = ct.toCharArray();
        int num = 0;
        for (char alp : alps) {
            num *= 26;
            num += alp - 64;
        }
        return num;
    }

}


