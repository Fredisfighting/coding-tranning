package work.pansht.algorithm.hot100.round1;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/12/26
 */
public class T169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
