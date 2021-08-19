import java.util.Arrays;

public class medianRowWiseSorted {
    static int median(int[][] m, int r, int c) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<r ;i++){
            min = Integer.min(min,m[i][0]);
            max = Integer.max(m[i][c-1],max);
        }

        int desired = (r * c + 1) / 2;
        while(min < max)        {
            int mid = min + (max - min) / 2;
        int place = 0;
        int get;
        for(int i = 0; i < r; ++i){
            get = Arrays.binarySearch(m[i],mid);
            if(get < 0)
                get = Math.abs(get) - 1;
            else{
                while(get < m[i].length && m[i][get] == mid)
                    get += 1;
            }
            place = place + get;
        }
        if (place < desired)
            min = mid + 1;
        else
            max = mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 3, 5}, {2, 6, 9},{3, 6, 9}};
        System.out.println(median(mat,mat.length,mat[0].length));
    }
}
