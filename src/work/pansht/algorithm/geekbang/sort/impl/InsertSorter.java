package work.pansht.algorithm.geekbang.sort.impl;


import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2020/09/22
 */
public class InsertSorter extends Sorter {
    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] >= nums[j - 1]) {
                    break;
                }
                count++;
                swap(nums, j, j - 1);
            }
        }
        System.out.println(count);
    }
}
