class Solution {
    public int dominantIndex(int[] nums) {
        int c = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++) {
            if(c < nums[i]) {
                c = nums[i];
                index = i;
            }
        }
        int b = nums.length;
        for(int i = 0;i < nums.length;i++) {
            int a = 2 * nums[i];
            if(i != index && c < a) {
                return -1;
            }
        }
        return index;
    }
}