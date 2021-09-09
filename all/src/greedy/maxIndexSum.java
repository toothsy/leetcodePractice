package greedy;

import java.util.Arrays;

public class maxIndexSum {

    /**
     * Input : Arr[] = {5, 3, 2, 4, 1}
     * Output : 40
     * Explanation:
     * If we arrange the array as 1 2 3 4 5 then
     * we can see that the minimum index will multiply
     * with minimum number and maximum index will
     * multiply with maximum number.
     * <h2>So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40</h2>
     */

    public static int mis(int[] arr){
        Arrays.sort(arr);
        long maxSum = 0;
        int mod = (int)1e9+7;
        for(int i =0;i<arr.length;i++){
            maxSum = (maxSum+i*((long)arr[i]))%mod;
        }
        return (int)(maxSum);
    }
    public static void main(String[] args) {
        System.out.println(mis(new int[]{4,7,5,2,1,56,9,4,3,96,8,74,1,6}));
    }
}
