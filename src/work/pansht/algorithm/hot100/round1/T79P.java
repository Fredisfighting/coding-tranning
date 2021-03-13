package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2021/01/06
 */
public class T79P {
    boolean ans = false;
    char[][] board;
    String word;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(i, j,0);
            }
        }
        return ans;
    }

    void dfs(int l, int r, int ind) {
        boolean outOfArea = l < 0 || l >= board.length || r < 0 || r >= board[0].length || visited[l][r] || ind > word.length();
        if (outOfArea|| word.charAt(ind) != board[l][r]) {
            return;
        }
        if (ind == word.length()-1 && word.charAt(ind) == board[l][r]) {
            ans = true;
            return;
        }
        visited[l][r] = true;
        dfs(l - 1, r,ind+1);
        dfs(l + 1, r,ind+1);
        dfs(l, r - 1,ind+1);
        dfs(l, r + 1,ind+1);
        visited[l][r] = false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}};
        String t = "ABCB";
//        String t = "ABCESEEEFS";
//        char[][] board = {
//                {'A'}};
//        String t = "B";
        System.out.println(new T79P().exist(board, t));
    }
}
