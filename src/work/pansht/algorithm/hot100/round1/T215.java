package work.pansht.algorithm.hot100.round1;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/12/27
 */
public class T215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
