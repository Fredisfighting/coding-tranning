package work.pansht.algorithm.hot100.round3;

/**
 * @author Fred
 * @createTime 2021/01/05
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int l = matrix.length-1, r = 0 ; l >= 0 && r < matrix[0].length; ) {
            if (matrix[l][r] > target) {
                l--;
            } else if (matrix[l][r] < target) {
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}
