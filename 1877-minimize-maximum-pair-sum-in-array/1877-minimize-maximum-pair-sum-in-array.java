class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0; 
        int n = nums.length - 1;
        int max = 0;
        while(i < n) {
            max = Math.max(max, nums[i++] + nums[n--]);
        }
        return max;
    }
}