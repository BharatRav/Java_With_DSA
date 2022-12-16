package Arrays.Leetcode;
//Letcode Link:-https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n =matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new  boolean[n];

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (matrix[i][j]==0) {
                    rows[i] =true;
                    cols[j] =true;
                }
            }
        }

        for (int i=0;i< rows.length;i++) {
            if (rows[i]) {
                for (int j=0;j<n;j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int j=0;j< cols.length;j++) {
            if (cols[j]) {
                for (int i=0;i<m;i++) {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
