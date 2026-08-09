class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }

        int n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == matrix[mid / n][mid % n]) {
                return true;
            }

            if (target < matrix[mid / n][mid % n]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}