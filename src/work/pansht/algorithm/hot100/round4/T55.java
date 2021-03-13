package work.pansht.algorithm.hot100.round4;

/**
 * @author Fred
 * @createTime 2021/01/03
 */
public class T55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            } else {
                if (i + nums[i] > max) {
                    max = i+nums[i];
                }
            }
        }
        return true;
    }
}
