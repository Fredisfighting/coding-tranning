package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2021/01/01
 */
public class T312 {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+2][n+2];
        int[] nums1 = new int[n + 2];
        nums1[0] = nums1[n+1] = 1;
        for (int i = 0; i < n; i++) {
            nums1[i + 1] = nums[i];
        }
        return f(nums1, dp, 0, n+1);
    }

    private int f(int[] nums,int[][] dp, int l, int r) {
        if (l >= r - 1) {
            return 0;
        }
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        int max = 0;
        for (int i = l + 1; i < r; i++) {
            int countI = f(nums,dp, l, i) + nums[l] * nums[i] * nums[r] + f(nums,dp, i, r);
            if (countI > max) {
                max = countI;
            }
        }
        dp[l][r] = max;
        return max;
    }
}
