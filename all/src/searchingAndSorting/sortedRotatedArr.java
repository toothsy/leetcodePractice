package searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;

public class sortedRotatedArr {
    /**
     *
     * @param nums rotated array
     * @param target number to check if it exists
     * @return the index of the <code>target</code> if it exists
     */
    public static int search(Integer[] nums,int target){
        int lo = 0, hi = nums.length-1;
        //find the real center
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>nums[hi]) lo = mid+1;
            else hi = mid;
        }
        int rot = lo;
        lo = 0;
        hi = nums.length-1;
        int n = nums.length;

        //normal binary search
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int realMid = (mid+rot)%n;//this is godly
            if(nums[realMid] == target)return realMid;
            if(nums[realMid] > target){
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        Collections.rotate(Arrays.asList(x),5);
        System.out.println(Arrays.toString(x));
        System.out.println(search(x,3));
    }
}
