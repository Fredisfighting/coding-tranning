package work.pansht.algorithm.geekbang.sort.roundF;

import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2021/02/13
 */
public class BubbleSorter extends Sorter {
    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        boolean isSorted = false;
        for (int i = 0;!isSorted && i < n; i++) {
            isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    isSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}
