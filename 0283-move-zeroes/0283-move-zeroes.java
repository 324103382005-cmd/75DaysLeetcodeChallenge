class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0; // position to place next non-zero

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        // Step 2: Fill remaining positions with 0
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
