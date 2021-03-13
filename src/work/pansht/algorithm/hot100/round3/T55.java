package work.pansht.algorithm.hot100.round3;

/**
 * @author Fred
 * @createTime 2020/12/23
 */
public class T55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(i + nums[i], max);
        }
        return true;
    }
}
