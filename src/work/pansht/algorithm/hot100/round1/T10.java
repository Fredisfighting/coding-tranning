package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2021/01/03
 */
public class T10 {
    public boolean isMatch(String s, String p) {
        int sl = 0, pl = 0;
        for (; sl < s.length() && pl < p.length();) {
            // 拿右边去匹配左边
            // 右边不是*的情况
            if (pl < p.length()-1 && p.charAt(pl + 1) != '*' || pl == p.length()-1) {
                if (p.charAt(pl) != '.' && p.charAt(pl) != s.charAt(sl)) {
                    return false;
                } else {
                    sl++;
                    pl++;
                }
            } else {
                if (p.charAt(pl) == '.') { //.*
                    if (pl == p.length() - 2) {
                        return true;
                    } else {
                        while (sl < s.length() && s.charAt(sl) != p.charAt(pl + 2)) {
                            sl++;
                        }
                        pl += 2;
                    }
                }else if (p.charAt(pl) != s.charAt(sl)) { // *=0
                    pl += 2;
                    continue;
                } else {
                    while (sl < s.length() && s.charAt(sl) == p.charAt(pl)) { // 初解错误
                        sl++;
                    }
                    pl += 2;
                    if (pl <= p.length() - 1 && p.charAt(pl) == p.charAt(pl - 2)) {
                        pl++;
                    }
                }
            }
        }
        if (sl != s.length() || pl!=p.length()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "aa", p = "a*";
        System.out.println(new T10().isMatch(s,p));
    }
}

// aba .*c
// aaa a*a
// "aaa" "a*c*a"
