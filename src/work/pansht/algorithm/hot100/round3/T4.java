package work.pansht.algorithm.hot100.round3;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/12/26
 */
public class T4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, n = n1 + n2;
        int[] num = new int[n];
        for (int i = 0; i < n1; i++) {
            num[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            num[n1 + i] = nums2[i];
        }
        Arrays.sort(num);
        double ans;
        if (n % 2 == 0) {
            ans = (double) (num[n / 2 - 1] / 2 + num[n / 2] / 2);
        } else {
            ans = (double) (num[n / 2]);
        }
        return ans;
    }
}
