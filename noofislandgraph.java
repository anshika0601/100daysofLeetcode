import java.util.*;

public class noofislandgraph {

    public static boolean isSafe(char[][] graph, boolean[][] vis, int m, int n, int i, int j) {
        return (i >= 0 && i < m && j >= 0 && j < n && graph[i][j] == '1' && !vis[i][j]);
    }

    public static void dfs(char[][] graph, boolean[][] vis, int i, int j) {
        int m = graph.length;
        int n = graph[0].length;

        vis[i][j] = true;

        int[][] dir = { {0,1}, {0,-1}, {1,0}, {-1,0} };

        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (isSafe(graph, vis, m, n, x, y)) {
                dfs(graph, vis, x, y);
            }
        }
    }

    public static int count(char[][] graph) {
        int m = graph.length;
        int n = graph[0].length;
        int count = 0;
        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == '1' && !vis[i][j]) {
                    dfs(graph, vis, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] graph = {
            { '1', '1', '1', '0' },
            { '1', '1', '0', '1' }
        };

        System.out.println(count(graph));
    }
}
