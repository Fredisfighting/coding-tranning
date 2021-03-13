package work.pansht.algorithm.hot100.round4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Fred
 * @createTime 2020/12/31
 */
public class T207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        int[] req = new int[numCourses];
        for (int[] pre : prerequisites) {
            G[pre[0]][pre[1]] = 1;
            req[pre[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (req[i] == 0) {
                queue.add(i);
                count++;
            }
        }
        while (!queue.isEmpty()) {
            int n = queue.remove();
            for (int i = 0; i < numCourses; i++) {
                if (G[i][n] == 1) {
                    G[i][n] = 0;
                    if (--req[i] == 0) {
                        queue.add(i);
                        count++;
                    }
                }
            }
        }
        return count==numCourses;
    }
}
