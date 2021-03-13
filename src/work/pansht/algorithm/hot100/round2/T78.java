package work.pansht.algorithm.hot100.round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/13
 */
public class T78 {
    List<List<Integer>> ans;
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        this.nums = nums;
        dfs(0,new ArrayList<Integer>());
        return ans;
    }

    void dfs(int start, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            dfs(i+1, curr);
            curr.remove(Integer.valueOf(nums[i]));
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new T78().subsets(nums));
    }
}
