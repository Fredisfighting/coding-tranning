package work.pansht.algorithm.hot100.round1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Fred
 * @createTime 2020/12/16
 */
public class T406 {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> peopleList = Arrays.stream(people).collect(Collectors.toList());
        Collections.sort(peopleList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            ans.add(peopleList.get(i)[1],peopleList.get(i));
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(new T406().reconstructQueue(people));
    }
}
