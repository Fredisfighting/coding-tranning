package work.pansht.algorithm.hot100.round1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/09
 */
public class T46 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        dfs(nums, list);
        return ans;
    }

    void dfs(int[] nums, List<Integer> curr) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int num : nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                dfs(nums, curr);
                curr.remove(Integer.valueOf(num));
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new T46().permute(nums));
    }
}
