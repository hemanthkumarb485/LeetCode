class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            int n = nums[i];
            while(n != 0) {
                int temp = n % 10;
                a = a + temp;
                n /= 10;
            }
            if (a == i) {
                return i;
            }
        }
        return -1;
    }
}