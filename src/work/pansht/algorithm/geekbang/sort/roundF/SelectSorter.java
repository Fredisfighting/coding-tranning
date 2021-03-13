package work.pansht.algorithm.geekbang.sort.roundF;

import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2021/02/13
 */
public class SelectSorter extends Sorter {

    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minInd = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minInd = j;
                }
            }
            swap(nums, i, minInd);
        }
    }
}
