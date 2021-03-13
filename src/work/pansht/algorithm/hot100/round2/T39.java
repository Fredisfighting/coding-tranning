package work.pansht.algorithm.hot100.round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/09
 */
public class T39 {
    int[] candidates;
    int target;
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.ans = new ArrayList<>();
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(this.candidates);
        List<Integer> currentList = new ArrayList<>();
        dfs(currentList, 0, 0);
        return ans;
    }

    void dfs(List<Integer> currentList, int currentSum, int ind) {
        if (currentSum == target) {
            ans.add(new ArrayList<>(currentList));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = ind; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            dfs(currentList, currentSum + candidates[i], i);
            currentList.remove(Integer.valueOf(candidates[i]));
        }
    }

    public static void main(String[] args) {
        int[] can = {2, 3, 6, 7};
        System.out.println(new T39().combinationSum(can, 7));
    }
}
