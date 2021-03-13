package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2020/12/15
 */
public class T55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                break;
            }
            if (nums[i] + i > max) {
                max = nums[i] + i;
            }
        }
        if (max >= nums.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
