import java.util.Arrays;

public class floodFillAlgo {
    static int[][] img;
    static int rowSize;
    static int colSize;
    public static  int[][] floodFill(int[][] image, int sr, int sc, int nc) {
        //nc is new olor
        if(image[sr][sc]==nc)
            return image;

        img = image;
        rowSize = image.length;
        colSize = image[0].length;
        modDfs(sr,sc,image[sr][sc],nc);
        return image;
    }
    private static  void modDfs(int sr, int sc,int color, int nc){
        // color is any color apart from given color at img[sr][sc] and nc , they are all unsafe
        if(isNotSafe(sr,sc,color))return;
        img[sr][sc] = nc;
        modDfs(sr+1,sc,color,nc);
        modDfs(sr-1,sc,color,nc);
        modDfs(sr,sc-1,color,nc);
        modDfs(sr,sc+1,color,nc);

    }
    private static  boolean isNotSafe(int sr,int sc,int color){
        return sr<0||sr>=rowSize|| sc>=colSize || sc<0||img[sr][sc]!=color;
    }

    public static void main(String[] args) {

        int[][] img = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int nc = 2;

        for (int i = 0; i < img.length; i++)
            System.out.println(Arrays.toString(img[i]));
        int[][] ansimg = floodFill(img, sr, sc, nc);
        System.out.println();
        for (int i = 0; i < img.length; i++)
            System.out.println(Arrays.toString(ansimg[i]));

    }
}
