package work.pansht.algorithm.hot100.round1;

import java.util.*;

/**
 * @author Fred
 * @createTime 2020/12/17
 */
public class T621 {
    public int leastInterval(char[] tasks, int n) {
        int max = 0;
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : tasks) {
            if (! map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                maxCount = 1;
            } else if (map.get(c) == max) {
                maxCount ++;
            }
        }
        return Math.max((max - 1) * (n + 1) + maxCount, tasks.length);
    }
}
