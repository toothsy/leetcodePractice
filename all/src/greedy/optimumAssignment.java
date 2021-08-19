import java.util.Arrays;
class pairedTask{
    int first , second;
    pairedTask(int f, int s){
        first=f;
        second=s;
    }

    @Override
    public String toString() {
        return "pairedTask{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
public class optimumAssignment {
    /*
        we have to assign exactly two jobs to workers, no task constraints.
        example say tasks are 5,2,1,6,4,4 find minimum waiting time
     */
    public static void main(String[] args) {
        int[]tasks = new int[]{5,2,1,6,4,4,2,3,5,6,7,7,7,8};
        // solution is pair the first fastest and slowest tasks to a worker
        Arrays.sort(tasks);
        pairedTask[] arr = new pairedTask[tasks.length/2];
        for(int i=0,j=tasks.length-1;i<j;i++,j--){
            arr[i] = new pairedTask(tasks[i],tasks[j]);
        }
        System.out.println(Arrays.toString(arr));

     }
}
