package work.pansht.algorithm.hot100.round4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/04
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
        for (int[] p : people) {
            ansList.add(p[1], p);
        }
        int[][] ans = ansList.toArray(new int[people.length][people[0].length]);
        return ans;
    }
}
