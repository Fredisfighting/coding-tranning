package work.pansht.algorithm.hot100.round2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Fred
 * @createTime 2020/12/19
 */
public class T406 {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list = Arrays.stream(people).collect(Collectors.toList());
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
        List<int[]> anst = new ArrayList<>();
        for (int[] p : list) {
            anst.add(p[1], p);
        }
        return anst.toArray(new int[anst.size()][2]);
    }
}
