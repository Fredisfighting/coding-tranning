package work.pansht.algorithm.geekbang.sort.impl;


import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2020/09/22
 */
public class BubbleSorter extends Sorter {
    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        boolean isSorted = false;
        for (int i = n - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    isSorted = false;
                }
            }
        }
    }
}
