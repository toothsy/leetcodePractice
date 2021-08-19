package bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class bitStuff {

    public static void main(String[] args) {
        int i  = 128;
        System.out.println("is "+i+" power of 2 : "+isPowerOf2(i));
        System.out.println("number of set bits in "+i+" is/are "+numOfOnes(i));
        int[] arr = new int[]{1,2};
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        subs(arr,arr.length,al);


        System.out.println(al);

    }

    private static void subs(int[] arr, int length,ArrayList<ArrayList<Integer>> al) {
        for(int i =0;i<1<<length;i++){
            al.add(new ArrayList<>());
            for(int j= 0;j<length;j++){
                if((i&1<<j)>0)
                    al.get(i).add(arr[j]);
            }
        }

    }

    private static int numOfOnes(int i) {
        int count = 0;

        while(i!=0) {
            i = i & (i - 1);
            count++;
        }
        return count;
    }

    private static boolean isPowerOf2(int i) {
        return (i&(i-1))==0;
    }
}
