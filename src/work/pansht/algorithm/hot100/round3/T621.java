package work.pansht.algorithm.hot100.round3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2020/12/25
 */
public class T621 {
    public int leastInterval(char[] tasks, int n) {
        int maxNum = 0;
        int maxNumCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            if (map.get(c) > maxNum) {
                maxNum = map.get(c);
                maxNumCount = 1;
            } else if (map.get(c) == maxNum) {
                maxNumCount++;
            }
        }
        int ans = Math.max((maxNum - 1) * (n + 1) + maxNumCount, tasks.length);
        return ans;
    }
}
