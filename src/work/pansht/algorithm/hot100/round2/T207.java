package work.pansht.algorithm.hot100.round2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Fred
 * @createTime 2020/12/15
 */
public class T207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        int[] dependCount = new int[numCourses];
        for (int[] p : prerequisites) {
            G[p[0]][p[1]] = 1;
            dependCount[p[0]] ++;
        }
        Queue<Integer> depend = new LinkedList<>();
        int total = 0;
        for (int i = 0; i < numCourses; i++) {
            if (dependCount[i] == 0) {
                depend.add(i);
                total ++;
            }
        }
        while (!depend.isEmpty()) {
            int num = depend.remove();
            for (int i = 0; i < numCourses; i++) {
                if (G[i][num] > 0) {
                    --G[i][num];
                    if ( --dependCount[i]== 0) {
                        depend.add(i);
                        total ++;
                    }
                }
            }
        }
        if (total < numCourses) {
            return false;
        } else {
            return true;
        }
    }
}
