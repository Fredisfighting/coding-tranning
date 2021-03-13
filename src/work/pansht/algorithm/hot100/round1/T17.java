package work.pansht.algorithm.hot100.round1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2021/01/04
 */
public class T17 {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return ans;
        }
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        dfs(digits, map, 0, "");
        return ans;
    }

    void dfs(String digits, Map<Character, char[]> map, int ind, String curr) {
        if (curr.length() == digits.length()) {
            ans.add(curr);
            return;
        }
        char s = digits.charAt(ind);
        char[] chars = map.get(s);
        for (char c : chars) {
            dfs(digits, map, ind + 1, curr + c);
        }
    }

    public static void main(String[] args) {
        List<String> a = new T17().letterCombinations("23");
        System.out.println(a);
    }
}
