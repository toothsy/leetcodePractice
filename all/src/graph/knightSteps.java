// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class knightSteps{
    static int size=0;
    static boolean[][] visited;
    public static int minStepToReachTarget(int KP[], int TP[], int N){
        int targetRow=TP[0];
        int targetCol=TP[1];
        Integer[] initialPos = new Integer[]{KP[0],KP[1],0};
        visited = new boolean[N+1][N+1];
        size = N;
        Queue<Integer[]> q= new LinkedList<>();

        q.add(initialPos);
        Integer[] row = new Integer[]{-2,-2,-1,-1,1,1,2,2};
        Integer[] col = new Integer[]{-1,1,-2,2,-2,2,-1,1};
        visited[initialPos[0]][initialPos[1]] = true;

        while(!q.isEmpty()){
            Integer[] curr = q.poll();
            if(curr[0]==targetRow&&curr[1]==targetCol){
                // System.out.println(calX+"  "+calY+"  "+curr[2]);
                return curr[2];
            }
            for(int i=0;i<8;i++){
                int calX = curr[0]-row[i];int calY = curr[1]-col[i];
                if(isSafe(calX,calY)){
                    visited[calX][calY]=true;
                    q.add(new Integer[]{calX,calY,curr[2]+1});//dont do ++curr[2], you dont want it to be updated
//                     System.out.println(calX+"  "+calY+"  "+curr[2]);
                }
            }
        }

        return 0;
    }
    public static boolean isSafe(int row, int col){
        return row>=1&&col>=1&&row<=size&&col<=size&&!visited[row][col];
    }
    public static void main(String[] args) {

            int N = 7;
            int[] KnightPos = new int[]{1,1};
            int[] TargetPos = new int[]{7, 5};
            int ans = knightSteps.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
    }
}