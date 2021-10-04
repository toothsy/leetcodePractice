public class findDupli {
    /**
     * <p>here you have <strong>n+1</strong> elements and the <strong>elements range from [1,n]</strong> </p>
     * <p> there is one duplicate element, find it without modifying array and constant space</p>
     *
     * @param nums integer array
     * @return duplicate
     */
    public static int fd(int[] nums){
        int tortoise = nums[0];
        int hare = nums[0];
        int iter = 0;
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            iter++;
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            iter++;

            hare = nums[hare];
        }
        System.out.println("total iterations are "+ iter);
        return hare;


    }
    public static void main(String[] args) {
        System.out.println(fd(new int[]{1,3,4,2,2}));
    }
}
