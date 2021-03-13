package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2020/12/29
 */
public class T312 {
    public int maxCoins(int[] nums) {
        int[][] dp = new int[nums.length+2][nums.length+2];
        int[] nums1 = new int[nums.length + 2];
        nums1[0] = nums1[nums1.length-1] = 1;
        for (int i = 0; i < nums.length; i++) {
            nums1[i + 1] = nums[i];
        }
        int ans = f(nums1, dp, 0, nums1.length - 1);
        return ans;
    }
    // l/r为开区间边界
    int f(int[] nums, int[][] dp, int l, int r) {
        if (l >= r - 1) {
            return 0;
        }
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        int max = 0;
        for (int i = l + 1; i < r; i++) {
            int tmp = f(nums, dp, l, i) + nums[l] * nums[i] * nums[r] + f(nums, dp, i, r);
            if (tmp > max) {
                max = tmp;
            }
        }
        dp[l][r] = max;
        return max;
    }
    public static void main(String[] args) {
//        int[] nums = {9,76,64,21,97,60};
        int[] nums = {8,2,6,8,9,8,1,4,1,5,3,0,7,7,0,4,2,2,5};
        int ans = new T312().maxCoins(nums);
        System.out.println(ans);
    }
}
