public class kadanes {
    static int maxSubarraySum(int [] arr, int n){

        // Your code here
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int j : arr) {
            curSum += j;
            maxSum = Math.max(curSum,maxSum);
            curSum = Math.max(0,curSum);


        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr,arr.length));
    }
}
