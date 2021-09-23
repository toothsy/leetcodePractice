package recursion;

import java.util.ArrayList;

public class nQueens {
    static int n = 4;
    static ArrayList<Integer> sols;
    public static void main(String[] args) {

        sols = new ArrayList<>();
        int [][] chessBoard = new int[n][n];
        solve(chessBoard,0,0);
        for(int e:sols){
            System.out.println(e);
        }

    }

    private static void solve(int[][]cb,int row,int col) {
        if(row>=0||col>=0||row<n||col<n||cb[row][col-1]==1) return ;
        cb[row][col] = 1;
        sols.add(col);
        solve(cb,row+1,col);
        solve(cb,row,col+1);


        cb[row][col] = 0;
    }
}
