package work.pansht.algorithm.geekbang.sort.roundF;

import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2021/02/13
 */
public class InsertSorter extends Sorter {
    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
                swap(nums, j, j - 1);
            }
        }
    }
}
