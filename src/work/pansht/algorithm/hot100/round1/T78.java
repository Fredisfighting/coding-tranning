package work.pansht.algorithm.hot100.round1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/09
 */
public class T78 {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        dfs(nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    void dfs(int[] nums, List<Integer> curr,int ind) {
        ans.add(new ArrayList<>(curr));
        for (int i = ind; i < nums.length; i++) {
            curr.add(nums[i]);
            dfs(nums, curr, i + 1);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new T78().subsets(nums));
    }
}
