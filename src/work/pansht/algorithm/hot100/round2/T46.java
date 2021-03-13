package work.pansht.algorithm.hot100.round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/02/27
 */
public class T46 {
    int[] nums;
    boolean[] used;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.used = new boolean[nums.length];
        dfs(new ArrayList<>());
        return ans;
    }

    void dfs(List<Integer> curr) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int n : nums) {
            if (!curr.contains(n)) {
                curr.add(n);
                dfs(curr);
                curr.remove(Integer.valueOf(n));
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new T46().permute(nums));
    }
}
