public class numberOfIslands {
    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0,0,1,1,0,0},
                {0,0,1,0,0,1},
                {1,0,1,0,1,0},
                {0,1,0,1,1,0},
                {0,0,1,1,1,0},
                {1,1,1,1,1,1}};
        System.out.println("total number of islands are "+findIslands(graph));

    }

    private static int findIslands(int[][] graph) {
        int islands  = 0;
        for(int i = 0;i<graph.length;i++){
            for(int j =0;j<graph[0].length;j++){
                if(graph[i][j] == 1){
                    islands++;
                    checkNeighbours(graph,i,j);
                }
            }
        }
        return  islands;

    }

    private static void checkNeighbours(int[][] graph, int i, int j) {
        if(i<0||i>=graph.length || j<0 ||j>=graph[0].length|| graph[i][j] == 0) return;

        graph[i][j] = 0;
        checkNeighbours(graph,i+1,j);
        checkNeighbours(graph,i,j+1);
        checkNeighbours(graph,i-1,j);
        checkNeighbours(graph,i,j-1);

    }
}
