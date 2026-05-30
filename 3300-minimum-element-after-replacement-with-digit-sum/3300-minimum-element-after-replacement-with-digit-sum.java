class Solution {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            int a = nums[i];
            while (a > 0) {
                c += a % 10;
                a /= 10;
            }
            nums[i] = c;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}