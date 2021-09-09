public class arrayNesting {
    public static int an(int[] nums){

        if(nums.length == 0) return 0;
        int k = nums[0];
        if(k>=nums.length||k==0) return 1;
        int count = 0;
        int i =0;
        boolean[] seen = new boolean[nums.length];
        while(i<nums.length && !seen[i] ){
            if(!seen[i]) seen[i] = true;
            i = nums[i];
            count++;

        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(an(new int[]{5,4,0,3,1,6,2}));

    }
}
