package gotchas;

import java.util.Arrays;

public class nextPermutation {
    public static  void swap(int[] nums,int i, int j){
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
}
    public static void nextPerm(int[] nums) {
        if(nums.length==1)
            return;
        int lastIndex = nums.length-1;
        int j = lastIndex - 1;
        while(j>=0&&nums[j]>=nums[j+1])
            j--;
        int i = lastIndex;
        if(j>=0){
            while(i>=0&&nums[j]>=nums[i])i--;
                swap(nums,i,j);
                int start = j+1;
                int end = lastIndex;
                while(start<=end){
                    swap(nums,start,end);
                    start++;end--;
                }
        }
        else{
            Arrays.sort(nums);
        }
    }

    public static void main(String[] args) {
        int [] nums = {3,4,6,7,4,3,2};


        nextPerm(nums);
        System.out.println(Arrays.toString(nums));
    }
}
