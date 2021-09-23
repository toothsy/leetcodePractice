public class maxJumps {
    public static void main(String[] args) {
        int [] arr = {15,3,9,5,3};

        System.out.println(mj(arr));
    }

    private static int mj(int[] arr) {
        int right = arr.length-2;
        int js =0;
        int maxJs = 0;
        while(right>=0){
            if(arr[right]>arr[right+1]){
                js++;
                maxJs = Math.max(maxJs,js);
            }
            else js = 0;
            right--;
        }
        return maxJs;
    }
}
