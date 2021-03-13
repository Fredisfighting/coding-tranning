package work.pansht.algorithm.hot100.round2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2021/01/14
 */
public class T169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return nums[0];
    }
}
