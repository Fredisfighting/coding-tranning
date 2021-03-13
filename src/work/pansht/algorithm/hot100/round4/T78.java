package work.pansht.algorithm.hot100.round4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/03/01
 */
public class T78 {
    private int[] nums;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0, new ArrayList<>());
        return ans;
    }

    void dfs(int ind, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        for (int i = ind; i < nums.length; i++) {
            curr.add(nums[i]);
            dfs(i+1, curr);
            curr.remove(Integer.valueOf(nums[i]));
        }
    }
}
