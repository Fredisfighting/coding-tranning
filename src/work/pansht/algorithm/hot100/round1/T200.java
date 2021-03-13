package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2020/12/13
 */
public class T200 {
    public int numIslands(char[][] grid) {
        int L = grid.length, R = grid[0].length;
        int[][] visited = new int[L][R];
        int count = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < R; j++) {
                if (visited[i][j] == 0 && grid[i][j] == '1') {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int[][] visited, int m, int n) {
        int l = grid.length, r = grid[0].length;
        if (m < 0 || m > l - 1 || n < 0 || n > r - 1 || grid[m][n] == '0' || visited[m][n] == 1) {
            return;
        }
        visited[m][n] = 1;
        dfs(grid, visited, m - 1, n);
        dfs(grid, visited, m + 1, n);
        dfs(grid, visited, m, n - 1);
        dfs(grid, visited, m, n + 1);
    }
}
