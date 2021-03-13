package work.pansht.algorithm.geekbang.sort.impl;

import work.pansht.algorithm.geekbang.sort.Sorter;

/**
 * @author Fred
 * @createTime 2020/09/22
 */
public class SelectSorter extends Sorter {
    @Override
    public void sortArray(int[] nums) {
        int n = nums.length;
        int min;
        int count = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
                count++;
            }
            swap(nums, i, min);
        }
        System.out.println(count);
    }
}
