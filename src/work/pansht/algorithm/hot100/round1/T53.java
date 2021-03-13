package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2020/12/20
 */
public class T53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : nums[i] + dp[i - 1];
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
