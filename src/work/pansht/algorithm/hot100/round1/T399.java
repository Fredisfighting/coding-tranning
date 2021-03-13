package work.pansht.algorithm.hot100.round1;

import java.util.*;

/**
 * @author Fred
 * @createTime 2020/12/14
 */
public class T399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // 第一步：构造图
        Double[][] G = new Double[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                G[i][j] = -1.0;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String l = equation.get(0);
            String r = equation.get(1);
            if (!map.containsKey(l)) {
                map.put(l, count++);
                G[map.get(l)][map.get(l)] = 1.0;
            }
            if (!map.containsKey(r)) {
                map.put(r, count++);
                G[map.get(r)][map.get(r)] = 1.0;
            }
            G[map.get(l)][map.get(r)] = values[i];
            G[map.get(r)][map.get(l)] = 1 / values[i];
        }
        // 第二步：floyd
        for (int k = 0; k < count; k++) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (G[i][k]>0 && G[k][j] > 0) {
                        G[i][j] = G[i][k] * G[k][j];
                    }
                }
            }
        }
        int Q = queries.size();
        double[] ans = new double[Q];
        for (int i = 0; i < Q; i++) {
            List<String> query = queries.get(i);
            if (!map.containsKey(query.get(0)) || !map.containsKey(query.get(1))) {
                ans[i] = -1;
            } else {
                ans[i] = G[map.get(query.get(0))][map.get(query.get(1))];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[][] l = new String[][]{{"a","b"},{"b","c"},{"bc","cd"}};
        List<List<String>> equations = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            equations.add(Arrays.asList(l[i]));
        }
        double[] values = new double[]{1.5,2.5,5.0};
        List<List<String>> queries = equations;
        double[] ans = new T399().calcEquation(equations, values, queries);
        for (double d : ans) {
            System.out.println(d);
        }
    }
}

// 错误记录
// [["a","b"],["b","c"],["bc","cd"]]
//        [1.5,2.5,5.0]
//        [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
