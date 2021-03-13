package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2020/12/18
 */
public class T55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            if (max + nums[i] > max) {
                max = max + nums[i];
            }
        }
        return true;
    }
}
