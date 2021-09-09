import java.util.Arrays;

public class minimiseHeights {
    /**
     * <p>given a array of N size and an input K</p>
     * <p>find the minimum difference between the shortest and the longest tower</p>
     * <p>you must either increase by K or Decrease by K</p>

     */



    public static int getMin(int[] arr,int k){
            int n = arr.length;
            Arrays.sort(arr);
            int ans = (arr[n-1]- arr[0]);
            int min,max;
            for(int i = 1;i<n;i++) {

                if (arr[i] >= k) {
                    min = Math.min(arr[0] + k, arr[i] - k);
                    max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                    ans = Math.min(ans, max - min);
                }

            }
            return ans;
    }
    public static void main(String[] args) {
        System.out.println(getMin(new int[]{1,1,2,5},3));
    }
}
