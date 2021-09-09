import java.util.Arrays;

public class twoSum {
    public static int[] tS(int[] a, int target) {
        int[] ans = new int[2];
        if(target == 0){
            ans[0]=1;
            ans[1]=2;
            return ans;
        }

        for(int i =0;i<a.length;i++ ){
            int t = Arrays.binarySearch(a,target-a[i]);
            if(a[i]==(target-a[i])){
                ans[0] = i+1;
                ans[1] = i+2;
                break;
            }
            if(t>i ){
                ans[0] = i+1;
                ans[1] = t+1;
                break;
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("indexes are "+Arrays.toString(tS(new int[]{1,2,4,10,13,20,23,30},53)));
    }
}
