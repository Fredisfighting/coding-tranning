package work.pansht.algorithm.hot100.round3;

/**
 * @author Fred
 * @createTime 2021/01/06
 */
public class T312 {
    public int maxCoins(int[] nums) {
        int[] nums1 = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            nums1[i + 1] = nums[i];
        }
        nums1[0] = nums1[nums.length+1] = 1;
        int[][] dp = new int[nums.length + 2][nums.length + 2];
        int ans = f(nums1, 0, nums.length + 1, dp);
        return ans;
    }

    int f(int[] nums, int l, int r, int[][] dp) {
        if (l > r - 2) {
            return 0;
        } else if (dp[l][r] != 0) {
            return dp[l][r];
        }
        int max = 0;
        for (int i = l + 1; i < r; i++) {
            int val = f(nums, l, i, dp) + f(nums, i, r, dp) + nums[l] * nums[i] * nums[r];
            if (val > max) {
                max = val;
            }
        }
        dp[l][r] = max;
        return max;
    }
}
