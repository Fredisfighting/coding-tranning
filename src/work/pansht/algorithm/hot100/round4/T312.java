package work.pansht.algorithm.hot100.round4;

/**
 * @author Fred
 * @createTime 2021/01/17
 */
public class T312 {
    int[][] dp;
    int[] numsN;
    public int maxCoins(int[] nums) {
        int n = nums.length;
        dp = new int[n + 2][n + 2];
        numsN = new int[n + 2];
        numsN[0] = numsN[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            numsN[i + 1] = nums[i];
        }
        return f(0, n + 1);
    }
    int f(int l, int r) {
        if (l > r - 2) {
            return 0;
        }
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        int max = 0;
        for (int i = l+1; i < r; i++) {
            int tmp = f(l, i) + numsN[l] * numsN[i] * numsN[r] + f(i, r);
            max = Math.max(max, tmp);
        }
        dp[l][r] = max;
        return max;
    }
}
