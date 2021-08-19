package company;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class INFOSYSsample {


    static int monsters;

    public static void main(String[] args) throws IOException {
        File inp = new File("C:\\Users\\Administrator\\Desktop\\intelliJProjects\\all\\src\\company\\inp.txt");
        BufferedReader x  = new BufferedReader(new FileReader(inp));
        monsters = Integer.parseInt(x.readLine());
        int exp = Integer.parseInt(x.readLine());
        int[] power = new int[monsters];
        int[] bonus = new int[monsters];
        for(int i=0;i<monsters;i++)
            power[i] = Integer.parseInt(x.readLine());
        for(int i=0;i<monsters;i++)
            bonus[i] = Integer.parseInt(x.readLine());
        System.out.println("maximum monster that can be fought are "+getMonsters(exp,power,bonus));

        int N = 2;
        int K = 3;
        int count=0;
        System.out.println("arrays possible are "+getSubarryas(N,K,1,count));


        System.out.println(Arrays.toString(singleNumber(new int[]{1, 1, 2, 2, 56, 7,102,7})));


    }


    private static int getMonsters(int exp,int[] power,int[] bonus) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int answer=0;
        for(int i=0;i<monsters;i++)
            hm.put(power[i],bonus[i] );
        Integer[] keySet = new Integer[monsters];
        keySet= hm.keySet().toArray(keySet);
        Arrays.sort(keySet);

        for(Integer p:keySet){
            if(exp>=p){
                exp+=hm.get(p);
                answer++;
            }
            else{
                break;
            }
        }

        return answer;
        }
    private static int getSubarryas(int n, int k,int parent,int count) {
        if(k==0) {
            count = (count + 1) % 10000;
            return count;
        }
        for(int i = parent;i<=n;i++)
            if(i%parent == 0)
                count = getSubarryas(n,k-1,i,count);
        return count;
    }
    public static int[] singleNumber(int[] nums){
        // Code here
        int[] ans = new int[2];
        int xorRes = nums[0];
        for(int i =1;i<nums.length;i++)
            xorRes =xorRes^nums[i];
        int n = xorRes&-xorRes;//getting the bit mask
        for(int i :nums){
            if((n&i)==0)
                ans[0]^=i;
            else
                ans[1]^=i;
        }
        Arrays.sort(ans);
        return ans;
    }

}
