import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class backtracking {
    static int size ;
    static int totalCalls=0;
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        size = n;
        ArrayList<String> path = new ArrayList<>();
        String action = "";
        bt(m,0,0,path,action);
        return path;

    }
    public static void bt(int[][] m,int row,int col,ArrayList<String> path,String action){
        if(notSafe(row,col,m)) {
            totalCalls++;
            return;
        }
        if(row==(size-1)&&col==(size-1)){
            totalCalls++;path.add(action);return;
        }
        m[row][col] = 0;
        bt(m,row+1,col,path,action+"D");
        bt(m,row,col+1,path,action+"R");
        bt(m,row,col-1,path,action+"L");
        bt(m,row-1,col,path,action+"U");
        m[row][col] =1;
        totalCalls++;
    }
    public static boolean notSafe(int row,int col,int[][] m){
        return row<0||col<0||row>=size||col>=size||m[row][col]==0;
    }

    public static void main(String[] args) {
        int size = 4;
        int[][] mat = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 1}};
        System.out.println(findPath(mat,size));
        System.out.println("total calls   are "+totalCalls);
    }
}
