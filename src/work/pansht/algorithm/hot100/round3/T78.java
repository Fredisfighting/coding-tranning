package work.pansht.algorithm.hot100.round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/18
 */
public class T78 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);
        return ans;
    }
    void dfs(int start) {
        ans.add(new ArrayList<>(curr));
        curr.add(start);
        for (int i = start + 1; i < nums.length; i++) {
            dfs(i);
        }
        curr.remove(Integer.valueOf(nums[start]));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new T78().subsets(nums));
    }
}
