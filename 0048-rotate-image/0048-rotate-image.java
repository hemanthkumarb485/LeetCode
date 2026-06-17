class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;
            while (left < right) {
                int temp = trans[i][left];
                trans[i][left] = trans[i][right];
                trans[i][right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = trans[i][j];
            }
        }
    }
}