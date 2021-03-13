package work.pansht.algorithm.geekbang.weChat;

/**
 * @author Fred
 * @createTime 2021/03/13
 */
public class T0103 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                s.append("%20");
            } else {
                s.append(chars[i]);
            }
        }
        return s.toString();
    }
}
