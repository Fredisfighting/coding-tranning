package work.pansht.algorithm.hot100.round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/13
 */
public class T22 {
    List<String> ans = new ArrayList<>();
    int length;
    public List<String> generateParenthesis(int n) {
        length = n;
        dfs(0, 0, "");
        return ans;
    }

    void dfs(int usedL, int usedR, String curr){
        if (usedL > length || usedR > length || usedL < usedR) {
            return;
        }
        if (usedR == length) {
            ans.add(curr);
            return;
        }
        dfs(usedL + 1, usedR, curr + "(");
        dfs(usedL, usedR + 1, curr + ")");
    }
}
