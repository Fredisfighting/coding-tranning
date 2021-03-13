package work.pansht.algorithm.hot100.round4;

/**
 * @author Fred
 * @createTime 2021/01/01
 */
public class T200 {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int l, int r, boolean[][] visited) {
        if (l < 0 || l > grid.length - 1 || r < 0 || r > grid[0].length-1 || grid[l][r] == '0' || visited[l][r]) {
            return;
        }
        visited[l][r] = true;
        dfs(grid, l - 1, r, visited);
        dfs(grid, l + 1, r, visited);
        dfs(grid, l, r - 1, visited);
        dfs(grid, l, r + 1, visited);
    }
}
