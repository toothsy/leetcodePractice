package bitManipulation;

import java.util.Arrays;

public class uniqueElements {
    public static void main(String[] args) {
        int[] x = new int[]{1,1,2,2,3,4,6,6};
        System.out.println(Arrays.toString(uniNum(x)));

        System.out.println(repeatThrice(new int[]{1,1,1,2,2,23,3,4,5,2,3,3,4,5,4,5}));
    }

    static int[] uniNum(int[] x) {
        int[] ans = new int[2];
        int xor = 0;
        for(int i :x)
            xor^= i;

        int t = xor;
        int whichBit =0;
        int pos = 0;

        while(whichBit!=1){
            whichBit = xor&1;
            xor = xor>>1;
            pos++;

        }

        int mask = 0;
        for(int i :x){
            if((i&(1<<pos))!=0)
                mask^=i;

        }
        ans[0]= mask;
        ans[1] = t^mask;
        return ans;
    }
    static  int repeatThrice(int [] x ){
        int[] buckets = new int[32];
        for(int i = 0;i<32;i++){
            for (int k : x) {
                if ((k & (1 << i)) != 0) ++buckets[i];
            }

        }
        int res = 0;
        for(int i = 0;i<32;i++){
            res += (buckets[i]%3)*(1<<i);
        }

        return  res;
    }
}
