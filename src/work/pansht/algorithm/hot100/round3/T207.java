package work.pansht.algorithm.hot100.round3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Fred
 * @createTime 2020/12/20
 */
public class T207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        int[] dependCount = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            G[prerequisite[0]][prerequisite[1]] = 1;
            dependCount[prerequisite[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (dependCount[i] == 0) {
                queue.add(i);
                count++;
            }
        }
        while (!queue.isEmpty()) {
            int ind = queue.remove();
            for (int i = 0; i < numCourses; i++) {
                if (G[i][ind] == 1) {
                    G[i][ind] = 0;
                    if (--dependCount[i] == 0) {
                        queue.add(i);
                        count++;
                    }
                }
            }
        }
        return count == numCourses;
    }
}
