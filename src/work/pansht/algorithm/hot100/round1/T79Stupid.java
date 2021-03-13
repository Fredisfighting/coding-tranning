package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2021/01/06
 */
public class T79Stupid {
    boolean ans = false;
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    dfs(board, word, i, j, word.substring(0,1), visited);
                }
            }
        }
        return ans;
    }

    void dfs(char[][] board, String word, int l, int r, String curr, boolean[][] visited) {
        boolean outOfArea = l < 0 || l >= board.length || r < 0 || r >= board[0].length || visited[l][r];
        if (outOfArea|| !word.contains(curr)) {
            return;
        }
        if (word.equals(curr)) {
            ans = true;
            return;
        }
        visited[l][r] = true;
        if (l > 0) {
            dfs(board, word, l - 1, r, curr + board[l - 1][r], visited);
        }
        if (l < board.length - 1) {
            dfs(board, word, l + 1, r, curr + board[l + 1][r], visited);
        }
        if (r > 0) {
            dfs(board, word, l, r - 1, curr + board[l][r - 1], visited);
        }
        if (r < board[0].length - 1) {
            dfs(board, word, l, r + 1, curr + board[l][r + 1], visited);
        }
        visited[l][r] = false;
    }

    public static void main(String[] args) {
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'E', 'S'},
//                {'A', 'D', 'E', 'E'}};
//        String t = "ABCB";
//        String t = "ABCESEEEFS";
        char[][] board = {
                {'a','a','a','b'}};
        String t = "baa";
        System.out.println(new T79Stupid().exist(board, t));
    }
}
