package work.pansht.algorithm.hot100.round1;

/**
 * @author Fred
 * @createTime 2020/12/28
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length - 1, r = 0;
        while (l >=0 && r <matrix[0].length) {
            if (matrix[l][r] == target) {
                return true;
            } else if (matrix[l][r] > target) {
                l--;
            } else {
                r++;
            }
        }
        return false;
    }
}
