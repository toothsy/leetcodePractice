import java.util.ArrayList;

public class SpiralMatricTraversal {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int down = r-1;
        int left = 0;
        int right = c-1;
        int dir = 0;
        while(left<=right&&top<=down){
            if(dir ==0){
                for(int i = left;i<=right;i++)
                    ans.add(matrix[top][i]);
                top++;
            }
            else if(dir == 1){
                for(int i = top;i<=down;i++)
                    ans.add(matrix[i][right]);
                right--;
            }
            else if(dir == 2 ){
                for(int i = right;i>=left;i--)
                    ans.add(matrix[down][i]);
                down--;
            }
            else if(dir == 3){
                for(int i = down ;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
            }
            dir = (dir+1)%4;

        }

        return ans;
    }

    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int[][]matrix = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        System.out.println(matrix[0].length);
        ArrayList<Integer> ans = spirallyTraverse(matrix,r,c);
        System.out.println(ans);


    }
}
