public class stringCompress {
    public static String compress(String inp){

        int index = 0;
        StringBuilder ans = new StringBuilder();
        while(index<inp.length()){
            ans.append(inp.charAt(index));
            int countIndex = index+1;
            int count = 1;
            while(countIndex<inp.length()&&inp.charAt(index)==inp.charAt(countIndex)) {
                count++;
                countIndex++;
            }
            ans.append(count);
            index += count;

        }

        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(compress("A"));
    }
}
