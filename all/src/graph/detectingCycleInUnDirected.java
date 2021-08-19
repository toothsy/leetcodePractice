import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class detectingCycleInUnDirected {
    /*using dfs*/
    static ArrayList<ArrayList<Integer>> adjList;

    public static boolean isCycle(int V) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++)
            if (!vis[i])
                if (dfs(i, vis, -1))
                    return true;

        return false;
    }

    public static boolean dfs(int current, boolean[] vis, int parent) {
        vis[current] = true;
        for (Integer vertex : adjList.get(current)) {
            if (vertex != parent)
                if (vis[vertex])
                    return true;

                else if (dfs(vertex, vis, current)) return true;
        }
        return false;

    }

    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\Administrator\\Desktop\\intelliJProjects\\all\\src\\graph\\undirected.txt");

        Scanner x = new Scanner(f);
        int V = x.nextInt();
        int E = x.nextInt();
        adjList = new ArrayList<>();
        for(int i=0;i<V;i++)
            adjList.add(i,new ArrayList<>());
        for( int i =0;i<E;i++){
            int src = x.nextInt();
            int dest = x.nextInt();
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
        System.out.println(isCycle(V));

    }
}