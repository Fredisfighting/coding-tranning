package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2020/12/16
 */
public class T200 {
    public int numIslands(char[][] grid) {
        int[][] visit = new int[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visit[i][j] == 0 && grid[i][j] == '1') {
                    dfs(grid, visit, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int[][] visit, int m, int n) {
        if (m < 0 || m > grid.length - 1 || n < 0 || n > grid[0].length - 1 || grid[m][n] == '0' || visit[m][n] == 1) {
            return;
        }
        visit[m][n] = 1;
        dfs(grid, visit, m, n - 1);
        dfs(grid, visit, m, n + 1);
        dfs(grid, visit, m-1, n);
        dfs(grid, visit, m+1, n);
    }
}
