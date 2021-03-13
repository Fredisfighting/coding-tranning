package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2021/01/10
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
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int l, int r,int ind) {
        if (!inArea(l,r)) {
            return false;
        }
        if (visited[l][r] || board[l][r] != word.charAt(ind)) {
            return false;
        }
        if (ind == word.length()-1) {
            return true;
        }
        visited[l][r] = true;
        boolean t =  dfs(l - 1, r, ind+1)
                || dfs(l + 1, r, ind+1)
                || dfs(l, r - 1, ind+1)
                || dfs(l, r + 1, ind+1);
        visited[l][r] = false;
        return t;
    }

    boolean inArea(int l, int r) {
        return l >= 0 && l < board.length && r >= 0 && r < board[0].length;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String t = "ABCB";
        System.out.println(new T79().exist(board, t));
    }
}
