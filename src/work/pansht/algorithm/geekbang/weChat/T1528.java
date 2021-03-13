package work.pansht.algorithm.geekbang.weChat;

/**
 * @author Fred
 * @createTime 2021/03/13
 */
public class T1528 {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            c[indices[i]] = chars[i];
        }
        return String.valueOf(c);
    }
}
