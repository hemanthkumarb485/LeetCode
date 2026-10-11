class Solution {
    public int sumOfSquares(int[] nums) {
        int c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            if (n % (i + 1) == 0) {
                c += a * a;
            }
        }
        return c;
    }
}