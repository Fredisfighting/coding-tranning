package work.pansht.algorithm.hot100.round2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2020/12/17
 */
public class T399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[][] G = new double[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                G[i][j] = -1.0;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        int ind = 0;
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String n1 = equation.get(0);
            String n2 = equation.get(1);
            if (!map.containsKey(n1)) {
                map.put(n1, ind++);
            }
            if (!map.containsKey(n2)) {
                map.put(n2, ind++);
            }
            G[map.get(n1)][map.get(n2)] = values[i];
            G[map.get(n2)][map.get(n1)] = 1/values[i];
        }
        for (int k = 0; k < ind; k++) {
            for (int i = 0; i < ind; i++) {
                for (int j = 0; j < ind; j++) {
                    if (G[i][k]!=-1 && G[k][j] !=-1) {
                        G[i][j] = G[i][k] * G[k][j];
                    }
                }
            }
        }
        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            if (!map.containsKey(query.get(0)) || !map.containsKey(query.get(1))) {
                ans[i] = -1.0;
            } else {
                ans[i] = G[map.get(query.get(0))][map.get(query.get(1))];
            }
        }
        return ans;
    }
}
