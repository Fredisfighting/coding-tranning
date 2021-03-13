package work.pansht.algorithm.hot100.round4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fred
 * @createTime 2021/02/07
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
        if (digits.isEmpty()) {
            return ans;
        }
        this.digits = digits;
        dfs(0, "");
        return ans;
    }

    void dfs(int start, String curr) {
        if (start >= digits.length()) {
            ans.add(curr);
            return;
        }
        char[] options = keyMap.get(digits.charAt(start));
        for (char c : options) {
            dfs(start + 1, curr + c);
        }
    }
}
