package work.pansht.algorithm.hot100.round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/02/07
 */
public class T22 {
    List<String> ans = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs("", 0);
        return ans;
    }

    void dfs(String curr, int usedL) {
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }
        if (usedL <= curr.length() - usedL) {
            dfs(curr + "(", usedL + 1);
        } else if (usedL == n) {
            dfs(curr + ")", usedL);
        } else {
            dfs(curr + "(", usedL + 1);
            dfs(curr + ")", usedL);
        }
    }

    public static void main(String[] args) {
        System.out.println(new T22().generateParenthesis(3));
    }
}
