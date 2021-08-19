import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class pairSum {
    static int [] arr;

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum,boolean unique)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
            // counting their frequency here
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += unique?1:hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (!unique&&sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }

    // Driver method to collectionDemo.test the above function
    public static void main(String[] args)
    {
        arr  = new int[] {3,2,4};
        int sum = 6;
        System.out.println(
                "Count of pairs is "
                        + getPairsCount(arr.length, sum,false));
        System.out.println(
                "Count of pairs is "
                        + Arrays.toString(twoSum(arr, sum)));

    }
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm1 = new LinkedHashMap<>();
        Map<Integer,Integer> hm2 = new LinkedHashMap<>();


        int[] ans = {0,0};

        for(int i =0;i<nums.length;i++) {
            if(hm1.containsKey(nums[i])){
                hm2.put(nums[i],hm1.get(nums[i]));
            }

            hm1.put(nums[i], i);
        }

        for (int num : nums) {
            int secondNum = target - num;
                if (hm1.containsKey(secondNum)) {
                    int secondIndex = hm1.get(secondNum);

                    if(secondNum == num&&hm1.size()!=nums.length)
                        secondIndex = hm2.get(num);
                    ans[0] = hm1.get(num);
                    ans[1] = secondIndex;
                }

        }
        return ans;
    }
}
