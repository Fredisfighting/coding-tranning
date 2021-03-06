package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2021/01/08
 */
public class T53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = -1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
