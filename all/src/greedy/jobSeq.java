package greedy;

import java.util.Arrays;

public class jobSeq {
    static class jobDS{
        int id, profit, deadline;
        public jobDS(int id,int deadline,int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }


        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", deadline=" + deadline +
                    ", profit=" + profit +
                    "}";
        }
    }

    public static void main(String[] args) {
        int[] inp = new int[]{1,4,20,2,1,10,3,100,40,4,1,30,5,3,40};

        jobDS[] jobsArray = new jobDS[inp.length/3];

        for(int i=0,j=0; i<jobsArray.length&&j<inp.length; i++,j+=3){
            jobsArray[i] = new jobDS(inp[j],inp[j+1],inp[j+2]);
        }

        int[] ans = JobScheduling(jobsArray, jobsArray.length);
        System.out.println(Arrays.toString(ans));
    }
    static int[] JobScheduling(jobDS[] jobArray, int n)     {

        int [] ans = new int[2];
        Arrays.sort(jobArray,(a,b)->Integer.compare(b.profit,a.profit));// sorting based on the profit in descending order
        System.out.println(Arrays.toString(jobArray));
        boolean[] SelectedJob= new boolean[n];

        for(int i =0;i<n;i++){
            for(int j=Integer.min(n-1,jobArray[i].deadline-1);j>=0;j--) {//choosing j based on the deadline
                if (!SelectedJob[j]) {// if not chosen
                    System.out.println(j+1);
                    System.out.println();
                    ans[0]++;// increment the counter
                    ans[1] += jobArray[i].profit;//profit badhao
                    SelectedJob[j] = true;// set this slot as taken
                System.out.println(Arrays.toString(SelectedJob));
                    break;
                }
            }
        }
        return  ans;

    }
}
