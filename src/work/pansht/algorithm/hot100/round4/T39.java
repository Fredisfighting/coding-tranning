package work.pansht.algorithm.hot100.round4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/02/09
 */
public class T39 { // 反面教材
    List<List<Integer>> ans = new ArrayList<>();
    int target;
    int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        dfs(0, new ArrayList<>(), target);
        return ans;
    }
    void dfs(int sum, List<Integer> curr, int ind){
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = ind; i < candidates.length; i++) {
            curr.add(candidates[i]);
            dfs(sum + candidates[i], curr, i);
            curr.remove(Integer.valueOf(candidates[i]));
        }
    }
    public static void main(String[] args) {
        int[] can = {2, 3, 6, 7};
        System.out.println(new T39().combinationSum(can, 7));
    }
}
