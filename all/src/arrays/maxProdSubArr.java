public class maxProdSubArr {

    /**
     *
     * @apiNote dunno why it works in second pass
     * @param arr array containing number
     * @param n size of the array
     * @return the max subarray  product of the array
     */
    public static long mpsa(int [] arr, int n ){
        if(n == 0) return 0;
        if(n == 1) return arr[0];
        long maxProd = Integer.MIN_VALUE;
        long currProd = 1;
        for(int i :arr){
            if(i == 0 ){currProd = 1;continue;}
            currProd = currProd*i;
            maxProd = Math.max(currProd,maxProd);
        }
        currProd = 1;
        for(int i = n-1;i>=0;i--){
            if(arr[i] == 0 ){currProd = 1;continue;}
            currProd = currProd*arr[i];
            maxProd = Math.max(currProd,maxProd);
        }
        return maxProd;
    }
    // sol for the least space
    public static int lc(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int prod = max;

        for(int i = 1 ; i < nums.length ; i++){
            if (nums[i] < 0) {
                // swap max and min
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);

            if (prod < max)
                prod = max;
        }

        return prod;
    }
    public static void main(String[] args) {
        int[] a = {90, 91, -91, 91, -91, -90, 90, 90, -90, -90};
        System.out.println(mpsa(a,a.length));
    }
}

