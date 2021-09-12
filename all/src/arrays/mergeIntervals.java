import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class mergeIntervals {
    /**
     *
     * @param intervals contains array element of size 2 with start and end time
     *
     * @return array containing the merged intervals<br/>
     *
     * tc: O(nlogn)
     */

    static public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        for(int[] e :intervals)
            System.out.print(Arrays.toString(e)+",");

        System.out.println("\noutput:");
        ArrayList<int[]> ans = new ArrayList<>() ;
        int[] newInterval = intervals[0];
        ans.add(newInterval);
        for(int [] interval:intervals){
            if(newInterval[1]>=interval[0]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval = interval;
                ans.add(newInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,9},{2,5},{19,20},{10,11},{12,20},{0,3},{0,1},{0,2}};
        for(int[] e :merge(intervals) )
        System.out.println(Arrays.toString(e));
    }
}
