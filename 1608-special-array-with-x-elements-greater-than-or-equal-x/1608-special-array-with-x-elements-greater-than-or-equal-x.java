class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            int c = 0;
            for(int x : nums) {
                if(x >= i) {
                    c++;
                }
            }
            if(c == i) {
                return i;
            }
        }
        return -1;
    }
}