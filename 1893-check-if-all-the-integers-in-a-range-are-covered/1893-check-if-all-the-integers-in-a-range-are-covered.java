class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean bool = false;
            for (int[] arr : ranges) {
                if(arr[0] <= i && i <= arr[1]) {
                    bool = true;
                    break;
                }
            }
            if(!bool) {
                return false;
            }
        }
        return true;
    }
}