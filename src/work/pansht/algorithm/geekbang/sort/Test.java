package work.pansht.algorithm.geekbang.sort;

import work.pansht.algorithm.geekbang.sort.roundF.SelectSorter;

import java.util.Arrays;

/**
 * @author Fred
 * @createTime 2020/09/22
 */
public class Test {
    public static void main(String[] args) {
        Sorter sorter = new SelectSorter();
        int[] nums1 = {5, 2, 3, 1};
        int[] nums2 = {5,1,1,2,0,0};
        sorter.sortArray(nums1);
        sorter.sortArray(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
