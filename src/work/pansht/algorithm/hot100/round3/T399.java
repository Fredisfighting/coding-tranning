package work.pansht.algorithm.hot100.round3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2020/12/22
 */
public class T399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[][] G = new double[20][20];
        Map<String, Integer> map = new HashMap<>();
        int ind = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                G[i][j] = -1.0;
            }
        }
        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            String s1 = eq.get(0);
            String s2 = eq.get(1);
            if (!map.containsKey(s1)) {
                map.put(s1, ind++);
            }
            if (!map.containsKey(s2)) {
                map.put(s2, ind++);
            }
            G[map.get(s1)][map.get(s2)] = values[i];
            G[map.get(s2)][map.get(s1)] = 1/values[i];
        }
        for (int k = 0; k < ind; k++) {
            for (int i = 0; i < ind; i++) {
                for (int j = 0; j < ind; j++) {
                    if (G[i][k] != -1 && G[k][j] != -1) {
                        G[i][j] = G[i][k] * G[k][j];
                    }
                }
            }
        }
        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> qu = queries.get(i);
            if (!map.containsKey(qu.get(0)) || !map.containsKey(qu.get(1))) {
                ans[i] = -1;
            } else {
                ans[i] = G[map.get(qu.get(0))][map.get(qu.get(1))];
            }
        }
        return ans;
    }
}
