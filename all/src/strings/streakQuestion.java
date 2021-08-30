public class streakQuestion {
    public static int gymStreak(String s){
        int maxStreak = -1;
        for(int i =0;i<s.length();i++){
            int countZeroes = 0;
            int streak = 1;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(j) == '0') {
                    countZeroes++;
                }
                if(countZeroes>1) break;
                streak++;
                maxStreak = Math.max(streak, maxStreak);
            }
        }

        return maxStreak;


    }
    public static void main(String[] args) {
        System.out.println(gymStreak("10011"));
    }
}
