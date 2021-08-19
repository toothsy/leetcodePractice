package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class task{
    Integer start,end;
    public task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
public class intervalCovering {
    public static void main(String[] args) {
        int [] tasks = new int[]{0,3,3,4,6,9,2,6,2,3,7,8,7,9};
        int[][] TwoDLine = new int [][]{{0, 3}, {3, 4}, {6, 9}, {2, 6}, {2, 3}, {7, 8}, {7, 9}};
        task [] taskArray = new task[tasks.length/2];
        for (int i=0;i< tasks.length;i+=2){
            taskArray[i/2]= new task(tasks[i],tasks[i+1]);
        }
        Arrays.sort(TwoDLine,(o1,o2)->Integer.compare(o1[1],o2[1]));
        Arrays.sort(taskArray, Comparator.comparingInt(o -> o.end));
//        System.out.println(Arrays.toString(taskArray));
        for (int[] e:TwoDLine) {
            System.out.print("\n"+e[0]+" "+e[1]);
        }

        System.out.println("\nvisits  "+leastIntervals(taskArray));
    }



    public static ArrayList<Integer> leastIntervals(task[] taskArray){
    ArrayList<Integer> visits = new ArrayList<>();
    visits.add(taskArray[0].end);
    int lastVisit =  taskArray[0].end;
    for(int i=0;i<taskArray.length-1;i++){
        if(taskArray[i].start>lastVisit ) {//greedy choice
            visits.add(taskArray[i].start);
            lastVisit = taskArray[i].start;// choosing new one as the previous can only be visited till here
        }
    }
    return visits;
    }
}
