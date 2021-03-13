package work.pansht.algorithm.hot100.round4;

/**
 * @author Fred
 * @createTime 2021/02/27
 */
public class T79 {
    char[][] board;
    String word;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.visited = new boolean[board.length][board[0].length];
        boolean ans = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int index, int x, int y) {
        if (index == word.length()) {
            return true;
        }
        if (!inArea(x, y) || visited[x][y] || word.charAt(index) != board[x][y]) {
            return false;
        }
        visited[x][y] = true;
        boolean a = dfs(index + 1, x - 1, y) || dfs(index + 1, x + 1, y) ||
                dfs(index + 1, x, y - 1) || dfs(index + 1, x, y + 1);
        visited[x][y] = false;
        return a;
    }

    boolean inArea(int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }
        return true;
    }
}
