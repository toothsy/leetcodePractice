package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class persistent {



    public static int[] evenArrange(int [] arr){
        //arrange even first and odd later, relative order must be maintained
        int [] ans = new int[arr.length];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0)
                even.add(j);
            else
                odd.add(j);
        }
        int i =0;
        for(int e :even) {
            ans[i] = e;
            i++;
        }
//        i--;
        for(int e:odd){
            ans[i] = e;
            i++;
        }


        return ans;


    }
    public static int uncommon(int []l1,int[] l2){
        //given two arrays find the uncommon elements
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int e:l1){
            if(!hm1.containsKey(e))
                hm1.put(e,1);
            else
                hm1.put(e,hm1.get(e)+1);

        }
        for(int e:l2){
            if(!hm2.containsKey(e))
                hm2.put(e,1);
            else
                hm2.put(e,hm2.get(e)+1);
        }

        int count = 0;
        for(int key :hm1.keySet())
            if(!hm2.containsKey(key))
                count++;
        for(int key :hm2.keySet())
            if(!hm1.containsKey(key))
                count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenArrange(new int[]{43, 6, 2, 1, 4, 6, 5, 7})));

        System.out.println(uncommon(new int[]{1,1,2,3,4},new int[]{4,5,6,7,1,7}));
    }
}
