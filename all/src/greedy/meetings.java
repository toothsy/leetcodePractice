import java.util.Arrays;
import java.util.Comparator;

public class meetings {
    public static void main(String[] args) {
        int[] start = new int[]{1,3,0,5,8,5};
        int[] end = new int[]{2,4,6,7,9,9};
        System.out.println(maxMeeting(start,end,6)
        );
    }
    public static class meet{
        int start;
        int end;
        meet(int s, int f){
            start=s;
            end = f;
        }

        @Override
        public String toString() {return "{"+start +","+ end+"}" ;}
    }
    public static int maxMeeting(int[]start, int[] end, int n){
        meet[] meetingArray = new meet[n];
        for(int i=0;i<n;i++){
            meetingArray[i] = new meet(start[i],end[i] );
        }
        // grouping them so that they start and end stay together
        Arrays.sort(meetingArray, Comparator.comparingInt(o -> o.end));
        //sorting the meeting array based on the end timings
        // first activity always gets selected
        int meets=1;
        int j=0;// to keep track of the successfully selected acitivity
        for(int i = 1;i<n;i++){
            if(meetingArray[j].end<meetingArray[i].start){
                j=i;// to move the activity
                meets++;// increment the counter as meeting meets the requirement
            }
        }


        System.out.println(Arrays.toString(meetingArray));

        return meets;
    }

}
