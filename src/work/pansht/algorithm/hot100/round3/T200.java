package work.pansht.algorithm.hot100.round3;

/**
 * @author Fred
 * @createTime 2020/12/21
 */
public class T200 {
    public int numIslands(char[][] grid) {
        int M = grid.length;
        int N = grid[0].length;
        boolean[][] visit = new boolean[M][N];
        int ans = 0;
        for (int m = 0; m < M; m++) {
            for (int n = 0; n < N; n++) {
                if (grid[m][n] == 1 && !visit[m][n]) {
                    dfs(grid, m, n, visit);
                    ans++;
                }
            }
        }
        return ans;
    }

    void dfs(char[][] grid, int m, int n, boolean[][] visit) {
        if (m < 0 || m > grid.length || n < 0 || n > grid[0].length || grid[m][n] == '0' || visit[m][n] == true) {
            return;
        }
        visit[m][n] = true;
        dfs(grid, m, n - 1, visit);
        dfs(grid, m, n + 1, visit);
        dfs(grid, m - 1, n, visit);
        dfs(grid, m + 1, n, visit);
    }
}
