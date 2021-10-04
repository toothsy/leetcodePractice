import java.util.Arrays;

public class targetSum {
    public static void main(String[] args) {
        int[] arr= {1,2,4,2,2,3,4,5,3,2,6};
        int target = 12;
        System.out.println(Arrays.toString(findT(arr,target)));
    }

    private static int[] findT(int[] arr, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans,-1);

        int start =0,window=0;
        for(int i =0;i<arr.length;i++){
            if(window == target) break;
            else if(window<target)
            window += arr[i];
        }


        return ans;
    }
}
