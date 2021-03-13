package work.pansht.algorithm.hot100.round3;

/**
 * @author Fred
 * @createTime 2021/01/15
 */
public class T79 {
    char[][] board;
    String word;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int start, int l, int r) {
        if (start == word.length()) {
            return true;
        }
        boolean inArea = l >= 0 && r >= 0 && l < board.length && r < board[0].length;
        if (!inArea || visited[l][r] || word.charAt(start)!=board[l][r]) {
            return false;
        }
        visited[l][r] = true;
        boolean v = dfs(start + 1, l - 1, r) ||
                dfs(start + 1, l + 1, r) ||
                dfs(start + 1, l, r + 1) ||
                dfs(start + 1, l, r - 1);
        visited[l][r] = false;
        return v;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String t = "SEE";
        System.out.println(new T79().exist(board, t));
    }
}
