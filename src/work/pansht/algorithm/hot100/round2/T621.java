package work.pansht.algorithm.hot100.round2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2020/12/20
 */
public class T621 {
    public int leastInterval(char[] tasks, int n) {
        // 分两种情况，n很大(填充)和n很小(直排)
        Map<Character, Integer> map = new HashMap<>();
        int maxTimes = 1;
        int maxCount = 1;
        for (char c : tasks) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int times = map.get(c) + 1;
                if (times == maxTimes) {
                    maxCount++;
                }else if (times > maxTimes) {
                    maxTimes = times;
                    maxCount = 1;
                }
                map.put(c, times);
            }
        }
        int ans = Math.max(tasks.length, (maxTimes - 1) * (n + 1) + maxCount);
        return ans;
    }
}
