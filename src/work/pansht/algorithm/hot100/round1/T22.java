package work.pansht.algorithm.hot100.round1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/05
 */
public class T22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, 0, 0, "");
        return ans;
    }

    void dfs(int n, int lCount, int rCount, String curr) {
        if (rCount == n) {
            ans.add(curr);
            return;
        }
        if (lCount == n) {
            dfs(n, lCount, rCount + 1, curr + ')');
            return;
        }
        if (rCount < lCount) {
            dfs(n, lCount + 1, rCount, curr + '(');
            dfs(n, lCount, rCount + 1, curr + ')');
        } else if (rCount == lCount) {
            dfs(n, lCount + 1, rCount, curr + '(');
        }
    }
}
