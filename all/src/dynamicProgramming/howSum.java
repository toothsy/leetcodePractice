import java.util.ArrayList;
import java.util.HashMap;

public class howSum {

    public static  ArrayList<Integer> hs(int target,int[] numbers) {
        if(target==0) {
            return new ArrayList<>();
        }

        if(target<0)
            return null;
        ArrayList<Integer> shortestSum = new ArrayList<>();
        for(int num : numbers){
            int rem = target- num;

            shortestSum = hs(rem,numbers);
            if(shortestSum!=null){
                shortestSum.add(num);
                return shortestSum;
            }

        }
        return null;
    }
    public static  ArrayList<Integer> hsMemo(int target,int[] numbers,HashMap<Integer,ArrayList<Integer>> memo) {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target==0) {
            return new ArrayList<>();
        }
        if(target<0)
            return null;
        ArrayList<Integer> shortestSum ;
        for(int num : numbers){
            int rem = target- num;

            shortestSum = hsMemo(rem,numbers,memo);
            if(shortestSum!=null){
                shortestSum.add(num);
                memo.put(target,shortestSum);
                return memo.get(target);
            }

        }
        memo.put(target,null);
        return memo.get(target);
    }
    public static  ArrayList<Integer> uniqueHS(int target,int[] numbers,int start) {
        if(target==0) {
            return new ArrayList<>();
        }

        if(target<0)
            return null;
        ArrayList<Integer> shortestSum = new ArrayList<>();
        for(int i=start;i<numbers.length-start;i++){
            int rem = target- numbers[i];

            shortestSum = uniqueHS(rem,numbers,start+1);
            if(shortestSum!=null){
                shortestSum.add(numbers[i]);
                return shortestSum;
            }

        }
        return shortestSum;
    }
    public static void main(String[] args) {
        HashMap<Integer,ArrayList<Integer>> memo = new HashMap<>();
        long start = System.nanoTime();
        System.out.println(hsMemo(7, new int[]{3, 4,2, 5,7},memo));
        long stop = System.nanoTime();
        System.out.println(stop-start);

        start = System.nanoTime();
        System.out.println(hs(7, new int[]{3, 4,2, 5,7}));
        stop = System.nanoTime();
        System.out.println(stop-start);
    }
}
