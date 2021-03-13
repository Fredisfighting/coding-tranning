package work.pansht.algorithm.hot100.round2;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/12/21
 */
public class T4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, n = n1 + n2;
        int[] nums = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            nums[i + n1] = nums2[i];
        }
        Arrays.sort(nums);
        return nums.length % 2 == 0 ? nums[n / 2] : (nums[n / 2 - 1] + nums[n / 2]) / 2;
    }
}
