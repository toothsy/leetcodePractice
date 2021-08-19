import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class intervalOverlapping {

    public static int[][] getOverlap(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        ArrayList<int[]> ans = new ArrayList<>() ;
        int[] newInterval = intervals[0];
        ans.add(newInterval);
        for(int [] interval:intervals){
            if(newInterval[1]<interval[0]){
                newInterval = interval;
                ans.add(newInterval);
            }
            else{
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{5,6},{1,3},{3,5},{7,9},{8,9}};


        for(int[] e :getOverlap(intervals))
        System.out.println(Arrays.toString(e));
    }
}
