package work.pansht.algorithm.hot100.round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/14
 */
public class T39 {
    int[] candidates;
    int target;
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        dfs(0, 0);
        return ans;
    }

    void dfs(int start, int currSum) {
        if (currSum > target) {
            return;
        }
        if (currSum == target) {
            ans.add(new ArrayList<>(list));
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(i, currSum + candidates[i]);
            list.remove(Integer.valueOf(candidates[i]));
        }
    }
}
