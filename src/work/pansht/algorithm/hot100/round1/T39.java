package work.pansht.algorithm.hot100.round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/06
 */
public class T39 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, tmp, 0, 0);
        return ans;
    }
    void dfs(int[] candidates, int target, List<Integer> currList, int currSum, int start){
        if (currSum == target) {
            ans.add(new ArrayList<>(currList)); // 这里需要拷贝
            return;
        }
        if (target - currSum < candidates[start]) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            currList.add(0, candidates[i]);
            dfs(candidates, target, currList, currSum + candidates[i], i);
            currList.remove(0);
        }
    }

    public static void main(String[] args) {
        int[] cand = {2,7,6,3,5,1};
        int target = 8;
        System.out.println(new T39().combinationSum(cand, target));

    }
}
