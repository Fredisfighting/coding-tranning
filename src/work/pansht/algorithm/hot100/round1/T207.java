package work.pansht.algorithm.hot100.round1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Fred
 * @createTime 2020/12/12
 */
public class T207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        Queue<Integer> queue = new LinkedList();
        int[] depend = new int[numCourses];
        int count = 0;
        for (int[] item : prerequisites) {
            G[item[0]][item[1]] = 1;
            depend[item[0]] ++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (depend[i] == 0) {
                queue.add(i);
                count ++;
            }
        }
        while (!queue.isEmpty()) {
            int k = queue.remove();
            for (int i = 0; i < numCourses; i++) {
                if (G[i][k] > 0) {
                    G[i][k]--;
                    if (--depend[i] == 0) {
                        queue.add(i);
                        count++;
                    }
                }
            }
        }
        if (count == numCourses) {
            return true;
        } else {
            return false;
        }
    }
}
