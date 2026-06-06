class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int a = nums[i];
            for (int j : nums) {
                if ((j * -1) == a) {
                    return a;
                }
            }
        }
        return -1;
    }
}