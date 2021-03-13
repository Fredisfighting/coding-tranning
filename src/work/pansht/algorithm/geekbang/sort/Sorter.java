package work.pansht.algorithm.geekbang.sort;

/**
 * @author Fred
 * @createTime 2020/09/22
 */
public abstract class Sorter {
    public abstract void sortArray(int[] nums);

    public void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
