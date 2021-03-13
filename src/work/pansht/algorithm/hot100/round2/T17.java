package work.pansht.algorithm.hot100.round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2021/01/07
 */
public class T17 {
    Map<Character, char[]> keyMap = new HashMap<>();
    {
        keyMap.put('2', new char[]{'a','b','c'});
        keyMap.put('3', new char[]{'d','e','f'});
        keyMap.put('4', new char[]{'g', 'h', 'i'});
        keyMap.put('5', new char[]{'j', 'k', 'l'});
        keyMap.put('6', new char[]{'m', 'n', 'o'});
        keyMap.put('7', new char[]{'p', 'q', 'r', 's'});
        keyMap.put('8', new char[]{'t', 'u', 'v'});
        keyMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    }
    List<String> ans = new ArrayList<>();
    String digits;

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        if (digits.length() == 0) {
            return ans;
        }
        dfs(0, "");
        return ans;
    }

    void dfs(int ind, String curr) {
        if (ind == digits.length()) {
            ans.add(curr);
            return;
        }
        char[] chars = keyMap.get(digits.charAt(ind));
        for (char c : chars) {
            dfs(ind+1, curr+c);
        }
    }
}
