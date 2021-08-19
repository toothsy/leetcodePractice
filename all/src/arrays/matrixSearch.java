import java.util.Arrays;

public class matrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean answer = false;
        for(int[] ele:matrix){
            boolean t = Arrays.binarySearch(ele,target)>0;
            answer = answer||t;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 34;
        System.out.println(searchMatrix(mat,key));
    }
}
