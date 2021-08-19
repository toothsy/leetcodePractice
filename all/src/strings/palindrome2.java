public class palindrome2 {
    public static int pal2(String s){
        int cuts = 0;
        int start = 0 ;
        int end = s.length()-1;
        char[] chars = s.toCharArray();
        while(start<=end){
            if(chars[start] == chars[end]){
                start++;end--;
            }
            else {
                cuts++;
                start++;
            }
        }

        if(cuts == 0) return 0;
        else {
            start  = 0;
            end = 1;
            cuts = 0;
            while (end<s.length()) {
                if(chars[start] == chars[end])
                    end++;

                else {
                    int nextCharAtStart = s.indexOf(chars[start],start+1);
                    if(nextCharAtStart>0){
                        end = nextCharAtStart;
                        while(start<=nextCharAtStart) {
                            if (chars[start] == chars[nextCharAtStart]) {
                                start++;nextCharAtStart--;
                            } else {cuts++;start++;
                            }
                        }
                        start = end;
                        end++;
                    }
                    else{
                        cuts++;
                        start = end;
                        end++;
                    }
                }
            }
        }
        return cuts;
    }
    public static void main(String[] args) {
        System.out.println(pal2("cabababcbc"));
    }
}
