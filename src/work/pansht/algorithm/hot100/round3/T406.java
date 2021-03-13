package work.pansht.algorithm.hot100.round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Fred
 * @createTime 2020/12/24
 */
public class T406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        List<int[]> ansList = new ArrayList<>();
        for (int[] o : people) {
            ansList.add(o[1], o);
        }
        int[][] ans = ansList.toArray(new int[ansList.size()][]);
        return ans;
    }
}
