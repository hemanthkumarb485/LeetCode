class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int t = 0;
        for (int i : nums) {
            t += i;
        }
        int l = 0;
        for (int i = 0; i < n; i++) {
            int r = t - l - nums[i];
            arr[i] = Math.abs(l - r);
            l += nums[i];
        }
        return arr;
    }
}