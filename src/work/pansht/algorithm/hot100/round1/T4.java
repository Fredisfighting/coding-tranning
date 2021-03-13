package work.pansht.algorithm.hot100.round1;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/12/18
 */
public class T4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[i + nums1.length] = nums2[i];
        }
        Arrays.sort(nums);
        if (nums.length % 2 == 1) {
            return (double)nums[nums.length / 2];
        } else {
            return (double)(nums[nums.length / 2 -1] + nums[nums.length / 2]) / 2;
        }
    }
}
