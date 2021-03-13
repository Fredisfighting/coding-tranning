package work.pansht.algorithm.hot100.round2;

/**
 * @author Fred
 * @createTime 2020/12/31
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = matrix.length - 1, j = 0; i >= 0 && j < matrix[0].length; ) {
            if (target > matrix[i][j]) {
                j++;
            } else if (target < matrix[i][j]) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}
