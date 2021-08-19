import java.util.ArrayList;

public class robotMove {
    /*
    this question is from gayle laakman
    here i have a robot that moves only in right or down.
   it starts from top left and needs to reach bottom right.

    * */
    static class point{
        int row;
        int col;
        public point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "{" + row +"," + col +'}';
        }
    }
    public static ArrayList<point> getPath(Boolean[][]maze){
        if(maze.length==0||maze==null)return null;
        ArrayList<point> path = new ArrayList<>();

        if(getPath(maze,maze.length-1,maze[0].length-1,path))
            return path;
        return  null;
    }
    public static Boolean getPath(Boolean[][]maze,int row,int col,ArrayList<point> path){
        if(col<0||row<0||!maze[row][col])return false;
        boolean atOrigin=col==0&&row==0;
        if(atOrigin || getPath(maze,row-1,col,path)||getPath(maze,row,col-1,path)){
            point p = new point(row,col);
            path.add(p);
            return  true;
        }
        return false;

    }
    public static void main(String[] args) {
        Boolean[][] maze = new Boolean[][]{
                {true,true,false,false},
                {false,true,false,false},
                {false,true,false,false},
                {false,true,true,true}};
        ArrayList<point> path = getPath(maze);
        System.out.println(path);
    }
}
