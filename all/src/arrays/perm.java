import java.util.Arrays;

public class perm {

    /**
     * modifies the array to return the next permutation of the given array
     * @param nums array of numbers
     */



    private static void nextPerm(int[] nums) {
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
    public static void swap(int[] nums,int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,3,4,2};
        nextPerm(a);
        System.out.println(Arrays.toString(a));
    }
}
